
//이 수없이 지나면 배운 내용 (x)
// sysotrong  i = 100  string ="홍길동"

//1.Strint 클래스 :내부적으로 테이터을 char[] 관리
//2steint  name ="홍길동 > [홍][길][동] > 배열 자원 그대로 사용
public class Ex05_String {
	public static void main(String[] args) {
		String  str1="AA";
		String  str2="AA";
		System.out.println(str1 +" /" + str2);
		System.out.println("주소값 비교 :"+ str1 == str2  );
		//key point 
		//값으로 비교
		System.out.println(str1.equals(str2));
		
		String str3 = new String("BBB");
		String str4 = new String("BBB");
		System.out.println(str3 +" /" + str4);
		System.out.println("주소값 비교 :"+ str3 == str4  );

	}
 
}
