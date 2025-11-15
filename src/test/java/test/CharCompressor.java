package test;

public class CharCompressor {
    public static void main(String[] args) {
        String str = "aaabbaacc";
        System.out.println(compressString(str));
    }

    public static String compressString(String str) {

        StringBuilder result = new StringBuilder();
        char currentChar = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                result.append(currentChar).append(count);
                currentChar = str.charAt(i);
                count = 1;
            }
        }
        // Append the last character and its count
        result.append(currentChar).append(count);

        return result.toString();
    }
}