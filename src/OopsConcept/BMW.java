package OopsConcept;

public class BMW extends car {  // "has a relationship"
	
	// when the same method is present in parent class as well as child class with same name and same no of 
	// arguments is called method overriding.
	
	// when the same method with different argument is called method overloading...
	public void start(){
		System.out.println("BMW Starts.....");// overridden method
		
		
	}

	public void safety(){
		System.out.println("BMW safety.....");
		
		
	}

}
