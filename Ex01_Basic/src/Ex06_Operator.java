public class Ex06_Operator {
	public static void main(String[] args) {
		// ���
		// ���ǹ�: if , if~else ,if~else if ~else
		// ���ǹ�: switch(����� ���� ���� ��� : ����)
		// switch(���ǰ�){
		// case 100: �������;
		// break;
		// case 90 : �������;
		// break;
		// default : ����
		// }

/*		int score = 80;
		switch (score) {
		case 100:
			System.out.println("100" + score);
			break;
		case 90:
			System.out.println("90" + score);
			break;
		case 80:
			System.out.println("80" + score);
			break;
		case 70:
			System.out.println("70" + score);
			break;
		case 60:
			System.out.println("60" + score);
			break;
		case 50:
			System.out.println("50" + score);
			break;
		default:
			System.out.println("����ġ");
			
		}
//�ҽ� ����
//ctrl + shift +F ����
*/		int score = 80;
		switch (score) {
		case 100:System.out.println("100" + score);
		case 90:System.out.println("90" + score);
		case 80:System.out.println("80" + score);
		case 70:System.out.println("70" + score);
		case 60:System.out.println("60" + score);
		case 50:System.out.println("50" + score);
		default:System.out.println("����ġ");
		}
		
		//���� (������ : ������ ���Ⱚ)
		//�ڹ� API > ������ ������ �� �ְ� ����
		//java.lang(default package) : open
		//Math Ŭ���� ����ϱ� ���ؼ� ���ڸ� �� �ʿ����.
		//a pseudorandom double greater than or equal to 0.0 and less than 1.0.
		System.out.println("Math.random():"+Math.random());
		System.out.println("Math.random()*10:"+Math.random()*10);
		System.out.println("(int)(Math.random()*10):"+(int)(Math.random()*10));
		
		
		//���� 1~ 10������ ���� 
		int mun = (int)(Math.random()*10)+1;
		if(mun <= 10){
			System.out.println(mun);
		}
		//�ó�����
		//��ȭ�� ��ǰ ��÷
		//��ǰ ��÷�� 1000���� ������
		//Tv, NoteBook, ����� , �ѿ� , �縻 ,��� ��ǰ
		//900 ���� ������ 
		
		int sum = (int)(Math.random()*10)+1;

		String guon = "";
		sum*=100;
		switch (sum) {
		case 1000:
			guon += "TV ";
		case 900 :
			guon += "NoteBook ";
		case 800 :
			guon +="����� ";
		case 700 : 
			guon +="�ѿ� ";
		case 600 :
			guon +="���� ";
		default:
			guon +="�縻 ";
		}
		System.out.println("����� ������"+sum+"�̰� ��ǰ�� :" +guon);
	}
}
