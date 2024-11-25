class CourseName {
    public CourseName() {
        System.out.println("You are in the CourseName constructor.");
    }
}

class Rectangle {
    
    int length;
    int width;

    
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    
    public int calculateArea() {
        return length * width;
    }

}

class Square {
   
    int side;

    public Square() {
        side = 5;
    }

    public void displaySide() {
        System.out.println("The side length of the square is: " + side);
    }

}

public class main{
	public static void main(String[] args) {
	
	//No Argument
	CourseName course = new CourseName();

	//Parameterized
	Rectangle rectangle = new Rectangle(5, 10);

        int area = rectangle.calculateArea();
        System.out.println("The area of the rectangle is: " + area);
       
	//Default
        Square square = new Square();

        square.displaySide();
    }
}