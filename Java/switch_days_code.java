import java.util.Scanner;

class switch_days_code{
	public static void main(String Args[]){

	Scanner uInput = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int numS = uInput.nextInt();
        
        switch (numS) {
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
		
		case 6:
			System.out.println("Saturday");
			break;

		case 7:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("The day does not exist");
        	        break;
 	       }
	}
}