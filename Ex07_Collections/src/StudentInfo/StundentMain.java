package StudentInfo;

import java.util.ArrayList;

public class StundentMain {

	public static void main(String[] args) {
		ArrayList<StudentScore> student = new ArrayList<StudentScore>();
		student.add(new StudentScore("경제", 2012, "이성준",90,80,70));
		student.add(new StudentScore("컴공", 2011, "이성준" ,80,90,94));
		
		for(StudentScore s :student){
			s.stpint();
			s.sumcal();
			s.averageCal();
			s.calpint();
		}
		
	}

}
