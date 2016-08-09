import java.util.StringTokenizer;

//���� ���� �Լ�
public class Ex06_String_Function {
	public static void main(String[] args) {
		/*
			class Car{
				void run();
				public void run();
			}
			Car c = new Car();
			c.run();
			
			String Ŭ���� String Ŭ������ ������ �ִ� 
			public �ڿ��� ����� �� �ִ�.
			�� ���߿��� String �Լ� Ȱ�뵵�� ����.(�ϱ�)
		*/
		String str;
		String str2=""; //���ڿ��� �ʱ�ȭ
		char c = ' '; //�ѹ��� �ʱ�ȭ
		
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
		//���������� ������ tuer
		bo = s.contains("ell");
		System.out.println(bo);
		bo = s.contains("lle");
		System.out.println(bo);
		
		//���鵵 �����̴�
		String s2 ="a b c d";//[a][][b][][c][][d]
		System.out.println(s2.length());
		//���° �濡 �ִ���
		String  filename = "hello java, world ";
		int indexvale = filename.indexOf(",");
		System.out.println(indexvale);
		//ù��° �濡 ����
		indexvale = filename.indexOf("l");
		System.out.println(indexvale);
		indexvale = filename.indexOf("java");//-1 �̳����� ����.��� ��
		System.out.println(indexvale);
		//��ü ���忡�� java �ܾ ������ 0 ���� ū�� ����
		//-1 �̸� ����.
		
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
		//���ϸ�� Ȯ���ڸ� �и��ؼ� ���
		//���ϸ��� : a
		//Ȯ���� : bmp
		
//		System.out.println(filename2.substring(0,(filename2.indexOf("."))));
//		System.out.println(filename2.substring((filename2.indexOf(".")+1)));
		int su = filename2.indexOf(".");
//		System.out.println(filename2.substring(su+1));
//		System.out.println(filename2.substring(0,su));
		String  file = filename2.substring(0,su);
		String  extention = filename2.substring(++su);
		System.out.println(file + "/" +extention);
		
		
		//ġȯ �Լ�(replace)
		String s4 = "ABCD";
		String result2  = s4.replace("A", "��");
		System.out.println(result2);
		result2 = s4.replace("BCD", "����");
		System.out.println(result2);
		
		
		//s4.charAt(index)
		
		//s4.endsWith(suffix)
		//-> ����: a.hwp , b.txt , c.jpg ...
		String file2 = "1.jpg";
		System.out.println(file2.endsWith("jpg"));
		
		String s5 = "abc";
		System.out.println(s5.equals("abc"));//�ڹ� ��ҹ��� �����ϰ� ����
		System.out.println(s5.equalsIgnoreCase("ABC"));//��ҹ��� ���� ����
		
		//////////////////////////////////////////////////////
		
		/// ********** split 
		String s6 = "���۸�,��Ƽ,�����,������,������";
		String[] namearray= s6.split(",");
		for(String m : namearray){
			System.out.println(m);
		}
		
	String filename3 = "korea.jpg";
	//split �Լ� ��� (���ϸ�� Ȯ���ڸ� �и� ���)
	String []filea = filename3.split(".");
	for(String m : filea){
		System.out.println(m);
	}
	//���� ǥ����
	//ǥ��(� ��� ,� DB)��� ���
	//���� ���� ����ǥ�� ��Ÿ�� �Ͻð� 
//	����) 5���� ���弼��(��������)
	//�������� ������
	//����
	//���� ǥ�� 
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
	//Ȱ��
	//�Խ��� ���� ���ε�
	//���ε� ���� :1.jpg > ������ 1.jpg ���ε�(���ϸ�) 1_1.jpg
	String uploadfile ="hello.hwp";
	String [] upload = uploadfile.split("\\.");
	System.out.println("���ϸ� : "+upload[0]+"Ȯ����:"+upload[1]);
	String newFile = upload[0] + "_1" + upload[1];
	System.out.println(newFile);
	
	//�ͼ��� ����
	String s9 ="ȫ         ��        ��";
	//���� : ȫ�浿
	//������ ���� >ȫ�浿
	//String �Լ�
	String hwo = s9.replace(" ", "");
		System.out.println(hwo);
	String s1 = "         ȫ�浿";
	System.out.println(s1.trim());
	
	//
	//ü�� ���(�������ϱ� ������ ����) 
	 String chain= s1.trim().replace(" ", "");
	 System.out.println(chain);
	 
	 
	 //isEmpty() �Լ�
	 System.out.println("ȫ�浿".isEmpty());
	 System.out.println("".isEmpty());
	
	//charAt()�Լ�
	 System.out.println("ABCDE".charAt(2));
	 
	 
	 //Quiz
	 String sumstr ="";
	 int sum = 0 ;
	 String [] numberarr = {"1","2","3","4","5"};
	 //String �迭�� ������ �ִ� ���ڵ��� ���� ���ϼ���
	for(String i :numberarr){
		sum += Integer.parseInt(i);
	}
	System.out.println(sum);
	 
	//Quiz-2
	String jumin = "123456-1234567";
	//�ֹι�ȣ�� ���� ���Ͻÿ�
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
	// , �� ���ְ� �װ���"�氡�氡" ���ڸ� ��ġ�� ��ģ ���ڿ� 4�ڸ� ���� ���
	System.out.println(s10.replace(",", "").concat("�氡�氡").substring(4));
	
	
//	System.out.prinf(); //�������
	System.out.printf("%d-%s \n",10,"A");
	
//	String Ŭ���� fomat �Լ� 
	String formatter = String.format("%d-%s \n",10,"A");
	System.out.println(formatter);
	
	//String Ŭ������ static �Լ��� ������ �ִ�.
	System.out.println("???????");
	String str32 = ""+1;
	String i= str32.substring(0);
	System.out.println(i);
	
	}
}
