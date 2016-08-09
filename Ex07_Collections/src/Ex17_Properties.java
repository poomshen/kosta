import java.util.Properties;

//Map 의 일종
//특수한 Map 형태 <String , String >
//Properties
//어플리케이션 전체의 공통 속성 (환경변수) 속성을 저장 관리
//별도의  peoperty 파일을 만들어서 관리가능
//다국어 처리 가능

//웹 사이트
//웹 사이트 하단에 관리자 email 주소 : 200개의 모두 email 주소
//admin@master.com -> master@star.com

public class Ex17_Properties {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("master", "admin@naver.com");
		prop.setProperty("lang", "kr");
		prop.setProperty("version", "1.0");
		prop.setProperty("DefaultPath", "c:\\Temp\\Image");
		
		
		System.out.println("웹사이트 하단 :" +prop.getProperty("master"));
		System.out.println(prop.getProperty("version"));
		System.out.println(prop.getProperty("DefaultPath"));
	}
}
