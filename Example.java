import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int target = 5;
        int flag=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(i + 1);
                flag=1;
            }
            }
        if(flag == 0)
        {
            System.out.println("target not found");
        }
        }
    }


