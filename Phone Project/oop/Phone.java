package oop;

import java.util.ArrayList;

public class Phone {

	// Property or, Field
	int a = 500;
	public int b = 1000;
	protected String modelName = "iPhone 7"; 
	private String modelName2 = "Samsumg 32";
	private String[] Contacts = {"afra", "naila", "lima"};
	private ArrayList<String> contacts = new ArrayList<>();
	
	private boolean isGPSEnabled = false;
	private boolean isFaceDetectionEnabled  = false;
	private boolean isBluetoothEnabled = false;
	private boolean isPaymentCapable = false;
	
	String name = "Rina";
	
	// -------------------------Constructor-----------------------------------------------
	
//	public Phone() {
//		
//	}
	
	public Phone(String modelName , boolean isGPSEnabled, boolean isFaceDetectionEnabled, boolean isBluetoothEnabled, boolean isPaymentCapable) {
//	public Phone(String modelName ) {	
		this.modelName = modelName;
		this.isGPSEnabled = isGPSEnabled;
		this.isBluetoothEnabled = isBluetoothEnabled;
		this.isFaceDetectionEnabled = isFaceDetectionEnabled;
		this.isPaymentCapable = isPaymentCapable;
	}
	
	// -------------------------Methods-------------------------------------------------
	
	public void settings() {
		
		System.out.println("Model is: " + this.modelName);
		System.out.println("Display");
		System.out.println("Phone");
		System.out.println("Sound");
		
		if(isGPSEnabled == true) {
			System.out.println("GPS");
		}
		
		if(isFaceDetectionEnabled == true) {
			System.out.println("Face Detected");
		}
		System.out.println("Privacy");
		System.out.println("Message");
		System.out.println("Photos");
		
		if(isBluetoothEnabled == true) {
			System.out.println("Bluetooth");
		}
		
		if(isPaymentCapable == true) {
			System.out.println("Payment");
		}

	}
	public void addContacts(String names) {
		contacts.add(names);
	}
	public void deleteContacts(String names) {
		contacts.remove(names);
	}
	public void newContacts() {
		for(int i = 0; i < contacts.size(); i++) {
			System.out.println("Hi there. " + contacts.get(i));
		}
	}
	public void showContacts() {
		for(int i = 0; i < Contacts.length; i++) {
			System.out.println("Hi there. " + Contacts[i]);
		}
	}
	public void groupSMS(String sms, int[] numbers) {
		for(int i=0; i < numbers.length; i++ ) {
			System.out.println("hi there. " + sms + ". Sending sms to " + numbers[i]);
		}
	}
	
	void call() {
		System.out.println("Calling to Rina");
	}
	private void text() {
		System.out.println("text message to Rina");
	}
	
	public void camera() {
		System.out.println("Clicking a photo to " + name);
	}
	public void call(int cell) {
		System.out.println("Calling to  " + cell);
	}
	public void model(String modelName) {
		System.out.println("Model is  " + modelName);
	}
	public void model2() {
		System.out.println("2nd Model is  " + modelName2);
	}
	
}
