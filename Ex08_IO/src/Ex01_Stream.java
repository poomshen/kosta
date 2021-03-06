import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

// I/0 입출력
//
//Strieam(연결통로,입출력 , input, output) =>빨대
//Stiieam(고정된 크기의 빨대 :Byte 단위의 데이터 처리) -> byte[] 배열

//Java api
//추상클래스
//inputstream:입력(read)
//outputstream: 츨력(write)

//추상클래스를 상속하고 있는 클래스 제고
//대상
//File : FileInputStream , FileOutPutStream
//Memory : ByteArrayInputStream ,ByteArrayOutPutStream

//프로세스, 오디오 
//보조스트림(Buffer ...)
//File read write 성능 (I/O Disk 성능 향상)

public class Ex01_Stream {
	public static void main(String[] args) {
		//Memory 대상으로
		//byte (128~0~127)
		byte[] inSrc = {123,2,2,3,4,5,6,7,8,9};
		//[0] => 0
		//[9] => 9
		//length =>10
		
		byte[] outSrc = null;//배열은 객체(null초기화)
		
		ByteArrayInputStream input = null; //read
		ByteArrayOutputStream output = null; //write
		
		input = new ByteArrayInputStream(inSrc);//생성자에서 read 대상 (input)
		output = new ByteArrayOutputStream(); //write 대상(배열)\
		
		System.out.println("ourSrc Before :" + Arrays.toString(outSrc));
		
		int data = 0;
		while((data = input.read()) != -1){ //더이상 read() 할 것이 없으면 -1
			//한 byte read > data 변수에 ...
//			System.out.println(data);
			
			//로직 input.read(0) 쓰지 못하는 이유
			//read() 함수가 next 가지고 있어요
//			System.out.println("read 한 값을 출력 :"+input.read());
			
			output.write(data);
			//받은 data 값을  outputstream 객체에 write
		}
		outSrc = output.toByteArray();
		//ByteArrayOutputStream 안에 담긴 값을 byte[] 형태로 리턴
		System.out.println("outScr After :"+ Arrays.toString(outSrc));
	}
}
