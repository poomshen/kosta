
//�� ������ ������ ��� ���� (x)
// sysotrong  i = 100  string ="ȫ�浿"

//1.Strint Ŭ���� :���������� �������� char[] ����
//2steint  name ="ȫ�浿 > [ȫ][��][��] > �迭 �ڿ� �״�� ���
public class Ex05_String {
	public static void main(String[] args) {
		String  str1="AA";
		String  str2="AA";
		System.out.println(str1 +" /" + str2);
		System.out.println("�ּҰ� �� :"+ str1 == str2  );
		//key point 
		//������ ��
		System.out.println(str1.equals(str2));
		
		String str3 = new String("BBB");
		String str4 = new String("BBB");
		System.out.println(str3 +" /" + str4);
		System.out.println("�ּҰ� �� :"+ str3 == str4  );

	}
 
}
