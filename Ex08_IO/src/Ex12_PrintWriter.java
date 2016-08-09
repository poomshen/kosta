import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Ex12_PrintWriter {

		//PrintWriter ��ü�� ����ϸ� [�������]�� �����ϱ� ���ϴ�
		//[ �� ��  ]���� ���� ������ ������ �����ΰ� �����͸� ����Ҷ�
			public static void main(String[] args) {
				try {
					//���ϻ������ ������ �ִ�
					PrintWriter pw = new PrintWriter("C:\\Temp\\homework2.txt");
					pw.println("*************************************");
					pw.println("*        HOMEWORK                   *");
					pw.println("*************************************");
					pw.printf("%3s  : %5d  %5d  %5d  %5.1f ", "�ƹ���",10,30,50,(float)((10+30+50)/3));
					pw.println();
					pw.printf("%3s  : %5d  %5d  %5d  %5.1f ", "������",100,30,50,(float)((100+30+50)/3));
					pw.println();
					pw.printf("%3s  : %5d  %5d  %5d  %5.1f ", "�̼���",10,90,50,(float)((10+90+50)/3));
					pw.println();
					pw.close(); //close() �����Ͽ� write
					
					//read....
					FileReader fr = new FileReader("C:\\Temp\\homework2.txt");
					BufferedReader br = new BufferedReader(fr); //���� : line() enter �������
					String s="";
					while((s = br.readLine()) != null){
						System.out.println(s);
					}
					br.close();
					fr.close();
				} catch (Exception e) {
				
					e.printStackTrace();
				}
				

			}

		}
