//상속 관계에서 overrding(override)
//상속 관계에서 자식 클래스가 부모클래스의 메서드를 재정의 (내용만 바꿈)


//문법 
//1. 부모함수의 이름과 같아야 한다.

class Point2 extends Object{
	int x= 20;
	int y =30;
	String getPosition(){
		return "x : " + this.x +" Y :" +this.y;
		
	}
}

//부모 (getPosition >x,y)
//내 3가지 좌표  > x,y,z출력
//부모가 가지는 getPosition  재사용할수 없을 까?
class Point3D extends Point2 {
	//추가
	int z = 40;
//	String get3DPosition(){
//		return " x : " + this.x + " y :" + this.y + " z : "+this.z;
//	}
	// 재정의
//	String getPosition(){
//		return "x : " + this.x +" Y :" +this.y + " z : "+this.z;
//		
//	}

	@Override  //어노테이션
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
