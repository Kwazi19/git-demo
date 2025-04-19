import java.util.Scanner;

public class Rerveser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int originalNum = sc.nextInt();

        int num1 = originalNum%10; //Shembe ngiphe umqondo o flexy to ama problems esiwatholayo lapha kwa Comp102
        int num2 = originalNum/10;
        int num3 = num2%10;
        num2 = num2/10;

        System.out.print("The reversed digit is:" + num1 + " " + num3 + " " + num2);
    }
}
