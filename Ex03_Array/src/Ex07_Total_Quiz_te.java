
public class Ex07_Total_Quiz_te {
	public static void main(String[] args) {
		int[][] score = { 
				{ 50, 60, 40 }, // 0행 철이 국,영,수
				{ 100, 80, 70 }, // 1행 순이 국,영,수
				{ 55, 60, 80 } // 2행 용이 국,영,수
		};
		// 문제
		// 1. 각 과목별 총점, 평균을 구하세요
		// 국어 : 50 + 100 + 55 > 국어총합 300 , 평균
		/* 각 과목별 총점, 평균 구하기 */

		int person_Sum = 0; // 학생 점수의 총점
		int ko_Sum = 0; // 국어 점수의 총점
		int en_Sum = 0; // 영어 점수의 총점
		int math_Sum = 0; // 수학 점수의 총점

		float person_Ave = 0f; // 학생 총점의 평균
		float ko_Ave = 0f; // 국어 총점의 평균
		float en_Ave = 0f; // 영어 총점의 평균
		float math_Ave = 0f; // 수학 총점의 평균

		for (int[] rows : score) {
			ko_Sum += rows[0]; // 국어 점수 받아 더하기 , 국어 총점 완성 예정
			en_Sum += rows[1]; // 영어 점수 받아 더하기 , 영어 총점 완성 예정
			math_Sum += rows[2]; // 수학 점수 받아 더하기 , 수학 총점 완성 예정
		}

		// 국어, 영어 , 수학 점수 총점 출력
		System.out.print("국어 총점 : " + ko_Sum + "\t\t\t");
		System.out.print("영어 총점 : " + en_Sum + "\t\t\t");
		System.out.println("수학 총점 : " + math_Sum + "\t\t");

		ko_Ave = ko_Sum / (float) score.length; // 국어 총점의 평균 구하기
		en_Ave = en_Sum / (float) score.length; // 영어 총점의 평균 구하기
		math_Ave = math_Sum / (float) score.length; // 수학 총점의 평균 구하기

		System.out.print("국어 평균 : " + ko_Ave + "\t\t");
		System.out.print("영어 평균 : " + en_Ave + "\t\t");
		System.out.println("수학 평균 : " + math_Ave + "\t\t");

		// 2. 각 학생의 국어 , 영어 , 수학 점수의 총점 , 평균
		// 철이 총점 : 150 , 평균 15.0
		// 순이 총점 : 150 , 평균 15.0
		// 용이 총점 : 150 , 평균 15.0
		System.out.println("\t국어\t\t영어\t\t수학\t\t총점\t\t평균");
		for (int[] rows : score) {
			for (int col : rows) {
				System.out.print("\t" + col + "\t"); // 학생의 각 과목 점수 출력
				person_Sum += col; // 학생의 총점 구하기
			}
			person_Ave = person_Sum / (float) score.length; // 학생 총점의 평균 구하기
			System.out.print("\t" + person_Sum + "\t\t" + person_Ave);
			person_Sum = 0;
			person_Ave = 0;
			System.out.println();
		}
		System.out.println("------------------------------------------");
		///////////////////일반for문////////////////////////////
		
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
	
				
		System.out.print("국어\t 영어\t 수학\t 총점\t 평균\n");
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
