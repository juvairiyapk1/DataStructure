package HashMap;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int []arr={1,2,1,5,4,2,};
        int[]uniqueArray=duplicate(arr);
        System.out.println(Arrays.toString(uniqueArray));

    }
    public static int []duplicate(int []arr){
        HashSet<Integer>set=new HashSet<>();
        for (int n:arr){
            set.add(n);
        }
        int []unique=new int[set.size()];
        int index=0;
        for (int num:set){
            unique[index++]=num;
        }
        return unique;
    }
}
