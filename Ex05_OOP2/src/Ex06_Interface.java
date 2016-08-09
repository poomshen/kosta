//클래스간의 관계
//1.상속(부모(공통,일반화)  - 자식(구체화,특수화)
//2.포함(상속안되는 것 : has ~  a)
//3.포함(의존, 연관 ) > 객체를 갖는 것
//4.포함(직접 (new,클래스타입): 간접(인터페이스))

//인터페이스
//1.다형성 : 서로 연관이 없는 클래스 묶어주는 역할
//2.다형성 : 직접적인 관계를 간접적인 관계로 풀어준다.

//문서 해석 시스템

interface  Iparserable{
	void parse(String filename);
}
//word , xml ,html
class WordParser implements Iparserable{

	@Override
	public void parse(String filename) {
		System.out.println(filename + "word 해석 완료");
	}
	
}

class HtmlParser implements Iparserable{

	@Override
	public void parse(String filename) {
		System.out.println(filename + "html 해석 완료");
	}
	
}
class XmlParser implements Iparserable{

	@Override
	public void parse(String filename) {
		System.out.println(filename + "xml 해석 완료");
	}
	
}
class PaserManager{
//	public static XmlParser xmlParser(String type){
//		return  new XmlParser();
//	}
//	public static HtmlParser htmlParser(String type){
//		return new HtmlParser();
//	}
//	public static WordParser wordParser(String type){
//		return new WordParser();
//	}
	
	public static Iparserable getParser(String type){
		if(type.equals("xml")){
			return new XmlParser();
		}else if(type.equals("html")){
			return new HtmlParser();
		}else{
			return new WordParser();
		}
	}
}


public class Ex06_Interface {
	public static void main(String[] args) {
		//hello.html , hello.xml , hello.hwp
//		HtmlParser parser = PaserManager.htmlParser("html");
//		parser.parse("hello.html");
//		
//		WordParser parser2 = PaserManager.wordParser("word");
//		parser2.parse("hello");
		
		Iparserable parser = PaserManager.getParser("xml");
		parser.parse("holle");
	}
}
