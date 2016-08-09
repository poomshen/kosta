//��ü���� ���
//���� : Method overLoading
//�ϳ��� �̸����� �������� ���
//�������� ����� �ϱ����� ����
//�������
//1.�Լ��� �̸��� ���ƾ� �Ѵ�.
//2.[paramter]�� ������ [Type]�޸��Ͽ��� �Ѵ�.
//3.return Type �� �����ε��� �Ǵܱ���[x]
//4.paramter ������ �ٸ��� ����
//
// why : [���ϰ� ����ҷ���] => ������
//   �ϳ��� �Լ��̸����� �������� ��� 
//�����ε� ���� ������ ���� ����� : 0%
class OverTest {
	int add(int i) {
		return i + 100;
	}

	int add(int i, int j) {
		return i + j;
	}
	// parmeter ������ Ÿ�� ����
//	void add(int i){
//		
//	}
	void add(int i , String s){
		System.out.println(s + " ; " +i);
	}
	void add(String s , int i){/// �Ķ���͵� ���Ƶ� ������ �ٸ��� ���� �ϴ�
		System.out.println(i + " ;  " + s);
	}
	int[] add(int[] param){
		int [] targe = new int[param.length];
		for(int i= 0; i<param.length; i++){
			targe[i] = param[i]+1;
		}
		return targe;
	}
	int[] add(int [] so, int[]so2){
		//�ȿ� �ڵ�� �����Ӱ� error �� �ȳ���  ������ ��ƶ�
		int []targe = new int[so2.length +so.length];
		for(int i= 0; i<so.length; i++){
			targe[i] = so[i];
		}
		for(int i=so.length; i<so.length+so2.length ; i++){
			targe[i] = so2[i-so.length];
		}
		return targe;
	}
}

public class Ex11_Method_Overloading {
	public static void main(String[] args) {
		OverTest ot = new OverTest();
		int otadd = ot.add(10);
		int otadd2 = ot.add(50, 400);
		System.out.println(otadd);
		System.out.println(otadd2);
		
		//ù�� ù �ð� ���� ù��° �ڵ�����
//		System.out.println()  �����ε� �Լ�
		
		int[] source = new int[]{10,20,30};
		int[] target = ot.add(source);
		for(int value:target){
			System.out.println(value);
		}
		
		int[] gogo1 = new int[]{1,2,3,4,5};
		int[] gogo2 = new int[]{6,7,8,9,10};
		int[] target2 = ot.add(gogo1,gogo2);
		for(int value:target2){
			System.out.print(value+",");
		}
		
		
	}
}
