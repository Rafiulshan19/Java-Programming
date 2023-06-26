package oop;

import Humans.Human;

public class GadgetPark {

	
	public SmartPhone purchaseSmartPhone(Human human, String model) {
		
		System.out.println("Thank you " + human.getName() + " for purchasing. \nEnjoy your new " + model);
		
		SmartPhone sm = new SmartPhone(model, true, true);
		human.setPhone(sm);
		return sm;
	}
}
