
//���ڿ� ����
//String str = "A"
//for ( str+= "A") 10000��
//�������� ���ڸ� �����ؼ� ����ϴ� ���� ��ȿ��
//String > StringBuffer , StringBuilder
public class Ex10_StringBuffer {
	///����� �� ���������?
	public static void main(String[] args) {
		String str ="A"; 
		System.out.println(str.hashCode()); ////�� �׷� �ؽ� �ڵ��� ��ȭ�� �˾ƺ��� ���� �ǰ�?
		str+="B"; //......
		System.out.println(str.hashCode()); ////���ߴ��� �ؽ� �ڵ尡 ���߾� �׷��� 
		
		//StringBuffer �� �ᱹ char
		StringBuffer sb = new StringBuffer(); ///�ִ� ��Ʈ�����۷� �־��� �׷��� ��
		System.out.println(sb.capacity());  //�� �Լ��� �뷮�� ��Ÿ���� �Լ��� �⺻ 16�� �� ������ �ִٴ°�
		sb.append("A");
		sb.append("�ȳ��Ͻʴϱ� ���� �׷� ����Դϴ�."); //� Ÿ�����̿��� ���� �̰ǰ�?
		System.out.println(sb.length());/// ������ ��� �ִ� ���� ��Ÿ ���� ���̰�
		System.out.println(sb.hashCode()); // ��Ʈ�����۷� �ִϱ� �ؽ� �ڵ尡 ������ ������ �˼� ����
		sb.append("B");
		System.out.println(sb.hashCode());
		
		///String �� ��������� �迭���·� ���� �ް����� 
		///�ᱹ ���� �ּҰ� ��ġ�ϴ� StringBuffer��  String ����� �߰� �� ������ �޶����� �˼� �ִ� ������ ����.
		//�����׽�Ʈ (StringBuffer) ������ �ð� ����
		//�ð� �ǽø� ...
	}

}