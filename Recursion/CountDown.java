public class CountDown {
    public static void main(String[] args) {
        CountDown1(10);
        CountDown2(10);
    }
    //Recursive version
    public static void CountDown1(int num){
        if(num>0){
            System.out.println(num);
            CountDown1(num-1);
        }
    }
    //Iterative version
    public static void CountDown2(int num){
        while(num>0){
            System.out.println(num);
            num--;
        }
    }
}