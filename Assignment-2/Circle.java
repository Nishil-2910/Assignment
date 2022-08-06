class Circle
{
    public double radius=1;
    //Default constructor for default value of the radius.
    public Circle(){
        radius=1;
    }
    //Parameterized constructor to assign the value of the radius.
    public Circle(double radius) {
        this.radius = radius;
    }
    //Method to calculate the area of the circle.
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    //Method to calculate the perimeter of the circle.
    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }
}
