import java.util.Scanner;

class switch_code{
	public static void main(String Args[]){

	Scanner uInput = new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        int numS = uInput.nextInt();
        
        switch (numS) {
        	case 1:
	                System.out.println("One");
                	break;
        	
		case 2:
	                System.out.println("Two");
                	break;
			
		case 3:
			System.out.println("Three");
			break;

		default:
			System.out.println("The number does not exist");
        	        break;
 	       }
	}
}