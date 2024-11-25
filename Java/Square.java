class Square {
   
    int side;

    public Square() {
        side = 5;
    }

    public void displaySide() {
        System.out.println("The side length of the square is: " + side);
    }

    public static void main(String[] args) {
       
        Square square = new Square();

        square.displaySide();
    }
}
