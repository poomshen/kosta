
public class Ex07_Total_Quiz_te {
	public static void main(String[] args) {
		int[][] score = { 
				{ 50, 60, 40 }, // 0�� ö�� ��,��,��
				{ 100, 80, 70 }, // 1�� ���� ��,��,��
				{ 55, 60, 80 } // 2�� ���� ��,��,��
		};
		// ����
		// 1. �� ���� ����, ����� ���ϼ���
		// ���� : 50 + 100 + 55 > �������� 300 , ���
		/* �� ���� ����, ��� ���ϱ� */

		int person_Sum = 0; // �л� ������ ����
		int ko_Sum = 0; // ���� ������ ����
		int en_Sum = 0; // ���� ������ ����
		int math_Sum = 0; // ���� ������ ����

		float person_Ave = 0f; // �л� ������ ���
		float ko_Ave = 0f; // ���� ������ ���
		float en_Ave = 0f; // ���� ������ ���
		float math_Ave = 0f; // ���� ������ ���

		for (int[] rows : score) {
			ko_Sum += rows[0]; // ���� ���� �޾� ���ϱ� , ���� ���� �ϼ� ����
			en_Sum += rows[1]; // ���� ���� �޾� ���ϱ� , ���� ���� �ϼ� ����
			math_Sum += rows[2]; // ���� ���� �޾� ���ϱ� , ���� ���� �ϼ� ����
		}

		// ����, ���� , ���� ���� ���� ���
		System.out.print("���� ���� : " + ko_Sum + "\t\t\t");
		System.out.print("���� ���� : " + en_Sum + "\t\t\t");
		System.out.println("���� ���� : " + math_Sum + "\t\t");

		ko_Ave = ko_Sum / (float) score.length; // ���� ������ ��� ���ϱ�
		en_Ave = en_Sum / (float) score.length; // ���� ������ ��� ���ϱ�
		math_Ave = math_Sum / (float) score.length; // ���� ������ ��� ���ϱ�

		System.out.print("���� ��� : " + ko_Ave + "\t\t");
		System.out.print("���� ��� : " + en_Ave + "\t\t");
		System.out.println("���� ��� : " + math_Ave + "\t\t");

		// 2. �� �л��� ���� , ���� , ���� ������ ���� , ���
		// ö�� ���� : 150 , ��� 15.0
		// ���� ���� : 150 , ��� 15.0
		// ���� ���� : 150 , ��� 15.0
		System.out.println("\t����\t\t����\t\t����\t\t����\t\t���");
		for (int[] rows : score) {
			for (int col : rows) {
				System.out.print("\t" + col + "\t"); // �л��� �� ���� ���� ���
				person_Sum += col; // �л��� ���� ���ϱ�
			}
			person_Ave = person_Sum / (float) score.length; // �л� ������ ��� ���ϱ�
			System.out.print("\t" + person_Sum + "\t\t" + person_Ave);
			person_Sum = 0;
			person_Ave = 0;
			System.out.println();
		}
		System.out.println("------------------------------------------");
		///////////////////�Ϲ�for��////////////////////////////
		
		int kortotal = 0; 
		int engtotal = 0;
		int mathtotal = 0;
		for(int i = 0 ; i < score.length ; i++){
			kortotal += score[i][0];
			engtotal += score[i][1];
			mathtotal += score[i][2];
			
		}
		System.out.printf("korsum:[%d] engsum:[%d] mathsum:[%d]\n",kortotal,engtotal,mathtotal);
		System.out.printf("koravg:[%f] engavg:[%f] mathavg:[%f]\n",kortotal/(float)3,engtotal/(float)3,mathtotal/(float)3);
	
				
		System.out.print("����\t ����\t ����\t ����\t ���\n");
		for(int i = 0 ; i < score.length ; i++){
			int sum = 0;
			for(int j =0 ; j < score[i].length ; j++){
				sum += score[i][j];
				System.out.print(score[i][j]+"\t");
			}
			System.out.println(sum+"\t" + sum/(float)score[i].length);
		}

		
		
		
	}

}
