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
		
		//inSrc [read 해서 temp 배열 [write]
		input.read(temp, 0, temp.length);
		//input  read 대상: inSrc > temp 배열의 0번째 방부터 temp 배열의 길이 만큼
		//read()함수를 이용해 temp에  담겠다.
		System.out.println("temp After : "+ Arrays.toString(temp));
		
		
		output.write(temp,5,5);
		//output(ByteArrayOutputStream) 에다가 temp 배열에 있는 값 read > write
		
		System.out.println("outSre before 배열 :"+ Arrays.toString(outSrc));
		outSrc = output.toByteArray();
		System.out.println("outSre After 배열 :"+ Arrays.toString(outSrc));
		
	}
}
