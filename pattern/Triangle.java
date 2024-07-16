package pattern;

public class Triangle {
    public static void main(String[] args) {
        triangle(0,4);

    }

    static void triangle(int col,int row){
        if(row == 0){
            return;
        }
        if (col<row){
            triangle(col+1,row);
            System.out.print(" *");
        }else{

            triangle(0,row-1);
            System.out.println();

        }
    }
}
