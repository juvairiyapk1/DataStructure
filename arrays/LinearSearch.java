package arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int []arr={1,5,4,6,8,4};
        int target=4;
        int search=searchLinear(arr,target,0);
        System.out.println(find(arr,target,0));
        if(search != -1){
        System.out.println(search);}
        else {
            System.out.println("Not found");
        }

        System.out.println(findAllList(arr,target,0,new ArrayList<>()));

    }

    private static int searchLinear(int[] arr, int target,int index) {

        if(index==arr.length ){
            return -1;
        }
        if(target==arr[index]){
            return index;

        }else{
            return searchLinear(arr,target,index+1);
        }

    }

    public static boolean find(int []arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return target == arr[index] || find(arr,target,index+1);
    }
    ArrayList<Integer>list=new ArrayList<>();
    public static ArrayList<Integer> findAllList(int[]arr,int target,int index,ArrayList<Integer>list){
        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        return findAllList(arr,target,index+1,list);
    }
}
