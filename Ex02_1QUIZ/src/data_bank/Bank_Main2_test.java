package data_bank;
 
import java.util.Scanner;
 
public class Bank_Main2_test {
    static int memberSu=1;
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
                Bank_member mbmix = new Bank_member();
                 int a = accountRandom();
                mbmix.memberInSert(name, pass, money, a);
                for(Bank_member mb:lastmd){
                	if(checkMember(accountRandom(),mb)){
                		int b=accountRandom(); 
                		mb.setAccountNumber(b);
                		mb.setAccountNumber(b);
                		return;
                	}
                }
                lastmd=arrayMember(lastmd,mbmix ,memberSu);
                loginmd = mbmix;
                	// ����� ���� Ȯ��
                	System.out.println("-ȸ�� ��Ͽ� �����Ͽ����ϴ�-");
                	login = true;
                	break;
            case 2:// �α���
                if(!login){
                System.out.println("�α��� ���� â�Դϴ�.");
                System.out.println("���¹�ȣ�� �Է����ּ���");
                int account = Integer.parseInt(sc.nextLine());
                for(Bank_member i : lastmd){
                	int su= 0;
                	if (i.getAccountNumber() == account) {
                		//�α��� ���¹�ȣ�� ���� ��
                		System.out.println("��й�ȣ�� �Է����ּ���");
                		String pass1 = sc.nextLine();
                		if(checkMember(pass1,i)){
                			login = true;
		                	System.out.println("�α����� �����߽��ϴ�.");
		                	loginmd = i;
		                	break re_sw;
                			
                		}else{
                			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
                			break;
                		}
                			
                	}              	
                	su++;
//                	//Ʋ������...
                	if(su == memberSu){
                		System.out.println("���¹�ȣ, ��й�ȣ �� Ʋ�Ƚ��ϴ�. ");
                		break;
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
                    if (loginmd.outMoney(outMoney)){
                        System.out.println("���� ��� �մϴ�." + outMoney + "���� ���Խ��ϴ�.");
                        loginmd.outCountup();
                    break;
                    }
                } else {
                    System.out.println("�α����� �ȵǿ����ϴ�.");
                    break ;
                }
                break;
            case 5:// ���� �Ա�
                if (login) {
                    System.out.println("�Ա��Ͻ� ���¸� �Է��ϼ���");
                    int getAccoun =Integer.parseInt(sc.nextLine());
                    for(Bank_member mb :lastmd){
                    if(checkMember(getAccoun,mb)){
                    System.out.println("������ ���� �Է� �ϼ���");
                    int inMoney = Integer.parseInt(sc.nextLine());
                    //���� �ѹ��� �־�� �ϴµ� 
                    if (!loginmd.outMoney(inMoney)) {
                        System.out.println("�ܵ��� �����մϴ�. ���� ������ �ִµ���" + mb.getMoney());
                        break re_sw;
                    } else {
                        System.out.println("���� " + inMoney + "���� ���½��ϴ�.");
                        loginmd.outCountup();
                        mb.inMoney(inMoney);
                        mb.inCountup();
                        break re_sw;
                    }
                    }else{
                    }
                    }
                    System.out.println("��ϵ� ���°� �����ϴ�.");
                    break;
 
                } else {
                    System.out.println("�α����� �ȵǿ����ϴ�.");
                    break ;
                }
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
    	for(int i=0; i<su-1 ;i++){
    		temp[i] = listmeber[i];
    	}
    		temp[su-1] = lastmeber;
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
    public static boolean checkMember(String pass ,Bank_member meber) {
    	boolean ck = false;
    		if(pass.equals(meber.getPassword())){
    			ck= true;
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
  
