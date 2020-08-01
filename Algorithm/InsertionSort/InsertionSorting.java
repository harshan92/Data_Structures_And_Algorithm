public class InsertionSorting{
    // O(N^2)
    public static void sort(String[] a){
        int N=a.length;
        for(int i=1;i<N;i++){
            for(int j=i; j>0;j--){
                if(a[j-1].compareTo(a[j])>0){
                    swap(a, j-1, j);
                }else{
                    break;
                }
            }
        }
    }

    private static void swap(String[] a, int i, int j){
        String t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}