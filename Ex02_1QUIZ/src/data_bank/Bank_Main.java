package data_bank;
 
import java.util.Scanner;
 
public class Bank_Main {
    static int memberSu;
    static Bank_member [] lastmd = new Bank_member[]{ new Bank_member()};
    static Bank_member loginmd =new Bank_member();
 
    public static void main(String[] args) {
        // ȸ������ �Ա� ��� ����Ȯ�� �����Ա� ����
        Scanner sc = new Scanner(System.in);
        boolean login = false;
   re_st: while (true) {
            System.out.println("@@@@@@@@�ȳ��ϼ��� 3�� �����Դϴ�.@@@@@@@@");
            int choice = 0;
            if (!login) {
                System.out.println("1.ȸ������ 2.�α��� 3.�Ա� 4.��� 5.�����Ա� 6.������� 7.����");
                choice = Integer.parseInt(sc.nextLine());
            } else {
                System.out.println("1.ȸ������ 2.�α׾ƿ� 3.�Ա� 4.��� 5.�����Ա� 6.������� 7.����");
                choice = Integer.parseInt(sc.nextLine());
            }
      re_sw :switch (choice) {
            case 1: // ȸ������
                if (login) {
                    System.out.println("�̹� ȸ���� �Ǿ� �ֽ��ϴ�.");
                    break;
                }
//                Bank_member mb = memberdata();
                System.out.println("�̸��� �����Դϱ�?:");
                String name = sc.nextLine();
                System.out.println("��й�ȣ�� �����Դϱ�?");
                String pass = sc.nextLine();
                System.out.println("�� �Ա��� �ݾ��� �־� �ּ���");
                int money = Integer.parseInt(sc.nextLine());
                memberSu++;
                //ȸ������ �÷� ����
                Bank_member[] mb = new Bank_member[memberSu];
                	for(int i=0; i<mb.length;i++){
                	if(memberSu == 1 ){
                		Bank_member mbmix = new Bank_member();
                		mbmix.memberInSert(name, pass, money, accountRandom());
                		System.out.println(mbmix.getName());
                		mb[0] = mbmix;
                		loginmd = mb[0];
                    	lastmd = mb;
                    	login = true;
                		}else {
                			mb = lastmd;
                			if(i==mb.length-1){
                				Bank_member mbmix = new Bank_member();
                        		mbmix.memberInSert(name, pass, money);
                        		System.out.println(mbmix.getName());
                        		mb[0] = mbmix;
                				loginmd = mb[i];
                				lastmd = mb;
                				login = true;
                			}
						}
                	for(int y =0;y<lastmd.length;y++){
                		if(checkMember(accountRandom(),lastmd[i])){
                			int a=accountRandom(); 
                			lastmd[i].setAccountNumber(a);
                			loginmd.setAccountNumber(a);
                			y--;
                		}else{
                			int a=accountRandom(); 
                			lastmd[i].setAccountNumber(a);
                			loginmd.setAccountNumber(a);
                		}
                	}
                	System.out.println("-ȸ�� ��Ͽ� �����Ͽ����ϴ�-");
                	}
                break;
            case 2:// �α���
                if(!login){
                System.out.println("�α��� ���� â�Դϴ�.");
                System.out.println("���¹�ȣ�� �Է����ּ���");
                int account = Integer.parseInt(sc.nextLine());
                System.out.println("��й�ȣ�� �Է����ּ���");
                String pass1 = sc.nextLine();
//                for(int i =0;f){
//                	
//                }
                for(int i =0; i<lastmd.length;i++){
                	if (checkMember(account,pass1,lastmd[i])) {
                		login = true;
                		System.out.println("�α����� �����߽��ϴ�.");
                		loginmd = lastmd[i];
                		break re_sw;
                	}else{
                		//Ʋ������...
                		if(i == lastmd.length-1){
                			System.out.println("���¹�ȣ, ��й�ȣ �� Ʋ�Ƚ��ϴ�. ");
                		}
                		break re_sw;
                	}
                }
                }else{
                    System.out.println("�α׾ƿ��� �Ǿ����ϴ�.");
                    login = false;
                    break ;
                }
            case 3:// �Ա�
                if (login) {
                    System.out.println("���� �Ա� �ϼ���");
                    int inMoney = Integer.parseInt(sc.nextLine());
                    loginmd.inMoney(inMoney);
                    loginmd.inCountup();
                    break;
                } else {
                    System.out.println("�α����� �ȵǿ����ϴ�.");
                    break ;
                }
            case 4:// ���
                if (login) {
 
                    System.out.println("����� �ݾ��� �Է��ϼ���");
                    int outMoney = Integer.parseInt(sc.nextLine());
//                    int out = loginmd.outMoney(outMoney);
                    if (outMoney > loginmd.getMoney()) {
//                        System.out.println("�ܵ��� �����մϴ�. ���� ������ �ִµ���" + out);
                    } else {
                        System.out.println("���� ��� �մϴ�." + outMoney + "���� ���Խ��ϴ�.");
                        loginmd.outCountup();
                    }
                    break;
                } else {
                    System.out.println("�α����� �ȵǿ����ϴ�.");
                    break ;
                }
            case 5:// ���� �Ա�
                if (login) {
                    System.out.println("�Ա��Ͻ� ���¸� �Է��ϼ���");
                    int getAccoun =Integer.parseInt(sc.nextLine());
                    for(int i=0; i<lastmd.length;i++){
                    if(!checkMember(getAccoun,lastmd[i])){
                    System.out.println("���� �Ա� �ϼ���");
                    int inMoney = Integer.parseInt(sc.nextLine());
                    lastmd[i].inMoney(inMoney);
                    lastmd[i].inCountup();
                    }else{
                    	System.out.println("��ϵ� ���°� �����ϴ�.");
                    	break;
                    }
                    }
 
                } else {
                    System.out.println("�α����� �ȵǿ����ϴ�.");
                    break ;
                }
                break;
            case 6:// ���� ���
                if (login) {
                    loginmd.memberPrint(loginmd.getAccountNumber());
                } else {
                    System.out.println("�α����� �ȵǿ����ϴ�.");
                    break ;
                }
                break;
            case 7: 
            	System.out.println("���α׷� ����");
            	System.exit(10);
                break;
            default:
                System.out.println("1~6������ ���ڸ� �Է� �ϼ���");
                break ;
            }
        }
    }
    //ȸ�� �� �ø���
    public static Bank_member[] arrayMember(Bank_member[] listmeber,Bank_member lastmeber,int su){
    	Bank_member[] temp = new Bank_member[su];
    	
    	
    	return temp;
    }
    
    // ȸ�� ���� ȸ�� ���� Ȯ��
    public static boolean checkMember(int accountNumber, Bank_member meber) {
        boolean ck = false;
        if (accountNumber == meber.getAccountNumber()) {
            ck = true;
        }
        return ck;
    }
    //ȸ�� �α��� üũ
    public static boolean checkMember(int accountNumber,String pass ,Bank_member meber) {
    	boolean ck = true;
    	if (accountNumber == meber.getAccountNumber()&&pass.equals(meber.getPassword())){
    		ck = false;
    	}
    	return ck;
    }
 
    // ȸ��
    public static Bank_member memberdata() {
        Bank_member mb = new Bank_member();
        return mb;
    }
 
    // ���¹�ȣ �޴� �żҵ�
    public static int accountRandom() {
        int account = 0;
        for (int i = 1; i < 10001;) {
            int a = (int) ((Math.random() * 10));
            if (a >= 2 && a <= 7) {
                account += a * i;
                i *= 10;
            }
        }
        return account;
    }
}
  
