package FactoryMethod;

import java.util.Scanner;

public class User {
 public static void main(String[] args) {
	PitcherPlayerFactory playerFactory = new PitcherPlayerFactory();
	Scanner sc = new Scanner(System.in);
	System.out.println("등록 하실 선수를 입력 하세요");
	String  name = sc.nextLine();
	System.out.println("나이를 입력 하세요");
	int age = Integer.parseInt(sc.nextLine());
	playerFactory.create(name,age);
	
	System.out.println();
}
}
