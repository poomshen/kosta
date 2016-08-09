//객체지항 언어
//개념 : Method overLoading
//하나의 이름으로 여러가지 기능
//여러가지 기능을 하기위한 조건
//생성방법
//1.함수의 이름은 같아야 한다.
//2.[paramter]의 개수와 [Type]달리하여야 한다.
//3.return Type 은 오버로딩의 판단기준[x]
//4.paramter 순서가 다름을 인정
//
// why : [편하게 사용할려고] => 개발자
//   하나의 함수이름으로 여러가지 기능 
//오버로딩 사용시 성능이 좋아 질까요 : 0%
class OverTest {
	int add(int i) {
		return i + 100;
	}

	int add(int i, int j) {
		return i + j;
	}
	// parmeter 개수와 타입 동일
//	void add(int i){
//		
//	}
	void add(int i , String s){
		System.out.println(s + " ; " +i);
	}
	void add(String s , int i){/// 파라미터도 같아도 순서가 다르면 가능 하다
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
		//안에 코드는 자유롭게 error 만 안나게  사지고 놀아라
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
		
		//첫날 첫 시간 부터 첫번째 코딩에서
//		System.out.println()  오버로딩 함수
		
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
