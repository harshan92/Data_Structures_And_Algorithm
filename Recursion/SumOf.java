public class SumOf {
    public static void main(String[] args) {
        System.out.println("1 + 2 + 3 = "+SumOf(3));
        System.out.println("1 + 2 + 3 + 4 + 5 = "+SumOf(5));
        System.out.println("1 + 2 + 3 + ... + 100 = "+SumOf(100));
        System.out.println("1 + 2 + 3 + ... + 1000 = "+SumOf(1000));
    }

    public static int SumOf(int num1){
        int sum;

        if(num1==1){
            return 1;
        }else{
            sum=SumOf(num1-1)+num1;
        }
        return sum;
    }
}