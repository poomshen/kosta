package teamFunction;

public class TeamMain {
	public static void main(String[] args) {
		FileDB db  = new FileDB();
		db.playerDBin();
		OutPrint print = new OutPrint();
		print.login_OutPrint();
	}
}