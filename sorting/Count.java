package sorting;

import java.util.HashMap;

public class Count {

    public static void main(String[] args) {
        String input = "aayfhhbbfdffpgppaapp";
        HashMap<Character, Integer> doublesCount = countDoubles(input);

        System.out.println("Doubles Count: " + doublesCount);
    }

    public static HashMap<Character, Integer> countDoubles(String input) {
        HashMap<Character, Integer> doublesCount = new HashMap<>();

        for (int i = 0; i < input.length() - 1; i++) {
            char currentChar = input.charAt(i);
            char nextChar = input.charAt(i + 1);

            if (currentChar == nextChar) {
                doublesCount.put(currentChar, doublesCount.getOrDefault(currentChar, 0) + 1);
            }
        }

        return doublesCount;
    }
}
