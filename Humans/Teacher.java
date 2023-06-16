package Humans;

import oop.NonSmartPhone;
import oop.SmartPhone;

public class Teacher extends Human {

	private NonSmartPhone phone = new NonSmartPhone("Nokia 1200");
	
	public NonSmartPhone getPhone() {
		return this.phone;
	}
	
	public Teacher(String name) {
		super(name);
	}

	public void giveALeasson() {

		System.out.println("Do not tell a lie to anyone.");
	}
}

