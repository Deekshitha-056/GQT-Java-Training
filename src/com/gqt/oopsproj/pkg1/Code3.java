package com.gqt.oopsproj.pkg1;
//Shadowing Problem:
// It is a scenario where the compiler is confused in differentiating  between instance and local variable.
// This results in the default values being retained in the instance variable.
class Dog3 {
	private String name;
	private int cost;
	private int age;
	private String color;
	private String breed;
	//general setters and getters
	void setData(String name, int cost, int age, String color,String breed) {
		name=name;
		cost=cost;
		age=age;
		color=color;
		breed=breed;
	}
	void getData() {
		System.out.println(name);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(color);
		System.out.println(breed);
	}
}	
public class Code3 {

	public static void main(String[] args) {
		Dog3 d1=new Dog3();
		d1.setData("Rocky", 5000, 5, "White", "GR");
		d1.getData();

	}

}
