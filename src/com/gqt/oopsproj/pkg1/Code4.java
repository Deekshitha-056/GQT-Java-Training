package com.gqt.oopsproj.pkg1;
//Solution to shadowing problem:
// The usage of "this" keyword with instance variable will help the compiler to recognize the instance and local variables.
// The variables with 'this" keyword association is the instance variables.
// Instance variables are also caleed as Object variables as they will be getting memories along with the object.
class Dog4{
private String name;
private int cost;
private int age;
private String color;
private String breed;
//general setters and getters
void setData(String name, int cost, int age, String color,String breed) {
	this.name=name;
	this.cost=cost;
	this.age=age;
	this.color=color;
	this.breed=breed;
}
void getData() {
	System.out.println(name);
	System.out.println(cost);
	System.out.println(age);
	System.out.println(color);
	System.out.println(breed);
}
}
public class Code4 {
	public static void main(String[] args) {
		Dog4 d1=new Dog4();
		d1.setData("Rocky", 5000, 5, "White", "GR");
		d1.getData();

	}

}
