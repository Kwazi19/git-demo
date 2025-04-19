import java.util.Random;

public class ArrayMastering {
    public static void main(String[] args) {
        int[] arr = new int[10];

        System.out.print("RandArr1:");
        Random r = new Random();
        for(int i = 0;i<= arr.length; i ++){
            arr[i] = r.nextInt(10);
            System.out.println(arr[i]);
            for(int k:arr) {
                arr[k] = r.nextInt(10);
                //System.out.println("t" +arr[k]);
                if(i ==k) {
                    //System.out.print(arr[i]);
                }
            }
        }
    }
}
