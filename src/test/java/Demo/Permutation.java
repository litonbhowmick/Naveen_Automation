package Demo;

public class Permutation {

    static void permute(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                char fixedchar = str.charAt(i);
                String remainingchars = str.substring(0, i) + str.substring(i + 1);
                permute(remainingchars, prefix + fixedchar);
            }
        }
    }

    public static void main(String[] args) {
        String text = "abcde";
        permute(text, "");


    }
}
