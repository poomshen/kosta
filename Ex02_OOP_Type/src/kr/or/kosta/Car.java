package kr.or.kosta;

//class, member field, method �տ���
//(������, ������, ������)
//1.default(���� ����)
//2.public(����:���� ���� x ��� �ڿ� ����)
//3.private(����: Ŭ�������ο����� ����, ��ü ���忡 ���� �Ұ�)

//Quiz
//widow private ���߰� (�Լ� read, write)���� �� �ִ� ����
//�Ժη� �ٲ��� ���Ѵ�.
//ĸ��ȭ 
//������ �����Ҵ� ���� �����Ҵ��� ���ؼ� �ڷ� ��ȣ (���ϴ� ���� ���� �� �ִ�.)
public class Car {
	private int window;
	public int tire;
	public String color;
	private int speed;
	
	//�Լ��� ���ؼ� window ���� ����
	//���(�Լ�) �ּ� (�Ѱ���)
	//read 
	//write 

	//write method(window) 
	public void writeWindow(int window){
		//�����Ҵ��� ���ؼ� �ڷẸȣ
		if(window>0){
			this.window = window;
		}else{
			this.window =0;
		}
	}
	
	
	//read method(window)
	public int readWindow(){
		return this.window;
	}
	
	//speed�� ���� �ϴ� 5�� ->speedUp()
	//speed�� ���� �ϴ� 5�� ->speedDown()
	public void speedUp(){
		this.speed+=5;
	}
	public void speedDown(){
		
	this.speed=(this.speed>0)?(this.speed-=5):0;
	}
	public void speefPrint(){
		System.out.println("�ӷ�  :"+speed);
	}
	
}
