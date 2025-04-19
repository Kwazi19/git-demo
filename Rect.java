public class Rect {
    //Attributes
    private double Length, Breadth;

    //Constructor
    public Rect() {
        this.Length = 0;
        this.Breadth = 0;
    }

    public Rect(double Length, double Breadth) {
        this.Length = Length;
        this.Breadth = Breadth;
        if(Length <= 0 && Breadth <=0) {
            System.out.print("Lengths and Breadths that are equal to zero or negative are not Allowed!");
        }
    }
    //Methods(functions and Get & setters)
    //Get  and Set for Length
    public void setLength(double newLength) {
        this.Length = newLength;
    }
    public double getLength() {
        return Length;
    }

    //Get and Set for Breadth
    public void setBreadth(double newBreadth) {
        this.Breadth = newBreadth;
    }
    public double getBreadth() {
        return Breadth;
    }
    //A Method that returns the perimeter of a rectangle
    public double evaluatePerimeter() {
        double perimeter = 2*(Length+Breadth);
        System.out.print("The Perimeter of a Rectangle is:");
        return perimeter;
    }
    //A Method that returns  an Area of a rectangle
    public double calcArea(){
        double Area = Length*Breadth;
        System.out.print("The Area of a Rectangle is:");
        return Area;
    }
}
