class Circle{
    double x,y;//coordinates of centre
    double r;
    Circle(double x1,double y1, double r1){
        x=x1;
        y=y1;
        r=r1;
    }
    double circumference(){
        return 2*3.14*r;
    }
    double area(){
        return 3.14*r*r;
    }

}
class Rectangle{
    double s;
    Rectangle(double s1){
        s=s1;
    }
    double area(){
        return s*s;
    }
}
class Multipleclasses{
    public static void main(String Args[]) {
        Circle c = new Circle(0.0,0.0,3.0);
        Rectangle rect = new Rectangle(5.0);
        
        System.out.println("Circumference="+c.circumference());
        System.out.println("Area of Circle="+c.area());
        System.out.println("Area of Rectangle="+rect.area());
    }
}