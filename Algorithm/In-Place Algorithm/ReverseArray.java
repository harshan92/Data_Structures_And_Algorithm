
public class ReverseArray{

    public int[] reverseArray(int[] arr){
        //start point
        int startIndex=0;
        //end point
        int endIndex=arr.length-1;

        while(endIndex>startIndex){
            //swap start value and end value
            swap(arr, startIndex, endIndex);
            startIndex++;
            endIndex--;
        }
        return arr;
    }

    public void swap(int[] arr, int start, int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}