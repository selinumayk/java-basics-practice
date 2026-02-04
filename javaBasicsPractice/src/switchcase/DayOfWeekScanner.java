package switchcase;
import java.util.Scanner;


	public class DayOfWeekScanner {
	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter a day number (1-5): ");
	        int day = input.nextInt();

	        switch (day) {
	            case 1:
	                System.out.println("Monday");
	                break;
	            case 2:
	                System.out.println("Tuesday");
	                break;
	            case 3:
	                System.out.println("Wednesday");
	                break;
	            case 4:
	                System.out.println("Thursday");
	                break;
	            case 5:
	                System.out.println("Friday");
	                break;
	            default:
	                System.out.println("Invalid day");
	        }

	        input.close();
	    }
	}

