//내 pc 게임 설치
//게임 CD 넣기
//임시폴더 (CD copy)
//인스톨 (임시 폴더)
//임시폴더 삭제

//인스톨 되는 도중 오류 > 임시폴더 내용 삭제
//정상적인 인스톨       > 임시폴더 내용 삭제

public class Ex03_Exception {
	static void startInstall(){
		System.out.println("install");
	}
	static void CopyFiles(){
		System.out.println("copy file");
	}
	static void DeletFiles(){
		System.out.println("delete file");
	}
	public static void main(String[] args) {
		try {
			startInstall();
			CopyFiles();
			//내가 예외를 만들어서 ..
//			Exception ex = new Exception("Copy 오류");
//			throw ex;//예외 던지기
			throw new Exception("Copy 오류");
		} catch (Exception e) {
//			System.out.println("install 에 실패 했습니다.");
			System.out.println("문제 발생 " + e.getMessage());
		}finally {
			//****try 또는 catch블럭에서 return문을 만나도 finally블럭은 수행된다.
			//프로그램이 정상(구문 실행)
			//프로그램이 비정상 (구문 실행)
			DeletFiles();
		}
	}
}
