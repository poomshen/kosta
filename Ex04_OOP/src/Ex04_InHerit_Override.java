//��� ���迡�� overrding(override)
//��� ���迡�� �ڽ� Ŭ������ �θ�Ŭ������ �޼��带 ������ (���븸 �ٲ�)


//���� 
//1. �θ��Լ��� �̸��� ���ƾ� �Ѵ�.

class Point2 extends Object{
	int x= 20;
	int y =30;
	String getPosition(){
		return "x : " + this.x +" Y :" +this.y;
		
	}
}

//�θ� (getPosition >x,y)
//�� 3���� ��ǥ  > x,y,z���
//�θ� ������ getPosition  �����Ҽ� ���� ��?
class Point3D extends Point2 {
	//�߰�
	int z = 40;
//	String get3DPosition(){
//		return " x : " + this.x + " y :" + this.y + " z : "+this.z;
//	}
	// ������
//	String getPosition(){
//		return "x : " + this.x +" Y :" +this.y + " z : "+this.z;
//		
//	}

	@Override  //������̼�
	String getPosition() {
		return "x : " + this.x +" Y :" +this.y + " z : "+this.z;
//		return super.getPosition();
	}
	
	
}

public class Ex04_InHerit_Override {
	public static void main(String[] args) {
		
		Point3D p = new Point3D();
//		String result  = p.get3DPosition();
		String result  = p.getPosition();
		System.out.println(result);
	}
}
