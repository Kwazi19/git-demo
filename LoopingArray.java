public class LoopingArray {
    public static void main(String[] args) {
        int [] ages = {18,33,24,64,45};
        int sum = 0;
            for(int x = 0; x<ages.length; x ++) {
                sum += ages[x];

            System.out.println(sum);
            }

    }
}
