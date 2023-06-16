package Humans;

import oop.SmartPhone;

public class Singer extends Human{

	private SmartPhone phone = new SmartPhone("iphone X", false, true);
//	private SmartPhone phone ;
	
	public SmartPhone getPhone() {
		return this.phone;
	}
//
	public void setPhone(SmartPhone phone) {
		this.phone = phone;
	}
//
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
