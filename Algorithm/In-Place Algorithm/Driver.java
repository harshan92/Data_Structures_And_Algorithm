public class Driver {
    public static void main(String[] args) {
        int[] original={1,2,3,4,5};
        ReverseArray reverseArray=new ReverseArray();
        int[] output=reverseArray.reverseArray(original);
        for(int val:output){
            System.out.print(val+" ");
        }
    }
}