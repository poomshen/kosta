package FactoryMethod;

public abstract class Player {
	private int  age;
	private String name;
	
	public abstract void batting_Ball(int ball);
	public abstract void throw_Ball(int ball);
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
