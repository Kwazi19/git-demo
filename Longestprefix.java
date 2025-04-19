public class Longestprefix {
    public static void main(String[] args) {
        String strings = "flower flow flight";
        String[] strArray = strings.split(" ");
        System.out.println(getLongestPrefix(strArray));
    }

    public static String getLongestPrefix(String[] strings) {
        String prefix = "";
        String word = strings[0];

        for (int i = 0; i < word.length(); i++) {

            String character = word.charAt(i) + "";

            for (int j = 1; j < strings.length; j++) {
                String word2 = strings[j];
                if (i < word2.length())
                    if (character.equals(word2.charAt(i) + "")) {
                        continue;
                    } else {
                        return prefix;
                    }
                prefix += character;
            }
        }
        return prefix;
    }
}