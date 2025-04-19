import java.util.Scanner;

public class TestTrioBarca {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter all the sides of a triangle:");
        System.out.print("Enter the 1st length:");
        double length1 = in.nextDouble();
        System.out.print("Enter the base:");
        double baseLength = in.nextDouble();
        System.out.print("Enter the 2nd length:");
        double length3 = in.nextDouble();

        //An object of the triangle
        TrioBarca triangle = new TrioBarca(length1, baseLength, length3);
        triangle.getArea();
        triangle.getPerimeter();
        triangle.showClassification();
    }
}
