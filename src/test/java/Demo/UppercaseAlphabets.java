package Demo;

import java.util.ArrayList;

public class UppercaseAlphabets {

    public static void main(String[] args) {

        String text = "my name is AbcD";

        ArrayList<Character> list = new ArrayList<>();

        text.chars()
                .filter(Character::isUpperCase)
                .forEach(c -> list.add((char) c));

        System.out.println(list);

    }
}
