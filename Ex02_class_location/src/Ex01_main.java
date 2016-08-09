//클래스를 만들기 (위치)

//하나의 java파일 안에 클래스 만들어 쓰기 
// 단 클래스 접근자(public)이면 안됩니다.
// 기본적으로 접근자(수정자)가 없으면
//default 접근자가 붙어요 (내부적으로)
//default는 같은 폴더 안에서만 사용 가능하다.
// 폴더 내부에서만 쓸거라는 의미
class Test{
	int num;
	
}

//default class Test{
//	default int num;
//}


//2.public (공유):다른 폴더에서 사용 가능
//단 경로만 정확히 알려준다면
//prblic class Emp(){}

public class Ex01_main {
	public static void main(String[] args) {
		Test t = new Test();
		t.num = 100;
		System.out.println(t.num);
	}
}
