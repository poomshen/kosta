
public class Ex07_Total_Quiz {
	public static void main(String[] args) {
		int[][] score = {
				{50,60,40}, //0�� ö�� ��,��,��	
				{100,70,80}, //0�� ���� ��,��,��	
				{55,60,80} //0�� ���� ��,��,��	
		};
		//����
		//1. �� ���� ���� , ����� ���ϼ���
		//���� : 50+100+55 > �������� 300, ���
		//2. �� �л��� ���� , ���� ���������� ���� , ���
		//ö�� ���� :150, ���15.0
		int []sum = {0,0,0};
		String []note ={"����","����","����"};
		String []note2 ={"ö��","����","�����"};
		int []sum1 = {0,0,0};
		float avarage= 0f;
		
		for(int []i : score){
			int su=0;
			su++;
			for(int j=0 ; j<score.length;j++){
				sum1[j] += i[j];
				avarage = sum1[j]/3;
			}
			System.out.println(" ���� :"+note[su]+" ����"+sum1[su] +" ���: "+avarage);
		}
		for(int j =0 ; j<score.length ;j++){
			System.out.print("�л�:"+note2[j]+" ");
			for(int i :score[j]){
				sum[j] += i;
				System.out.print("����:"+note[j]+"����"+i+"\t");
			}
			avarage = sum[j]/3;
			System.out.println(" �� :"+sum[j]+"���:"+ avarage);
		}
		
	}
}
