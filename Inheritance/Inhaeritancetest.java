package Inheritance;

public class Inhaeritancetest {

	public static void main(String[] args) {
		
		Teacher t = new Teacher("Mannan");
		Doctor doc = new Doctor("Bari");
		Singer s = new Singer("Razzak");
		
		t.giveALeasson();
		doc.giveSuggestion();
		s.singASong();
		
		t.eat();
		doc.walk();
		s.sleep();
		
		t.swim();
		doc.swim();
		s.swim();
		System.out.println("--------------");
		
		String str1 = t.getName();
		System.out.println(str1);
		String str2 = s.getName();
		System.out.println(str2);
		String str3 = doc.getName();
		System.out.println(str3);
		System.out.println("--------------");
		
		t.getPhone().settings();
		doc.getPhone().takePicture();
		s.getPhone().call(54615205);
		
		
	}

}
