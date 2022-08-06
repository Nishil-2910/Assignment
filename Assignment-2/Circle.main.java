import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle : ");
        double d=sc.nextDouble();
        //Create an object of circle class.
        Circle c1=new Circle(d);
        //Calls the getArea method of circle class.
        System.out.println("Area of circle is "+c1.getArea());
        //Calls the getPerimeter method of circle class.
        System.out.println("Perimeter of circle is "+c1.getPerimeter());
    }
}
