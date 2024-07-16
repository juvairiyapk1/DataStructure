public class CountZeros {

    public static void main(String[] args) {
    System.out.println(count(10530014));
    }

    static int count(int n){
        return helper(n,0);
    }

    static int helper(int n,int c){
        if (n==0){
            return c;
        }
        if(n%10==0){
            return helper(n/10,c+1);
        }else{
            return helper(n/10,c);
        }
    }
}
