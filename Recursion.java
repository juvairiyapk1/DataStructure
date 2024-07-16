public class Recursion {
    public static void main(String[] args) {
        int n=5;
       int result= factorial(n);
        System.out.print(result);
    }
    static void print(int num){
        if(num==0){
            return;
        }
        System.out.print(" "+num);
        print(num-1);
    }
    static int factorial(int num){
        if(num==1){
            return num;
        }
        return  num*factorial(num-1);
    }

    static int sum(int num){
        if(num==1){
            return 1;
        }
        return num+sum(num-1);
    }

}
