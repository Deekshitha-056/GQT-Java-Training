package com.gqt.oopsproj.pkg1;
//Example program where encapsulation is present
class Dog{
	private String name;
	private int cost;
	private int age;
	private String color;
	private String breed;
	// Independent setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
}
public class Code1 {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.setName("tommy");
		d1.setCost(2000);
		d1.setAge(3);
		d1.setColor("Brown");
		d1.setBreed("GR");
		
		System.out.println(d1.getName());
		System.out.println(d1.getCost());
		System.out.println(d1.getColor());
		System.out.println(d1.getAge());
		System.out.println(d1.getBreed());
		
	}

}

