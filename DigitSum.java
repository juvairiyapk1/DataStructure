public class DigitSum {
    public static void main(String[] args) {
        int num=4258;
        int result=sum(num);
        System.out.println(result);
    }
    static int sum(int num){
        if(num%10==num){
            return num;
        }
        return (num%10)+sum(num/10);
    }
}
