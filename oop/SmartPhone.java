package oop;

public class SmartPhone extends Phone {
	
//	private boolean isGPSEnabled = true;
//	private boolean isBluetoothEnabled = true;
//	private boolean hasCamera = true;

	private boolean isFaceDetectionEnabled  = false;
	private boolean isPaymentCapable = false;
	
	
	//Constructor
	
	public SmartPhone(String modelName, boolean isFaceDetectionEnabled, boolean isPaymentCapable) {
		super(modelName);
		
	}

	//Methods
	
	public void takePicture() {
		System.out.println(super.modelName + " is taking a photo using Camera.");
	}

	@Override
	public void settings() {
		// TODO Auto-generated method stub
		super.settings();
		
		System.out.println("-GPS");
		System.out.println("-Bluetooth");
		System.out.println("-Camera");
		
		if(isFaceDetectionEnabled == true) {
			System.out.println("-Face Detection");
		}
		if(isPaymentCapable == true) {
			System.out.println("-Payment");
		}
	}
	
	
}
