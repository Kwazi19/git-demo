import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an number:");
        int num1 = in.nextInt();
        System.out.print("Enter any number:");
        int num2 = in.nextInt();

        // Check parity
        System.out.println(num1 + " is even? " + isEven(num1));
        System.out.println(num2 + " is even? " + isEven(num2));

        //Parity
        if(num1 == num2) {
            System.out.println(num1 + " " + num2 + "Have the same parity");
        } else {
            System.out.println(num1 + " " + num2 + "Do  not have the same parity");
        }
    }

    public static boolean isEven( int num) {
        return num % 2 == 0;
    }

    public static boolean sameParity(int num1, int num2) {
        return isEven(num1) == isEven(num2);
    }
}
