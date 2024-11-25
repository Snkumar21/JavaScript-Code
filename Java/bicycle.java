import java.util.Scanner;

class bicycle{

	int gear = 3;

	public static void main(String Args[]){

		bicycle mountainbike = new bicycle();

		System.out.println(mountainbike.gear);
		mountainbike.accelerate();
	}
	
	void accelerate(){

		System.out.println("Riding Mountain Bike");

	}

}