package kr.or.kosta;

//�츮 ȸ��� ����⸦ �ֹ����� �ϴ� ȸ�� �Դϴ�.
//�츮 ȸ��� ����⸦ �����ϴ� ���赵�� ������� �մϴ�.
//�䱸����
//1.����⸦ �����ϰ� ������� �̸��� ����⸦ ��ȣ�� �ο��մϴ�.
//2.����Ⱑ ����Ǹ� ������� ���� (�̸�, ����� ��ȣ�� )��� �ؼ� Ȯ�� �Ҽ� �ֽ��ϴ�.
//3.���� ���� ������� ����⸦ �� ��������� Ȯ�� �Ҽ� �ֽ��ϴ�.(���)
public class Airplane {
	public String airplaneName ;
	public int airplaneNo ;
	public static int airplaneAccrue;
	
	public Airplane(String airplaneName,int airplaneNo){
		airplaneAccrue++;
		System.out.printf("������� �̸�:%s  ,��ȣ:%d  ,��������:%d \n",airplaneName,airplaneNo ,airplaneAccrue);
	}
	

}
