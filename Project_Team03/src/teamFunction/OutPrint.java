package teamFunction;

import java.util.ArrayList;
import java.util.Scanner;

import teamDTO.PlayerDTO;
	
//���
public class OutPrint {
	static boolean cout = true;
	static String login = "";
	Scanner sc = new Scanner(System.in);
	TeamPlayer tp = new TeamPlayer();
	FileDB db = new FileDB();
	Match mt = new Match();
	//���� �α��� �ϴ� �Լ�
	public void login_OutPrint(){
		while (true) {
			
		if(login.equals("")){
			
		System.out.println("--------------------------------");
		System.out.println("�α��� ȭ��");
		System.out.print("���̵� �Է� : ");
		String id = sc.nextLine();
		System.out.print("��� �Է� : ");
		String pw = sc.nextLine();
		System.out.println("--------------------------------");
		if (tp.login_Check(id, pw)) {
			System.out.println("�α��� ����");
			login = id;
			manager_OutPrint();
		} else {
			System.out.println("�α��� ����");
		}
		}else{
			manager_OutPrint();
		}
		}
	}
	
	public void manager_OutPrint(){
			System.out.println("--------------------------------");
			System.out.println("1.��������");
			System.out.println("2.�������");
			System.out.println("3.������");
			System.out.println("4.�α׾ƿ�");
			System.out.println("5.����");
			System.out.println("--------------------------------");
			int select = Integer.parseInt(sc.nextLine());
			switch (select) {
			case 1:
				
				playerlist_Outprint();
				player_OutPrint();
				break;
			case 2:
				
				schedule_OutPrint();
				break;
			case 3:
				result_OutPrint();
				break;
			case 4 :
				login ="";
				break;
			case 5:
				System.out.println("�ý����� �����մϴ�.");
				System.exit(10);
				break;
			case 6:
				tp.game_restart2();//������ �� Ʈ��
			default:
				System.out.println("�߸��Է��߽��ϴ�.");
				break;
			}
	}
	//���� ���� ȭ��(���� ���, ���� ����)
	public void player_OutPrint(){
	
		System.out.println("���� ���� ȭ��");
		System.out.println("1. �������");
		System.out.println("2. ��������");
		System.out.println("3. ���� ���� ��ü");
		int select = Integer.parseInt(sc.nextLine());
		if(select == 1){
			playerRegister_OutPrint();
		}else if(select == 2){
			playerDelete_OutPrint();
		}else if(select == 3){
			playerlist_Outprint();
			player_Change_OutPrint();
		}else{
			tp.keyplayer_Select(login);
		}
	}
	//���� ��� �ϴ� ȭ��(�̸�, ���ȣ, ������ �Է�)
	public void playerRegister_OutPrint(){
		System.out.println("���� ��� ȭ��");
		System.out.print("���� �̸� = ");
		String name = sc.nextLine();
		System.out.print("���� ���ȣ = ");
		int nober = Integer.parseInt(sc.nextLine());
		System.out.print("���� ������ = ");
		String position = sc.nextLine();
		if(tp.player_Register(name, nober, position,login)){
			System.out.println("���� ��� ����");
		} else{
			System.out.println("�Է��� ���ȣ�� ������ �ִ� ������ �ֽ��ϴ�.");
		}
	}
	//���� ���� �ϴ� ȭ��(�̸�, ���ȣ �Է�)
	public void playerDelete_OutPrint(){
		System.out.println("���� ���� ȭ��");
		System.out.print("���� �̸� = ");
		String name = sc.nextLine();
		System.out.print("���� ���ȣ = ");
		int nober = Integer.parseInt(sc.nextLine());
		if(tp.player_Delete(name, nober ,login)){
			System.out.println("���� ���� ����");
		} else{
			System.out.println("�̸��� ���ȣ�� ��Ȯ�ϰ� �Է�");
		}
	}
	public void player_Change_OutPrint(){
		System.out.println("���� ��ü ȭ��");
		System.out.print("���� ���� �̸� = ");
		String keyplayername = sc.nextLine();
		System.out.print("�ĺ� ���� �̸� = ");
		String backupname = sc.nextLine();
		tp.player_Change(keyplayername, backupname, login);
	}
	
	public void schedule_OutPrint(){
		//��� ���� ��� �ϴ� �Լ� ����
		//����Ȯ�� ��� ����
		ArrayList<String> array =new ArrayList<>();
		array = db.math_Reader();
		if(!cout && array.size()==8){
			schedule_OutPrint2(array);
		}else if (array.size() == 4) {
		    System.out.println("===========4�� ����Ʈ =========");
		    schedule_OutPrint2(array);
		}else if(array.size() == 2){
		    System.out.println("===========����� ����Ʈ =========");
		    schedule_OutPrint2(array);
		}
		if(cout && array.size()==8 || array.size() ==1 ){
			cout = false;
			thread_t t = new thread_t();
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			db.match_Writer(mt.match_First());
			db.playerDBout();
			return;
		}
		
		for(int i=0; i<db.teamAll.size() ;i++){
			if(db.teamAll.get(i).getTeamName().equals(login)){
				if(!db.teamAll.get(i).isRegister()){
					y_n();
					return;
				}
			}
		}
		
	}
	public void y_n(){
		System.out.println("���� �Ͻðڽ��ϱ�? (Y or N)");
		String ck = sc.nextLine();
		switch (ck) {
		case "Y":
			tp.game_start(login);
			System.out.println("����̿Ϸ� ����ϴ�.");
			db.playerDBout();
			break;
		case "N":
			break;
		default:
			break;
		}
	}
	
	
	
	//�ִ� ����ϴ� �� �ѷ��ִ� �Լ�
	public void schedule_OutPrint2(ArrayList<String> array){
	      for (int i = 0; i <array.size() ; i += 2) {
	         System.out.println("    " + array.get(i) + "vs" + array.get(i + 1));
	      }
	}
	public void result_OutPrint(ArrayList<String> array){
		for (int i = 0; i <array.size() ; i += 2) {
			System.out.println("    " + array.get(i) + "  " + array.get(i + 1));
		}
	}
	
	public void result_OutPrint(){
		//��� ��� �ϴ� �Լ� ����
		
		ArrayList<String> array =new ArrayList<>();
		ArrayList<String> winarry = new ArrayList<>();
		db.playerDBin();
		if(tp.game_readyCk()){
		array = db.math_Reader();
		if(array.size()==8){
			System.out.println("========���� ����Ʈ =======");
			schedule_OutPrint2(array);
			System.out.println("========8�� �¸� ��� ======");
			winarry = mt.quarter_Final(array);
			result_OutPrint(winarry);
			tp.game_restart(winarry);
			db.match_Writer(winarry);
		}else if (array.size() == 4) {
			System.out.println("========���� ����Ʈ =======");
			schedule_OutPrint2(array);
		    System.out.println("===========4�� �¸� ��� =========");
		    winarry = mt.quarter_Final(array);
		    result_OutPrint(winarry);
		    tp.game_restart(winarry);
			db.match_Writer(winarry);
		}else if(array.size() == 2){
		    System.out.println("===========��� ����Ʈ =========");
		    schedule_OutPrint2(array);
		    System.out.println("===========��� ����� =========");
		    winarry = mt.quarter_Final(array);
		    cout =true;
		    System.out.println(winarry.get(0));
		    tp.game_restart(winarry);
		    db.match_Writer(winarry);
		}
		}else {
			System.out.println("�ٸ� ������ ���� �غ� �ȵǾ����ϴ�.");
		}
	}
	
	//���� ���� �Ҿ� ���� �Լ�
	public void playerlist_Outprint(){
		 ArrayList<PlayerDTO> a = tp.player_array(login);
		 System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		 System.out.println("@@@@@@@@@@@@@@@@@@@@���� ����Ʈ@@@@@@@@@@@@@@@@@@@@");
		for(PlayerDTO c : a){
			System.out.println(c.toString());
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}
}