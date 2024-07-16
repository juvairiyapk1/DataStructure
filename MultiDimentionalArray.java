public class MultiDimentionalArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {3, 5, 4}, {8, 9, 7}};
        int  []  ar=new int[arr.length * arr[0].length];

        for (int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) {
                ar[k] = arr[i][j];
                k++;
            }

        }
        for (int i=0;i<ar.length;i++){
            System.out.print(" "+ar[i]);
        }

    }



}
