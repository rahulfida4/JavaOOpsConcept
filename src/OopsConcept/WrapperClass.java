package OopsConcept;

public class WrapperClass {

	public static void main(String[] args) {
		
		String x ="100";
		System.out.println(x+20);
		
		//Data conversion:String to integer.
		
	int i =	Integer.parseInt(x);
	System.out.println(i+20);
	
	// Integer,Double,Boolean.  
	
	// String to double.
	
	String y = "12.33";
Double d	= Double.parseDouble(y);
System.out.println(d+10);

// String to boolean.

String k = "true";
Boolean b= Boolean.parseBoolean(k);
System.out.println(true);
	}

}
