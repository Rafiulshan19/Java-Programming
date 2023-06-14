package oop;

public class PhoneTest {

	public static void main(String[] args) {
		
//		Phone p = new Phone();
		
//		p.call();
//		p.camera();
//		p.call(1326825167);
//		p.model("iPhone X");
//		p.model2();
////		p.text();
//		System.out.println(p.a);
//		System.out.println(p.b);
//		System.out.println();
//
//		p.showContacts();
//		System.out.println("--------------------------------------");
//		int[] nms = {121374, 6584547, 6472587 ,7984798, 87456};
//		p.groupSMS("How's hanging bro", nms);
//		System.out.println("--------------------------------------");
//		
//		p.addContacts("Sumi");
//		p.addContacts("Rima");
//		p.addContacts("Riya");
//		p.addContacts("Ritu");
//		p.addContacts("Layla");
//		p.newContacts();
//		p.deleteContacts("Layla");
//		p.newContacts();
//----------Constructor---------------
//		p.settings();
		
		System.out.println("-----------iPhone---------");
		Phone myIPhone = new Phone("iPhone X", true, false, true, true);
		myIPhone.settings();
		System.out.println("----------Samsung----------");
		Phone mySmasung = new Phone("Galaxy Y18", true, true, true, true);
		mySmasung.settings();
		System.out.println("-----------Nokia---------");
		Phone myNokia = new Phone("3360", false, false, false, false);
		myNokia.settings();
		
		System.out.println("---------------------------------------");
	

		
		
		
		
	}

}
