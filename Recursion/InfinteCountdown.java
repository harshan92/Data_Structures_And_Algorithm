class InfinteCountDown{
    public static void main(String[] args) {
        countdown(0);
    }

    public static void countdown(int num){
        System.out.println(num);
        countdown(num+1);
    }
}