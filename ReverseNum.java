public class ReverseNum {
    static int sum=0;
    static void reverseNum1(int num){
        if(num==0){
            return ;
        }
        int rem=num%10;
        sum=sum*10+rem;
        reverseNum1(num/10);

    }


    public static int rev2(int num){
        int digits=(int) (Math.log10(num))+1;
        return helper(num,digits);
    }

    private static int helper(int num, int digits) {

        if (num%10==num){
            return num;
        }
        int rem=num%10;
        return rem*(int) (Math.pow(10,digits-1))+helper(num/10,digits-1);
    }

    public static void main(String[] args) {
        int num=12;
        System.out.println(rev2(num));

    }

}
