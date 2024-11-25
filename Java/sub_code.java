import java.util.Scanner;

public class sub_code {
    public static void main(String Args[]){
        
        Scanner scan = new Scanner(System.in);

        int a = 20;
        int b = 10;

        System.out.println("Enter your number : ");
        int c = scan.nextInt();

        System.out.println("Enter your number : ");
        int d = scan.nextInt();

        int result = a - b;
        int sum = c - d;

        System.out.println("Sub = " + result);
        System.out.println("Sub = " + sum);

        scan.close();
    }
}
