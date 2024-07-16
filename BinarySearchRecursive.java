public class BinarySearchRecursive {

    public static int binaryRec(int[] arr,int target){
        return recursion(arr,target,0,arr.length-1);

    }

    public static int recursion(int[] arr, int target, int left, int right){

        if(left>right){
            return -1;
        }
        int mid=left+(right+left)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]<target){
            return recursion(arr,target,mid+1,right);
        }else {
            return recursion(arr,target,left,mid-1);
        }

    }

    public static void main(String[] args) {
        int[] arr={10,12,13,14,15,19};
        int result=binaryRec(arr,13);
        System.out.println(result);
    }
}
