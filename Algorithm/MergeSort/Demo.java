public class Demo {
    public static void main(String[] args) {
        String[] a={"Many","Kete","Adam","Piere","Zack","Alice"};

        System.out.print("{ ");
        for (String name : a) {
            System.out.print(name+", ");
        }
        System.out.println(" }");

        MergeSort.sort(a);

        System.out.print("{ ");
        for (String name : a) {
            System.out.print(name+", ");
        }
        System.out.println(" }");
    }
}