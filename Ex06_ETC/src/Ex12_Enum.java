//시스템 전체 사용되는  규칙만 자원
//순서가 있는 데이터 구조 표현
// 월 ~금  , 색상, 계절 , 코드상 데이터
//static Final
enum Season2{
	SPRING,SUMMER,FALL,WINTER
}
class kostaInfo{
	String classcode;
	String classname;
	Season2 kostaseason;
	
	public kostaInfo(String classcode, String classname, Season2 kostaseason) {
		this.classcode = classcode;
		this.classname = classname;
		this.kostaseason = kostaseason;
	}
}


public class Ex12_Enum {
	public static void main(String[] args) {
		kostaInfo  javaclass = new kostaInfo("192th", "java", Season2.SUMMER);
		System.out.println("기수  :" + javaclass.classcode);
		System.out.println("기수  :" + javaclass.classname);
		System.out.println("기수  :" + javaclass.kostaseason);
		
		//JavaAPI 제고 열거형
		//color.BARK 
	}
}
