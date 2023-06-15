package Inheritance;

import oop.SmartPhone;

public class Singer extends Human{

	private SmartPhone phone = new SmartPhone("Samsung Galaxy 20", true, true);
	
	public SmartPhone getPhone() {
		return this.phone;
	}
	
	public Singer(String name) {
		super(name);
	}

	
	@Override
	public void swim() {
		
//		super.swim();
		System.out.println("Sorry, can't swim");
	}



	public void singASong() {
		System.out.println("Maje maje tobe dekha pai, chiro din pai na.");
	}
}
