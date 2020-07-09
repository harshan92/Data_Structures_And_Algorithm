public class RepeatedIntegerProblem{
    //O(N)
    public void solve(int[] arr) {
        // in place algorithm
        for(int i=0;i<arr.length;i++){
            if(arr[Math.abs(arr[i])]>0){
                arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
            }else{
                System.out.println(Math.abs(arr[i])+" is repitions.");
            }
        }
    }
}