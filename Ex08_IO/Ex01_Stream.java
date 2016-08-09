import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

// I/0 �����
//
//Strieam(�������,����� , input, output) =>����
//Stiieam(������ ũ���� ���� :Byte ������ ������ ó��) -> byte[] �迭

//Java api
//�߻�Ŭ����
//inputstream:�Է�(read)
//outputstream: ����(write)

//�߻�Ŭ������ ����ϰ� �ִ� Ŭ���� ����
//���
//File : FileInputStream , FileOutPutStream
//Memory : ByteArrayInputStream ,ByteArrayOutPutStream

//���μ���, ����� 
//������Ʈ��(Buffer ...)
//File read write ���� (I/O Disk ���� ���)

public class Ex01_Stream {
	public static void main(String[] args) {
		//Memory �������
		//byte (128~0~127)
		byte[] inSrc = {123,2,2,3,4,5,6,7,8,9};
		//[0] => 0
		//[9] => 9
		//length =>10
		
		byte[] outSrc = null;//�迭�� ��ü(null�ʱ�ȭ)
		
		ByteArrayInputStream input = null; //read
		ByteArrayOutputStream output = null; //write
		
		input = new ByteArrayInputStream(inSrc);//�����ڿ��� read ��� (input)
		output = new ByteArrayOutputStream(); //write ���(�迭)\
		
		System.out.println("ourSrc Before :" + Arrays.toString(outSrc));
		
		int data = 0;
		while((data = input.read()) != -1){ //���̻� read() �� ���� ������ -1
			//�� byte read > data ������ ...
//			System.out.println(data);
			
			//���� input.read(0) ���� ���ϴ� ����
			//read() �Լ��� next ������ �־��
//			System.out.println("read �� ���� ��� :"+input.read());
			
			output.write(data);
			//���� data ����  outputstream ��ü�� write
		}
		outSrc = output.toByteArray();
		//ByteArrayOutputStream �ȿ� ��� ���� byte[] ���·� ����
		System.out.println("outScr After :"+ Arrays.toString(outSrc));
	}
}