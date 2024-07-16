import java.util.HashSet;
import java.util.Set;

public class sample {
    public static int [] twoNumberSum(int[] arr,int target)
    {
        Set<Integer>nums=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
           int num=arr[i];
           int match=target-num;
           if(nums.contains(match))
           {
               return new int[]{num,match};
           }
           else {
               nums.add(num);
           }
        }
        return new int[0];
    }
    public static void main(String[] args) {

        int [] arr={4,8,7,2,1,6};
        int target=10;
        int[] result=twoNumberSum(arr,target);

        for (int i=0;i<result.length;i++)
        {
            System.out.println(result[i]);
        }
    }
}
