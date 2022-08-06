public class AreaShape {
    // here we have two functions.
    // one is taking two args and another is taking only one args.
    // methods like these having same name and different args is knows as method overloading.
    public void printArea(float radius){
        System.out.println("Area of this circle : "+3.14*radius*radius);
    }
    public void printArea(float length,float width){
        System.out.println("Area of this rectangle : "+length*width);
    }
}
