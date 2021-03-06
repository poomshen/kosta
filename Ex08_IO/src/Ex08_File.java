import java.io.File;

//File 클래스
//파일과 폴더 (directory) 다루는 클래스

//Ms > File , Directory 클래스
//java > File

//File : 새로운 파일을 생성, 삭제 , 수정
//     : 폴더를 생성 , 삭제 , 수정

//경로 
//절대경로: C:\\ , D:\\ ,C:\kosta129\... 
//상대경로: 현제 위치 
public class Ex08_File {
	public static void main(String[] args) {
		String path ="C:\\Temp\\aaa\\aaa.txt"; //절대경로
		File f = new File(path);
		
		//File 클래스 :정보 추출
		String filename = f.getName();
		System.out.println(filename);
		
		//파일 이름 과 확장자
		int pos = filename.indexOf(".");
		System.out.println(filename.substring(0,pos));//기존의 파일 이름 가져 오기
		System.out.println(filename.substring(++pos));//기존의 확장자 명 가져 오기
		
		//File 클래스가 가지고 있는 함수 (정보)
		System.out.println("전체경로: "+f.getParent());//전체경로
//		System.out.println(f.getAbsolutePath());//절대 경로 가져 오는 함수
		System.out.println("너 폴더니?"+f.isDirectory());//폴더 인지 파일인지 판단 하는 함수
		System.out.println("너 파일이니?"+f.isFile());//파일이라면 true 
		System.out.println("파일의  크기 : "+f.length() +"byte"); //파일의 크기 바이트 단위로
		System.out.println("부모경로 : "+f.getParent());//자신을 제외한 앞 경로
		System.out.println("파일 존제 여부"+f.exists());//실제로 존제 하는 지
		
		
	}
}
