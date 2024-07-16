package arrays;

public class sum {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        int result=sumArray(arr,0);
        System.out.println(result);
    }

    public static int sumArray(int [] arr,int index){
        if (index==arr.length){
            return -1;
        }

        return arr[index] + sumArray(arr,index+1);
    }
}
