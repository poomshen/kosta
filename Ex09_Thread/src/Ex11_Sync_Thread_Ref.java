
class  Data {
	int iv = 0;
}

class MyThreadData extends Thread {
	Data d; //������(Data Ŭ������ �ּҰ�
	public  MyThreadData(Data a){
		this.d= a;
	}
	@Override
	public void run() {
		int lv = 0 ;
		while(lv <3) {
			System.out.println(this.getName() +" local var : "+ ++lv);
			System.out.println(this.getName() + " instance var:" + ++d.iv);
			System.out.println();
		}
	}
}

public class Ex11_Sync_Thread_Ref {
	public static void main(String[] args) {
		Data a = new Data();// a�� �ּҰ� (xxx����)
		MyThreadData th = new MyThreadData(a) ; //xx����
		MyThreadData  th2 = new MyThreadData(a);// xx����
		th.start();
		th2.start();
	}
}