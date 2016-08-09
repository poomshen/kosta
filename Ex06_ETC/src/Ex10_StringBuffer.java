
//문자열 누적
//String str = "A"
//for ( str+= "A") 10000번
//여러개의 문자를 누적해서 사용하는 것은 비효율
//String > StringBuffer , StringBuilder
public class Ex10_StringBuffer {
	///여기는 왜 만들었을까?
	public static void main(String[] args) {
		String str ="A"; 
		System.out.println(str.hashCode()); ////음 그래 해쉬 코드의 변화을 알아보기 위한 건가?
		str+="B"; //......
		System.out.println(str.hashCode()); ////더했더니 해쉬 코드가 변했어 그렇군 
		
		//StringBuffer 는 결국 char
		StringBuffer sb = new StringBuffer(); ///애는 스트링버퍼로 주었다 그래서 뭐
		System.out.println(sb.capacity());  //이 함수는 용량을 나타내는 함수고 기본 16개 를 가지고 있다는것
		sb.append("A");
		sb.append("안녕하십니까 저는 그런 사람입니다."); //어떤 타입이이여도 들어간다 이건가?
		System.out.println(sb.length());/// 랭스는 들어 있는 값을 나타 내는 것이고
		System.out.println(sb.hashCode()); // 스트링버퍼로 주니깐 해쉬 코드가 변하지 않은걸 알수 있음
		sb.append("B");
		System.out.println(sb.hashCode());
		
		///String 과 비슷하지만 배열형태로 값을 받고있음 
		///결국 참조 주소가 일치하는 StringBuffer고  String 선언과 추가 될 때마다 달라짐을 알수 있는 설명이 였다.
		//성능테스트 (StringBuffer) 누적에 시간 단축
		//시간 되시면 ...
	}

}
