import java.util.Scanner;

public class Doubloon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any string word:");
        String word = in.nextLine();

        int count = 0;
        for(int i=0;i<word.length(); i++) {
            char d = word.charAt(i);
            for(int k = 0; k<word.length();k++){
                char b = word.charAt(k);
                if(b==d) {
                    count++;
                    if(count==2){
                        break;
                    }
                } else{
                    System.out.print(word + "is not a doubloon");
                } System.out.print(word + "is a doubloon");
            }
        }
    }
}
