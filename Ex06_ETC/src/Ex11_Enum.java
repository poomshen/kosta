/*
    ������(Ÿ��)
   class  Cal{
    public Static final int nim = 0;
    
    	����ڰ� ������ �ɹ��� ����������  ��� ���� ������ �ִ� ��ȿ��(Ÿ��)
    	
    	enum  �������̸� (��� �ɹ� ������)
    	public enum Season {SPRING , SUMMER , FALL , WINTER}
������ ����� ���������� 0 ���� 1�� �����ϸ鼭 ���� ������

�������� ������ �ڵ��� ������ 

������ ���� ��ġ (Ŭ���� , Ŭ���� �ȿ��� )

�������� Ÿ���̴� ...static final 
    	
*/
enum Season {SPRING , SUMMER , FALL , WINTER}

public class Ex11_Enum {
	///������ Ÿ���� �� �ʿ� �ұ�?
	public static void main(String[] args) {
		
		Season s = Season.SPRING;
		System.out.println(s);
	    for(Season s2 : Season.values()){
	    	System.out.println(s2.name() + " / " + s2.ordinal());
	    }

	}

}