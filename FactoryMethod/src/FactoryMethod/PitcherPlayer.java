package FactoryMethod;

public class PitcherPlayer extends Player {

	@Override
	public void batting_Ball(int ball) {
		System.out.println("���� ģ��.");
		
	}

	@Override
	public void throw_Ball(int ball) {
		System.out.println("���� ������.");
	}

}