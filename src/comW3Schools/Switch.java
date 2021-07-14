package comW3Schools;

import java.util.Scanner;

// https://www.w3schools.com/java/java_switch.asp
public class Switch {
	/*switch(expression) {
	  case x:
	    // code block
	    break;
	  case y:
	    // code block
	    break;
	  default:
	    // code block
	     * 
	     * The switch expression is evaluated once.
         * The value of the expression is compared with the values of each case.
         * If there is a match, the associated block of code is executed.
         * The break and default keywords are optional, and will be described later in this chapter
         * The break Keyword
         * When Java reaches a break keyword, it breaks out of the switch block.

         *This will stop the execution of more code and case testing inside the block.

         * When a match is found, and the job is done, it's time for a break. There is no need for more testing.
	     * The default keyword specifies some code to run if there is no case match:
	     * if the default statement is used as the last statement in a switch block, it does not need a break.
	}*/
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the date of the month  :-");
		int date =input.nextInt();
		System.out.println("the date is "+date);
// int day=7;
	
		switch(date) {
		case 1:
			System.out.println(" Today is saturday");
			break;
		case 2:
			System.out.println("Today is sunday");
			break;
		case 3:
			System.out.println("Today is monday");
			break;
		case 4:
			System.out.println("Today is tuesday");
			break;
		case 5:
			System.out.println("Today is wednesday");
			break;
		case 6:
			System.out.println("Today is thurshday");
			break;
		case 7:
			System.out.println("Today is friday");
		    break;
		case 8:
			System.out.println(" Today is saturday");
			break;
		case 9:
			System.out.println("Today is sunday");
			break;
		case 10:
			System.out.println("Today is monday");
			break;
		case 11:
			System.out.println("Today is tuesday");
			break;
		case 12:
			System.out.println("Today is wednesday");
			break;
		case 13:
			System.out.println("Today is thurshday");
			break;
		case 14:
			System.out.println("Today is friday");
		    break;
		case 15:
			System.out.println(" Today is saturday");
			break;
		case 16:
			System.out.println("Today is sunday");
			break;
		case 17:
			System.out.println("Today is monday");
			break;
		case 18:
			System.out.println("Today is tuesday");
			break;
		case 19:
			System.out.println("Today is wednesday");
			break;
		case 20:
			System.out.println("Today is thurshday");
			break;
		case 21:
			System.out.println("Today is friday");
		    break;
		case 22:
			System.out.println(" Today is saturday");
			break;
		case 23:
			System.out.println("Today is sunday");
			break;
		case 24:
			System.out.println("Today is monday");
			break;
		case 25:
			System.out.println("Today is tuesday");
			break;
		case 26:
			System.out.println("Today is wednesday");
			break;
		case 27:
			System.out.println("Today is thurshday");
			break;
		case 28:
			System.out.println("Today is friday");
		    break;
		case 29:
			System.out.println("Today is friday");
		    break;
		case 30:
			System.out.println("Today is friday");
			break;
		    default:
		    System.out.println("OUT OF THE WORLD");
		    
		}
	
	
	}	
		
}