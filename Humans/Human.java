package Humans;

import oop.NonSmartPhone;
import oop.SmartPhone;

public class Human {

	private String name;
	private SmartPhone phone;
	
	public SmartPhone getPhone() {
		
		if(this.phone == null) {
			System.out.println("Ooops; I don't own any phone.");
			System.exit(1);
		}
		
		return phone;
	}

	public void setPhone(SmartPhone phone) {
		this.phone = phone;
	}
//------------------------------

//--------------------------------
	public String getName() {
		return name;
	}

	public Human(String name) {
		this.name = name;
	}
	
	public void eat() {
		
		System.out.println(this.name + " is eating.");
	}
	public void sleep() {
			
			System.out.println(this.name +" is sleeping.");
		}
	public void walk() {
		
		System.out.println(this.name + " is walking.");
	}
	public void swim() {
		
		System.out.println(this.name + " is swiming.");
	}
}
