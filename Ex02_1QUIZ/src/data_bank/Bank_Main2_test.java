package data_bank;
 
import java.util.Scanner;
 
public class Bank_Main2_test {
    static int memberSu=1;
    static Bank_member [] lastmd = new Bank_member[]{ new Bank_member()};
    static Bank_member loginmd =new Bank_member();
 
    public static void main(String[] args) {
        // 회원가입 입금 출금 정보확인 계좌입금 종료
        Scanner sc = new Scanner(System.in);
        boolean login = false;
   re_st: while (true) {
            System.out.println("@@@@@@@@안녕하세요 3조 은행입니다.@@@@@@@@");
            int choice = 0;
            if (!login) {
                System.out.println("1.회원가입 2.로그인 3.입금 4.출금 5.계좌입금 6.정보출력 7.종료");
                choice = Integer.parseInt(sc.nextLine());
            } else {
                System.out.println("1.회원가입 2.로그아웃 3.입금 4.출금 5.계좌입금 6.정보출력 7.종료");
                choice = Integer.parseInt(sc.nextLine());
            }
      re_sw :switch (choice) {
            case 1: // 회원가입
                if (login) {
                    System.out.println("이미 회원이 되어 있습니다.");
                    break;
                }
//                Bank_member mb = memberdata();
                System.out.println("이름은 무엇입니까?:");
                String name = sc.nextLine();
                System.out.println("비밀번호는 무엇입니까?");
                String pass = sc.nextLine();
                System.out.println("선 입금할 금액을 넣어 주세요");
                int money = Integer.parseInt(sc.nextLine());
                memberSu++;
                //회원수를 늘려 주자
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
                	// 여기는 계좌 확인
                	System.out.println("-회원 등록에 성공하였습니다-");
                	login = true;
                	break;
            case 2:// 로그인
                if(!login){
                System.out.println("로그인 선택 창입니다.");
                System.out.println("계좌번호를 입력해주세요");
                int account = Integer.parseInt(sc.nextLine());
                for(Bank_member i : lastmd){
                	int su= 0;
                	if (i.getAccountNumber() == account) {
                		//로그인 계좌번호가 있을 때
                		System.out.println("비밀번호를 입력해주세요");
                		String pass1 = sc.nextLine();
                		if(checkMember(pass1,i)){
                			login = true;
		                	System.out.println("로그인이 성공했습니다.");
		                	loginmd = i;
		                	break re_sw;
                			
                		}else{
                			System.out.println("비밀번호가 틀렸습니다.");
                			break;
                		}
                			
                	}              	
                	su++;
//                	//틀렸을때...
                	if(su == memberSu){
                		System.out.println("계좌번호, 비밀번호 가 틀렸습니다. ");
                		break;
                	}
                }
                }else{
                    System.out.println("로그아웃이 되었습니다.");
                    login = false;
                    break ;
                }
            case 3:// 입금
                if (login) {
                    System.out.println("돈을 입금 하세요");
                    int inMoney = Integer.parseInt(sc.nextLine());
                    loginmd.inMoney(inMoney);
                    loginmd.inCountup();
                    break;
                } else {
                    System.out.println("로그인이 안되였습니다.");
                    break ;
                }
            case 4:// 출금
                if (login) {
 
                    System.out.println("출금할 금액을 입력하세요");
                    int outMoney = Integer.parseInt(sc.nextLine());
                    if (loginmd.outMoney(outMoney)){
                        System.out.println("돈을 출력 합니다." + outMoney + "원이 나왔습니다.");
                        loginmd.outCountup();
                    break;
                    }
                } else {
                    System.out.println("로그인이 안되였습니다.");
                    break ;
                }
                break;
            case 5:// 계좌 입금
                if (login) {
                    System.out.println("입금하실 계좌를 입력하세요");
                    int getAccoun =Integer.parseInt(sc.nextLine());
                    for(Bank_member mb :lastmd){
                    if(checkMember(getAccoun,mb)){
                    System.out.println("보내실 돈을 입력 하세요");
                    int inMoney = Integer.parseInt(sc.nextLine());
                    //문제 한번만 넣어야 하는데 
                    if (!loginmd.outMoney(inMoney)) {
                        System.out.println("잔돈이 부족합니다. 현재 가지고 있는돈은" + mb.getMoney());
                        break re_sw;
                    } else {
                        System.out.println("돈을 " + inMoney + "원을 보냈습니다.");
                        loginmd.outCountup();
                        mb.inMoney(inMoney);
                        mb.inCountup();
                        break re_sw;
                    }
                    }else{
                    }
                    }
                    System.out.println("등록된 계좌가 없습니다.");
                    break;
 
                } else {
                    System.out.println("로그인이 안되였습니다.");
                    break ;
                }
            case 6:// 정보 출력
                if (login) {
                    loginmd.memberPrint(loginmd.getAccountNumber());
                } else {
                    System.out.println("로그인이 안되였습니다.");
                    break ;
                }
                break;
            case 7: 
            	System.out.println("프로그램 종료");
            	System.exit(10);
                break;
            default:
                System.out.println("1~6까지의 숫자만 입력 하세요");
                break ;
            }
        }
    }
	//회원 수 늘리기
    public static Bank_member[] arrayMember(Bank_member[] listmeber,Bank_member lastmeber,int su){
    	Bank_member[] temp = new Bank_member[su];
    	for(int i=0; i<su-1 ;i++){
    		temp[i] = listmeber[i];
    	}
    		temp[su-1] = lastmeber;
    	return temp;
    }
    
    // 회원 가입 회원 정보 확인
    public static boolean checkMember(int accountNumber, Bank_member meber) {
        boolean ck = false;
        if (accountNumber == meber.getAccountNumber()) {
            ck = true;
        }
        return ck;
    }
    //회원 로그인 체크
    public static boolean checkMember(String pass ,Bank_member meber) {
    	boolean ck = false;
    		if(pass.equals(meber.getPassword())){
    			ck= true;
    		}
    	return ck;
    }
 
    // 회원
    public static Bank_member memberdata() {
        Bank_member mb = new Bank_member();
        return mb;
    }
 
    // 계좌번호 받는 매소드
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
  
