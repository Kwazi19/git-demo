public class TrioBarca{
    //Attributes
    private double lengthSide1, baseLength,lengthSide3; //Sides of a triangle

    //Constructor
    public TrioBarca(double lengthSide1, double baseLength, double lengthSide3 ) {
        if(lengthSide1 >0 && baseLength > 0 && lengthSide3 > 0) {
            this.lengthSide1 = lengthSide1;
            this.baseLength = baseLength;
            this.lengthSide3 = lengthSide3;
        } else {
            System.out.println("Invalid input and defauls values will be used");
            this.lengthSide1 = 1.0;
            this.baseLength = 1.0;
            this.lengthSide3 = 1.0;
        }
    }

    //Methods
    public double getLengthSide1() {
        return lengthSide1;
    }
    public double getBaseLength() {
        return baseLength;
    }
    public double getLengthSide3() {
        return lengthSide3;
    }

    //A method of finding the Area of a trio
    public double getArea() {
        double Area = 0.5*(getLengthSide1() * getBaseLength());  //1/2 base*height
        System.out.println("The Area of a Triangle is:" + Area);
            return Area;
    }
    //A method of finding the Perimeter of a trio
    public double getPerimeter() {
        double Perimeter = getLengthSide1() + getBaseLength() + getLengthSide3();
        System.out.println("The Perimeter of a triangle is:" + Perimeter);
        return Perimeter;
    }
    //A method to show that the side lengths construct which triangle(isosceles, equilateral, scalene)
    public void showClassification() {
        if(lengthSide1 == baseLength && baseLength == lengthSide3) {
            System.out.print("The triangle of the given sides is EQUILATERAL");
        } else if(getLengthSide1() == getLengthSide3() || getLengthSide1() == getBaseLength() || getLengthSide3() == getBaseLength()){
            System.out.print("The triangle of the given sides is ISOSCELES");
        } else {
            System.out.print("The triangle of the given sides is SCALENE");
        }
    }
}
