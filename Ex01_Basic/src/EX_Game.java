import java.util.Scanner;

public class EX_Game {
	static Scanner sc = new Scanner(System.in);
	static int me;
	static int com;
	
	// 0 = 가위 1= 바위 2= 보
	public static void main(String[] args) {
		      Scanner sc = new Scanner(System.in);
		      while(true){
		      System.out.println("가위바위보 게임을 시작하시겠습니까? 'Y'/'N'");
		      	String	str = sc.nextLine();
		    	  if (str.equals("Y")) {
		    		  System.out.println("'가위,바위,보' 게임입니다. '가위,바위,보'중 하나를 입력하세요");
		    		  int sum = (int)((Math.random()*10)/4);//2이하로 받을 수 있도록
		    		  String me = sc.nextLine(); //값 받기
		    		  if(game_command(me)!= 3){
		    		  if(sum<3){
		    			String who = game_ing(game_command(me),sum);//함수 안에 파라미터를 받아서 보내줌
		    		//↑게임결과를 확인하는 함수(가위바위보 문자를 정해진 숫자로재출력하는 함수,랜덤 값(컴퓨터의수)↑
		    												//컴퓨터의 랜덤한 수를 가위바위보로 재출력하는 함수
		    			System.out.println("나는 :"+me+"  상대 :"+game_command(sum)+" 결과는:" +who);
		    		  }
		    		  }else {
						System.out.println("가위 , 바위 , 보  중 선택 해주세요");
					}
		    	  }else if(str.equals("N")){
		    		  System.out.println("프로그램 종료");
		    		  return;
		    	  }else{
		    		  System.out.println("Y 와 N 중에 골라 주세요");
		    	  }
		      }
	}
	
	
	
	
	//0 = 가위 1 바위 2 보
	//게임 결과를 확인 하는 함수
	static String game_ing(int me,int com){
		String outcome="";
		if(me==com){
		 outcome ="상대방과 비겼습니다.";
		}else{
			if(me==0){
				 outcome = (com==1)? "당신이 이겼습니다": "당신이 졌습니다";
			}
			if(me==1){
				 outcome = (com==2)? "당신이 이겼습니다": "당신이 졌습니다";
			}
			if(me==2){
				 outcome = (com==0)? "당신이 이겼습니다": "당신이 졌습니다";
			}
		}
		return outcome;
	}
	//이유:컴퓨터 결과 값하고 비교 하기 위해서.
	//가위를 ->0 바위를 -> 1 보를 -> 2
	static int game_command(String me){
		int su = (me.equals("가위"))?0:(me.equals("바위"))?1:(me.equals("보"))?2:3;
		return su;
	}
	//이유:컴퓨터의 결과값을 보기 위해서.
	//0 -> 가위로 1-> 바위로 2->보로 바뀌어주는 오버로딩 함수(같은 이름의 함수라도 인자값이 다르더라도 사용할수있다.)
	static String game_command(int com){
		String su = (com==0)?"가위":(com==1)?"바위":(com==2)?"보":"?";
		return su;
	}
	
	
	}


