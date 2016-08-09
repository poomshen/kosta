import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex02_Stream {
	public static void main(String[] args) {
		byte[] inSrc  = {0,120,2,3,4,5,6,7,10,101};
		byte [] outSrc = null;
		
		ByteArrayInputStream  input = null;
		ByteArrayOutputStream  output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		byte[] temp = new byte[10];
		System.out.println("temp Before : "+ Arrays.toString(temp));
		
		//inSrc [read �ؼ� temp �迭 [write]
		input.read(temp, 0, temp.length);
		//input  read ���: inSrc > temp �迭�� 0��° ����� temp �迭�� ���� ��ŭ
		//read()�Լ��� �̿��� temp��  ��ڴ�.
		System.out.println("temp After : "+ Arrays.toString(temp));
		
		
		output.write(temp,5,5);
		//output(ByteArrayOutputStream) ���ٰ� temp �迭�� �ִ� �� read > write
		
		System.out.println("outSre before �迭 :"+ Arrays.toString(outSrc));
		outSrc = output.toByteArray();
		System.out.println("outSre After �迭 :"+ Arrays.toString(outSrc));
		
	}
}