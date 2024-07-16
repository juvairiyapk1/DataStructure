public class Recursive {

    public static void main(String[] args) {
        int [] arr={3,5,7,9,11};
        int target=11;
        int result=recursive(arr,target,0,arr.length-1);
        System.out.println("Result :"+result);
    }

    public static int recursive(int []arr,int target,int left,int right)
    {
        if(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]==target)
            {
                return mid;
            } else if (arr[mid]<target) {
               return recursive(arr,target,mid+1,right);

            }else {
                return recursive(arr,target,left,mid-1);
            }
        }
        return -1;
    }
}
