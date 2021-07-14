package comW3Schools;
//  https://www.w3schools.com/java/java_date.asp
import java.time.LocalDateTime; // import the LocalDate class
import java.time.LocalTime; // import the LocalTime class
import java.time.DayOfWeek;
public class TimeScanner {

	 public static void main(String[] args) {
		 
		 LocalDateTime myObj = LocalDateTime.now(); // Create a date object
	    LocalTime k=LocalTime.now();
	    DayOfWeek d=DayOfWeek.MONDAY;
// To display the current date and time, import the java.time.LocalDateTime class, and use its now() method:	    
	    System.out.println("LocalDateTime  "+myObj); // Display the current date
	    System.out.println("DayOfWeek   "+d);
	    
	    
//	    Display Current Time
//	    To display the current time (hour, minute, second, and milliseconds), import the java.time.LocalTime class, and use its now() method:
	    System.out.println("LocalTime  "+k);
	  }
	}
	
	
