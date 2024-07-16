public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={5,9,11,13,17};
        int target=13;

        int result=binarySearch(arr,target);
        System.out.println("Target index is :"+result);

    }


    public static int linearSearch(int [] arr,int target)
    {
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int []arr,int target)
    {
        int left=0;
        int right=arr.length-1;

        while(left <= right)
        {
         int mid =(left+right)/2;

         if(arr[mid]==target)
         {
             return mid;
         }
         else if(arr[mid]<target) {
             left = mid + 1;
         }
         else {
             right=mid-1;

         }

        }

        return -1;
    }
}
