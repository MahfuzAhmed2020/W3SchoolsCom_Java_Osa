package comW3Schools;
// https://www.w3schools.com/java/java_strings.asp

public class StringType {
/*String Length
	A String in Java is actually an object, which contain methods that can perform certain operations on strings.
	For example, the length of a string can be found with the length() method:*/
	
	static void length(){
		String txt="abcdefghijklmnopqrstuvwxyz WoW Nice ";
		System.out.println(+txt.length()+" "+txt.toUpperCase()+txt.indexOf("locate"));
		
	}
	
	public static void main(String[] args) {
		StringType k=new StringType();
		k.length();
// You can also use the concat() method to concatenate two strings:		
		String firstName = "    IFTIKHAR AHMED ";
		String lastName = "ABRAR";
		System.out.println(firstName.concat(lastName));
		 
		
//The Math.sqrt(x) method returns the square root of x:
// Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):		
// https://www.w3schools.com/java/java_math.asp
		int randomNum = (int)(Math.random() * 101);
		System.out.println(Math.sqrt(81)+randomNum);  
			    System.out.println(Math.random());
// https://www.w3schools.com/java/java_conditions.asp			  
// variable = (condition) ? expressionTrue :  expressionFalse;			    
			    int time = 20;
			    String result = (time < 18) ? "Good day." : "Good evening.";
			    System.out.println(result.toUpperCase());
		
			    length();
			    
			    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
			    for (String i : cars) {
			      System.out.println(i);
			      
/*Information can be passed to methods as parameter.
 *  Parameters act as variables inside the method.

Parameters are specified after the method name, inside the parentheses.
 You can add as many parameters as you want, just separate them with a comma.*/			     
			      
			      
			      
			      
			    }	    
		
		
	}
	
	
	
}
