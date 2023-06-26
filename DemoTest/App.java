package DemoTest;

import Humans.Doctor;
import Humans.Singer;
import Humans.Teacher;
import oop.GadgetPark;
import oop.NonSmartPhone;
import oop.SmartPhone;

public class App {

	public static void main(String[] args) {
		
		GadgetPark park = new GadgetPark();
		
		
		Singer tahsan = new Singer("Tahsan");
		Teacher mannan = new Teacher("Mannan");
		Doctor selim = new Doctor("Mannan");
		
		SmartPhone sp;
		sp= park.purchaseSmartPhone(tahsan, "iPhone XI");
		sp = park.purchaseSmartPhone(mannan, "iPhone 9");
		sp = park.purchaseSmartPhone(selim, "Samsung S8");
		
		//tahsan.setPhone(sp);
		tahsan.getPhone().takePicture();
//		mannan.getPhone().settings();
		selim.getPhone().call(49682);
		
		
		//mannan.getPhone().settings();
//		selim.getPhone().settings();
		//--------------
//		SmartPhone smart = new SmartPhone("iPhone 9", false, true);
//		
//		Singer topu = new Singer("Topu");
//		topu.setPhone(smart);
//		topu.getPhone().takePicture();

	}

}
