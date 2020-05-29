package com.javaex.ex04;

public class Person {
	private String name, hp, company;

	public Person() {}
	public Person(String name, String hp, String company) {
		this.name = name;
		this.hp = hp;
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Person [ name = " + name + ", hp = " + hp + ", company = " + company + "]";
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + hp);
		System.out.println("회사 : " + company);
		System.out.println();
	}
}