package DemoTest;

import Humans.Singer;
import oop.GadgetPark;
import oop.SmartPhone;

public class NewPhoneTest {

	public static void main(String[] args) {
		
		GadgetPark park = new GadgetPark();
		
		Singer singer = new Singer("Tahsan");
		SmartPhone sp = park.purchaseSmartPhone("iPhone 13");
		singer.setPhone(sp);
		singer.getPhone().takePicture();
		
		//--------------
//		SmartPhone smart = new SmartPhone("iPhone 9", false, true);
//		
//		Singer topu = new Singer("Topu");
//		topu.setPhone(smart);
//		topu.getPhone().takePicture();

	}

}
