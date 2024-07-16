package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr={4,6,5,1,2,8};
        selectionSort(arr);
        System.out.print(Arrays.toString(arr));

    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last=arr.length-i-1;
            int maxIndex=getMaxValue(arr,0,last);
            swap(arr,maxIndex,last);

        }
    }

    public static int getMaxValue(int[] arr, int start, int end) {
        int max=start;
        for (int i = start; i <end ; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    public static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
}
