import java.util.Scanner;

public class EX_Game {
	static Scanner sc = new Scanner(System.in);
	static int me;
	static int com;
	
	// 0 = ���� 1= ���� 2= ��
	public static void main(String[] args) {
		      Scanner sc = new Scanner(System.in);
		      while(true){
		      System.out.println("���������� ������ �����Ͻðڽ��ϱ�? 'Y'/'N'");
		      	String	str = sc.nextLine();
		    	  if (str.equals("Y")) {
		    		  System.out.println("'����,����,��' �����Դϴ�. '����,����,��'�� �ϳ��� �Է��ϼ���");
		    		  int sum = (int)((Math.random()*10)/4);//2���Ϸ� ���� �� �ֵ���
		    		  String me = sc.nextLine(); //�� �ޱ�
		    		  if(game_command(me)!= 3){
		    		  if(sum<3){
		    			String who = game_ing(game_command(me),sum);//�Լ� �ȿ� �Ķ���͸� �޾Ƽ� ������
		    		//����Ӱ���� Ȯ���ϴ� �Լ�(���������� ���ڸ� ������ ���ڷ�������ϴ� �Լ�,���� ��(��ǻ���Ǽ�)��
		    												//��ǻ���� ������ ���� ������������ ������ϴ� �Լ�
		    			System.out.println("���� :"+me+"  ��� :"+game_command(sum)+" �����:" +who);
		    		  }
		    		  }else {
						System.out.println("���� , ���� , ��  �� ���� ���ּ���");
					}
		    	  }else if(str.equals("N")){
		    		  System.out.println("���α׷� ����");
		    		  return;
		    	  }else{
		    		  System.out.println("Y �� N �߿� ��� �ּ���");
		    	  }
		      }
	}
	
	
	
	
	//0 = ���� 1 ���� 2 ��
	//���� ����� Ȯ�� �ϴ� �Լ�
	static String game_ing(int me,int com){
		String outcome="";
		if(me==com){
		 outcome ="����� �����ϴ�.";
		}else{
			if(me==0){
				 outcome = (com==1)? "����� �̰���ϴ�": "����� �����ϴ�";
			}
			if(me==1){
				 outcome = (com==2)? "����� �̰���ϴ�": "����� �����ϴ�";
			}
			if(me==2){
				 outcome = (com==0)? "����� �̰���ϴ�": "����� �����ϴ�";
			}
		}
		return outcome;
	}
	//����:��ǻ�� ��� ���ϰ� �� �ϱ� ���ؼ�.
	//������ ->0 ������ -> 1 ���� -> 2
	static int game_command(String me){
		int su = (me.equals("����"))?0:(me.equals("����"))?1:(me.equals("��"))?2:3;
		return su;
	}
	//����:��ǻ���� ������� ���� ���ؼ�.
	//0 -> ������ 1-> ������ 2->���� �ٲ���ִ� �����ε� �Լ�(���� �̸��� �Լ��� ���ڰ��� �ٸ����� ����Ҽ��ִ�.)
	static String game_command(int com){
		String su = (com==0)?"����":(com==1)?"����":(com==2)?"��":"?";
		return su;
	}
	
	
	}


