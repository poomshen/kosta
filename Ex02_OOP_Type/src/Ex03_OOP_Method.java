//�Լ�
//�Լ��� ����
//void , parameter(0)
//void , parameter(X)
//return Type , parameter(0)
//return Type , Parameter(x)
//�����ִ� ���� ����.
//return Type : 8���� �⺻ Ÿ�� + ����Ÿ�� +�迭(Array) ���
//parameter(����, �μ�, �Ű����� ): 8���� �⺻ Ÿ�� +���� Ÿ�� +�迭(Array) ���

class Fclass{
	//�Լ� ȣ�⿡ ���ؼ� ����
	void m(){
		System.out.println("�Ϲ� �Լ�(void,paramter(x))");
	}
	void m2(int param){
		System.out.println("param vlue :"+ param);
		System.out.println("�Ϲ��Լ� (void, paramter(0))");
	}
	int m3(){
		System.out.println("���� �Լ�(return , parmter(x))");
		return 3;
	}
	int m4(int param){
		System.out.println("param vlue :"+ param);
		System.out.println("�����Լ�(return, parmter(0))");
		return 100;
	}
	
	int m5(int param, int param2){
		return param +param2;
	}
	
	//Quiz
	int max(int a, int b){

// 	������ �ѹ��� �ϴ°� ����.		
//		int result = 0;
//		if(a>b){
//			result = a;
//		}else{
//			result =b;
//		}return result;
		
		// a �� b ���߿� ū ���� return �ϴ� ����
		//return�� �������� ������ ����ִ°��� ����.
//		return (a>b)? a:(a==b)? a:b;
		int max = (a>b) ?a:(a==b) ?a:b;
		return max;
	}
	String m6(String param1 ,String param2){
		return param1 +":"+param2;
	}
	
	
	//key point 
	//class �� return Type �Ǵ� Paramter
	//class�� Type�̴�.(����)
	Car carmethod(){
		Car c=new Car();
		return c;
	}
	Car carmethod2(Car c){
		return c;
	}
}

class Car{
	int door=10;
	
}


public class Ex03_OOP_Method {
 
	
	public static void main(String[] args) {
		Fclass f = new Fclass();
		f.m();
		f.m2(4);
		int fm3 = f.m3();
		System.out.println("fm3�� ����Ǹ� :"+fm3);
		int fm4 = f.m4(10);
		System.out.println("fm4�� ����Ǹ� :"+fm4);
		
		int result = f.m5(110, 130);
		System.out.println("result value" + result);
		
		int su = f.max(10, 40);
		System.out.println("result max value :" + su);
		
		String  str = f.m6("ȫ�浿", "�տ���");
		System.out.println(str);
		
		Car c= f.carmethod();
		////////////////////////////////////////////////
		Car car2 = new Car();
		Car car3 = f.carmethod2(car2);
		//car ���������� �ּҿ�  car2 ���������� �ּҴ� ����
	}
}
