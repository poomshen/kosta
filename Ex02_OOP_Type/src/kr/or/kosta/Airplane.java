package kr.or.kosta;

//우리 회사는 비행기를 주문제작 하는 회사 입니다.
//우리 회사는 비행기를 생산하는 셀계도를 만들려고 합니다.
//요구사항
//1.비행기를 생산하고 비행기의 이름과 비행기를 번호를 부여합니다.
//2.비행기가 생산되면 비행기의 정보 (이름, 비행기 번호를 )출력 해서 확인 할수 있습니다.
//3.현재 까지 만들어진 비행기를 총 누적대수를 확인 할수 있습니다.(출력)
public class Airplane {
	public String airplaneName ;
	public int airplaneNo ;
	public static int airplaneAccrue;
	
	public Airplane(String airplaneName,int airplaneNo){
		airplaneAccrue++;
		System.out.printf("비행기의 이름:%s  ,번호:%d  ,누적갯수:%d \n",airplaneName,airplaneNo ,airplaneAccrue);
	}
	

}
