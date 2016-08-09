//�⺻Ÿ�� : 8�� > JAVA API�� Ŭ������ ����(���� Ŭ����)
//�⺻Ÿ�� �ڷ����� Ŭ������ ���� ��ü ������ ó�� �����ϰ� �����

//�⺻Ÿ���� Ŭ���� ���� ����
//1.Ÿ�԰��� ����ȯ(���ڸ� ���ڷ�:Integer.parseInt(s))
//2.parameter ���  : void m(int i); ,,,, void m(Integer i)
//3.Ŭ������ �����ؼ� ���� ����� ����Ҷ�
public class Ex08_Wrapper_Class {
	public static void main(String[] args) {
		Integer n = new Integer(100);
		//���������� : private int value; public Integer(int value){}
		
		System.out.println(n);
		System.out.println(n.hashCode());//���������� �س��Ʊ� ������
		System.out.println(n.MIN_VALUE + "//"+n.MAX_VALUE);
		
		IntegerMethod(n);//������ �����ٸ� �ּҰ� ������ ��
		intMethod(n);//�ּҰ����� ���� ã�Ƽ� intMethod(100)
		
		Integer  i2 = new Integer(100);
		Integer  i3 = new Integer(100);
		
		System.out.println(i2 == i3);
		System.out.println(i2.equals(i3));//equals override ���� �� 
		
		
	}
	static  void IntegerMethod(Integer i){
		System.out.println("param "+ i);
	}
	static void intMethod(int i){
		System.out.println("int param :" + i);
	}
}
