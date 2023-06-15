package Inheritance;

import oop.Phone;
import oop.SmartPhone;

public class Doctor extends Human {
	
	private SmartPhone phone = new SmartPhone("iPhone 9", false, false);
		
	public SmartPhone getPhone() {
		return this.phone;
	}

	public Doctor(String name) {
		super(name);
	}

	public void giveSuggestion() {
		
		System.out.println("Exercise regularly that helps to control diabetics");
	}
}
