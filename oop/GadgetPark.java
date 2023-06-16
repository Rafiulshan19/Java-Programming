package oop;

public class GadgetPark {

	
	public SmartPhone purchaseSmartPhone(String model) {
		
		System.out.println("Thank you for purchasing. \nEnjoy your new " + model);
		SmartPhone sm = new SmartPhone(model, false, true);
		return sm;
	}
}
