package kr.or.kosta;

public class MyStack {
	static int index = 0; 
	MyStack st = null;
//	Object[] data = new Object[10];
	Object[] data;
	
	public void Push(Object data){
//		Object[] temp = new Object[index];
		this.data = new Object[index+1];
		this.data[index] = data;
		index++;
	}
	
	public Object Pop(){
		return data[--index];
	}
}
