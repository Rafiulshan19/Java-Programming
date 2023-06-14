package Inheritance;

public class Singer extends Human{

	
	public Singer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
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
