package org.jsp.springpractice;

public class User {
	private int age;
	private String name;
	
	public User() {
		System.out.println("User() called");
	}

	public User(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public void display() {
		System.out.println("user name: " +name);
		System.out.println("Age:"+age);
	}
}
