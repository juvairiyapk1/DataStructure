public class simple {

    public static void findNumber(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right && arr[right] == target) {


                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;

                left++;
        }


    }
        public static void main (String[]args){
            int[] arr = {6, 1, 6, 8, 10, 4, 15, 6, 3, 9, 6};
            int target = 6;
            findNumber(arr, target);

            for (int j : arr) {
                System.out.println(j);
            }

        }
    }

