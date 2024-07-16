package string;

public class Reverse {
    public static void main(String[] args) {
        String original="good";
        String reverse=reverseString(original);
        System.out.println(reverse);
    }

    private static String reverseString(String original) {
      if (original==null || original.length()<=1){
          return original;
      }
      return original.charAt(original.length()-1)+reverseString(original.substring(1,original.length()-1))+original.charAt(0);
    }

}
