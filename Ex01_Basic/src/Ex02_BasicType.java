
/*		���� -> ����-> byte(-128~127) -��Ŵ����� ���̾�
					char(�ѹ���:2byte) : '��', 'a'
					short(c��� ȣȯ��)
					int(4Byte : ������ �⺻ Ÿ��)(-21�� ~21��)
					long(8Byte : int���� ū��)
			->�Ǽ�(�Ҽ���) -> float(4Byte)
							double(8Byte �⺻ Ÿ��(double))
		�� -> boolean(true,false) >���α׷��� �帧 ����
				
 */	
public class Ex02_BasicType {
	public static void main(String[] args) {
		int i, j, k;//���ӵ� ������ ���� ����
		i =100;
		j = 200; 
		k = 300;
		System.out.println(i+":"+j+":"+k);
		
		i=1000000000;
		
		//int �� long
		/*long unm2 =100000000000;//java ���� �⺻ int 
		 */
		long num2 = 1000000000L;
		System.out.println(num2);
		
		
		//����� String Ŭ���� �Դϴ�.
		String name ="�� ����";
		
		//chat Ÿ�Դ� ǥ���� ''
		
		char single = '��';
		char c= 'a';
		
		String str = "ȫ\"��\"��";
		System.out.println(str);
		
		String ut ="C:\\Utils";
		String te ="C:\\Temp";
		
		System.out.println(ut);
		System.out.println(te);
		
		//��Ÿ��
		//�帧����
		boolean power = true;
		System.out.println(power);
		
		power = !power;//���� ������
		System.out.println(power);
		 
		//char(unicode �� ���󰡿�) => 2Byte �⺻���� ���ڸ� ǥ��
		//��Ģ : �ѱ� 1�� : 2Byte 
			// ������ , Ư������, ���� > 1Byte
		
		//char �ѹ��ڸ� ǥ�� �� �� �ִ� Ÿ�� (��, a , B) =>2Byte
		//char ''�̱������̼� �̸� ǥ��
		//���� : ���� ��"" (String)
		//      �ѹ��� ' '(char)
		
		//char : ���������� �������� ������ �־�� (���� Ÿ�� ȣȯ ����)
		//������ -> �ѹ���
		//�ѹ��� -> ����������
		//�ƽ�Ű�ڵ�ǥ �������� ���ø� �˴ϴ�.(10����)
		
		char ch = 'a';
		System.out.println(ch);
		char ca2 =  '��';
		char ca3 = '1';
		
		int cint =65;
		char ch4 = (char)cint; //����ȯ(������� ����ȯ)
		System.out.println(ch4);
		
		int cint2 = ch4; //��� �������� ����ȯ : (int)ch4: char -> int
						//�Ͻ����� ����ȯ 
		
		//�Ǽ�(���е�)
		//float (4)    :�Ҽ� 7�ڸ� ���е�
		//double(8)    :�⺻Ÿ��(default):�Ҽ� 16�ڸ� ���е�
		
		//3.14 > default Type : double
		float f = 3.14f; //���̻�(F,f)
		double d = 3.14;
		
		
		//��ȿ����(�ݿø�)
		float f2 = 1.123456789f;
		System.out.println("f2 :" + f2);
		
		//ǥ���ɶ� (�ݿø�)
		double  d2 = 1.123456789123456789;
		System.out.println("d2 :"+ d2);
		
		
		double d3 = (double)100;//��� 100�� ����Ÿ�� �Ͻ��� ����ȯ
		System.out.println(d3); // 100.0
		
		int i4 = 100;
//		int result  = i4 +(int)d3; //���� (������ �ս�)
		
		double result2 = i4 + d3;
		
		//int result = i4 + d3;//int +double
		
		//Point : ����Ÿ��+ ūŸ�� => ūŸ��
		int i5 = 100;
		byte b2 = (byte)i5;//(-128 ~ 127 ���� 0 ����)
		
		byte b3 =20;
		int i6 = b3;//�Ͻ��� ����ȯ : int i6 = (int)b3
		
	}
}
