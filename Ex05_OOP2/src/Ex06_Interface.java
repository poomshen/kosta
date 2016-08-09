//Ŭ�������� ����
//1.���(�θ�(����,�Ϲ�ȭ)  - �ڽ�(��üȭ,Ư��ȭ)
//2.����(��ӾȵǴ� �� : has ~  a)
//3.����(����, ���� ) > ��ü�� ���� ��
//4.����(���� (new,Ŭ����Ÿ��): ����(�������̽�))

//�������̽�
//1.������ : ���� ������ ���� Ŭ���� �����ִ� ����
//2.������ : �������� ���踦 �������� ����� Ǯ���ش�.

//���� �ؼ� �ý���

interface  Iparserable{
	void parse(String filename);
}
//word , xml ,html
class WordParser implements Iparserable{

	@Override
	public void parse(String filename) {
		System.out.println(filename + "word �ؼ� �Ϸ�");
	}
	
}

class HtmlParser implements Iparserable{

	@Override
	public void parse(String filename) {
		System.out.println(filename + "html �ؼ� �Ϸ�");
	}
	
}
class XmlParser implements Iparserable{

	@Override
	public void parse(String filename) {
		System.out.println(filename + "xml �ؼ� �Ϸ�");
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
