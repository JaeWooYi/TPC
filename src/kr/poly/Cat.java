package kr.poly;

public class Cat extends Animal{
	@Override
	public void eat() {
		System.out.println("냥냥 먹다.");
	}
	
	public void night() {
		System.out.println("밤에 눈에서 빛이나.");
	}
}
