package OopsConcept;

public class Testcar {

	public static void main(String[] args) {
		
		
		// static polymorphism --compile time polymorphism---At the of compilation java will which method i need to call
		// decide which method will call
		
		
		BMW B1 = new BMW();
		B1.start();
		B1.stop();
		B1.refuel(); 
		B1.safety();
		B1.engine();
		
		System.out.println("----*********");
		
		car c = new car();
		c.start();
		c.refuel();
		c.stop();
		
		//Top Casting
		
		car c1 = new BMW();//child class object can be refrer by parent class refrence variable....dynamic polymorphism or
		// runtime polymorphism
		
		//Down Casting
	BMW B	= (BMW) new car();// entire thing is called BMW object...
	// ClassCastException
		

	}

}
