package graph;

import java.util.ArrayList;
import java.util.List;

public class RiverSizes {
    public static List<Integer>riverSizes(int [][]matrix){
        List<Integer>sizes=new ArrayList<>();

        int row=matrix.length;
        int col=matrix[0].length;

        boolean[][]visited=new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j]==1 && !visited[i][j]){
                    int size=exploreRiver(matrix,visited,i,j);
                    sizes.add(size);
                }
            }
        }
        return sizes;
    }

    private static int exploreRiver(int[][] matrix, boolean[][] visited, int row, int col) {
        if (row<0 || row >= matrix.length || col<0 || col >= matrix[0].length || visited[row][col] || matrix[row][col]==0){
            return 0;
        }
        visited[row][col]=true;
        int size=1;

        size+=exploreRiver(matrix,visited,row+1,col);
        size+=exploreRiver(matrix,visited,row-1,col);
        size+=exploreRiver(matrix,visited,row,col+1);
        size+=exploreRiver(matrix,visited,row,col-1);
        return size;

    }

    public static void main(String[] args) {
        int[][]matrix={
                {1,0,0,1,0},
                {1,0,1,0,0},
                {0,0,1,0,1},
                {1,0,1,0,1},
                {1,0,1,1,0}};
        List<Integer>sizes=riverSizes(matrix);
        sizes.forEach(System.out::println);
    }
}
