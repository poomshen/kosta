package FactoryMethod;

import java.util.Scanner;

public class User {
 public static void main(String[] args) {
	PitcherPlayerFactory playerFactory = new PitcherPlayerFactory();
	Scanner sc = new Scanner(System.in);
	System.out.println("��� �Ͻ� ������ �Է� �ϼ���");
	String  name = sc.nextLine();
	System.out.println("���̸� �Է� �ϼ���");
	int age = Integer.parseInt(sc.nextLine());
	playerFactory.create(name,age);
	
	System.out.println();
}
}