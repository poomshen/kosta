import java.io.FileInputStream;
import java.io.FileNotFoundException;

import kr.or.kosta.Person;

//�޼��� ���� ������
//throws ArithmeticException �ǹ�
//call �Լ��� �ϴ� ����� throws ArithmeticException ��  ���� �� �ִ� ���� ó��
class Test{
					// ����
	void call() throws ArithmeticException , IndexOutOfBoundsException{
		System.out.println("Call �Լ� ����");
		//try{} �ϸ� ��������
		int i  =1/0;
		System.out.println("Call �Լ� ��");
	}
}

public class Ex04_method_throws {
	public static void main(String[] args) {
		Test t = new Test();
		//t.call(); �� �Լ��� ������ ���� �ȳ��� ��
		try {
			t.call();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("����");
		
		//java ����
		//�ڹٿ��� Ʈ���� ĳġ�� ���������� ���� �ʵ��� ������ ����
//		FileInputStream  f = new FileInputStream("C:\\temp\\a.txt");
		try {
			FileInputStream  f = new FileInputStream("C:\\temp\\a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Person p = new Person(100);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
