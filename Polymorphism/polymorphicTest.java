package Polymorphism;

public class polymorphicTest {

	public static void main(String[] args) {
		
		Human rafi = new Human("Rafi");
	
		
		/*
		 * Bus poribahan = new Bus("Ena Poribahan"); Train bogi = new
		 * Train("Surjomukhi Express");
		 * 
		 * rafi.travel(poribahan, "Bogra"); rakesh.travel(bogi, "Sylhet");
		 */
		
		Transport t;
//		t = new Transport("Hero Honda");
//		t = new Bus("Orin travels");
//		t = new Train("Lalmoni Express");
		t = new Car("Toyota");
		
		rafi.travel(t, "Dhaka");

	}

}


class Human {
	
	String name;
	
	public Human(String name) {
		this.name = name;
	}
	
	/*
	 * public void travel(Bus bus, String destination) {
	 * System.out.println(this.name + " is traveling to " + destination +" by " +
	 * bus.name ); }
	 * 
	 * public void travel(Train train, String destination) {
	 * System.out.println(this.name + " is traveling to " + destination +" by " +
	 * train.name ); }
	 */
	
	public void travel(Transport transit, String destination) {
		System.out.println(this.name + " is traveling to " + destination +" by " + transit.name );
	}
	
} 


class Transport {
	
	String name;
	
	public Transport (String name) {
		this.name = name;
	}
	
}

class Bus extends Transport {

	public Bus(String name) {
		super(name);
	}
	
}

class Train extends Transport{

	public Train(String name) {
		super(name);
	}
	
	
}

class Car extends Transport {

	public Car(String name) {
		super(name);
	}
	
}




