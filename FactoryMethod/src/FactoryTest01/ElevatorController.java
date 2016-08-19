package FactoryTest01;

public class ElevatorController {
	private  int id;//���������� id
	private int curFloor; //���� ��
	
	public ElevatorController(int id){
		this.id = id;
		curFloor =1;
	}

	public void gotofloor(int destination) {
		System.out.print("Elevator ["+ id +"]  Floor:"+curFloor);
		
		//���� �� ���� , ��  �־��� ������ ��(destination)���� ���������Ͱ� �̵���
		curFloor = destination;
		System.out.println(" === >" +curFloor);
	}
}
