import java.util.StringTokenizer;

//문자 관련 함수
public class Ex06_String_Function {
	public static void main(String[] args) {
		/*
			class Car{
				void run();
				public void run();
			}
			Car c = new Car();
			c.run();
			
			String 클래스 String 클래스가 가지고 있는 
			public 자원은 사용할 수 있다.
			실 개발에서 String 함수 활용도가 높다.(암기)
		*/
		String str;
		String str2=""; //문자열의 초기화
		char c = ' '; //한문자 초기화
		
		String[] strarray = {"ab","abc" ,"abcd"	};
		for(String s : strarray){
			System.out.println(s);
		}
		/////////////////////////////////////////////////////
		String s = "hello";
		String concat_s = s.concat("world");
		System.out.println(concat_s);
		
		
		boolean bo = s.contains("h");
		System.out.println(bo);
		//순차적으로 맞으면 tuer
		bo = s.contains("ell");
		System.out.println(bo);
		bo = s.contains("lle");
		System.out.println(bo);
		
		//공백도 문자이다
		String s2 ="a b c d";//[a][][b][][c][][d]
		System.out.println(s2.length());
		//몇번째 방에 있는지
		String  filename = "hello java, world ";
		int indexvale = filename.indexOf(",");
		System.out.println(indexvale);
		//첫번째 방에 값만
		indexvale = filename.indexOf("l");
		System.out.println(indexvale);
		indexvale = filename.indexOf("java");//-1 이나오면 없다.라는 뜻
		System.out.println(indexvale);
		//전체 문장에서 java 단어가 있으면 0 보다 큰값 리턴
		//-1 이면 없다.
		
		System.out.println("-lastIndexOf-");
		indexvale = filename.lastIndexOf("l");
		System.out.println(indexvale);
		
		//*****
		System.out.println("=substring=");
		//substring
		String result = "superman";
		System.out.println(result.substring(1));
		System.out.println(result.substring(1,3));
		//endindex -1
		System.out.println("TEST :" + result.substring(1,1));
		
		
		//Quiz
		String filename2 = "cat.bmp"; //cat.jpg , aaa.txt
		//파일명과 확장자를 분리해서 출력
		//파일명은 : a
		//확장자 : bmp
		
//		System.out.println(filename2.substring(0,(filename2.indexOf("."))));
//		System.out.println(filename2.substring((filename2.indexOf(".")+1)));
		int su = filename2.indexOf(".");
//		System.out.println(filename2.substring(su+1));
//		System.out.println(filename2.substring(0,su));
		String  file = filename2.substring(0,su);
		String  extention = filename2.substring(++su);
		System.out.println(file + "/" +extention);
		
		
		//치환 함수(replace)
		String s4 = "ABCD";
		String result2  = s4.replace("A", "다");
		System.out.println(result2);
		result2 = s4.replace("BCD", "람쥐");
		System.out.println(result2);
		
		
		//s4.charAt(index)
		
		//s4.endsWith(suffix)
		//-> 폴더: a.hwp , b.txt , c.jpg ...
		String file2 = "1.jpg";
		System.out.println(file2.endsWith("jpg"));
		
		String s5 = "abc";
		System.out.println(s5.equals("abc"));//자바 대소문자 엄격하게 구분
		System.out.println(s5.equalsIgnoreCase("ABC"));//대소문자 구분 안함
		
		//////////////////////////////////////////////////////
		
		/// ********** split 
		String s6 = "슈퍼맨,팬티,노랑색,우하하,우하하";
		String[] namearray= s6.split(",");
		for(String m : namearray){
			System.out.println(m);
		}
		
	String filename3 = "korea.jpg";
	//split 함수 사용 (파일명과 확장자를 분리 출력)
	String []filea = filename3.split(".");
	for(String m : filea){
		System.out.println(m);
	}
	//정규 표현식
	//표준(어떤 언어 ,어떤 DB)모두 사용
	//조별 과제 정규표현 스타디를 하시고 
//	예제) 5개를 만드세요(검증도구)
	//복잡하지 않은것
	//설명
	//정규 표현 
	// 010 -{\d3} -0000 > 010-122 -0000 >(false)
//						>010-1111-0000
	
	System.out.println("----------------------");
	String s8 ="a//b.c,d-f";
	//a  b c d f 
	StringTokenizer  sto = new StringTokenizer(s8,"/.,-");
	while(sto.hasMoreTokens()){
		System.out.println(sto.nextToken());
	}
	System.out.println("!!!");
	String [] tokens = new String[10];
	int index =0;
	StringTokenizer  sto2 = new StringTokenizer(s8,"/.,-");
	while(sto2.hasMoreTokens()){
		 tokens[index++] = sto2.nextToken();
	}
	for(String st : tokens){
		System.out.println(st);
	}
	/// ----------------------------------
	StringTokenizer  sto3 = new StringTokenizer(s8, "/.,-",true);
	while(sto3.hasMoreTokens()){
		System.out.println(sto3.nextToken());
	}
	/////////////////////////////////////////////////////////
	//활용
	//게시판 파일 업로드
	//업로드 폴더 :1.jpg > 누군가 1.jpg 업로드(파일멸) 1_1.jpg
	String uploadfile ="hello.hwp";
	String [] upload = uploadfile.split("\\.");
	System.out.println("파일명 : "+upload[0]+"확장자:"+upload[1]);
	String newFile = upload[0] + "_1" + upload[1];
	System.out.println(newFile);
	
	//넌센스 퀴즈
	String s9 ="홍         길        동";
	//저장 : 홍길동
	//공백을 제거 >홍길동
	//String 함수
	String hwo = s9.replace(" ", "");
		System.out.println(hwo);
	String s1 = "         홍길동";
	System.out.println(s1.trim());
	
	//
	//체인 기법(보기편하기 때문에 권장) 
	 String chain= s1.trim().replace(" ", "");
	 System.out.println(chain);
	 
	 
	 //isEmpty() 함수
	 System.out.println("홍길동".isEmpty());
	 System.out.println("".isEmpty());
	
	//charAt()함수
	 System.out.println("ABCDE".charAt(2));
	 
	 
	 //Quiz
	 String sumstr ="";
	 int sum = 0 ;
	 String [] numberarr = {"1","2","3","4","5"};
	 //String 배열이 가지고 있는 문자들의 합을 구하세요
	for(String i :numberarr){
		sum += Integer.parseInt(i);
	}
	System.out.println(sum);
	 
	//Quiz-2
	String jumin = "123456-1234567";
	//주민번호의 합을 구하시오
	sum = 0;
	String []jnminsum = jumin.replace("-", "").split("");
	for(String i : jnminsum){
		sum += Integer.parseInt(i);
	}
	System.out.println(sum);
//	StringTokenizer jum = new StringTokenizer(jnminsum," ",true);
//	while(jum.hasMoreTokens()){
//		System.out.println(jum.nextToken());
//	}
	
	//Quiz -3
	String s10 = "hello java, world";
	// , 를 없애고 그값에"방가방가" 문자를 합치고 합친 물자에 4자리 부터 출력
	System.out.println(s10.replace(",", "").concat("방가방가").substring(4));
	
	
//	System.out.prinf(); //출력포맷
	System.out.printf("%d-%s \n",10,"A");
	
//	String 클래스 fomat 함수 
	String formatter = String.format("%d-%s \n",10,"A");
	System.out.println(formatter);
	
	//String 클래스는 static 함수를 가지고 있다.
	System.out.println("???????");
	String str32 = ""+1;
	String i= str32.substring(0);
	System.out.println(i);
	
	}
}
