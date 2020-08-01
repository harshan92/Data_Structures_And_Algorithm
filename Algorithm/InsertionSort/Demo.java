public class Demo{
    public static void main(String[] args) {
        String[] a={"Blake", "Manney", "Alex", "Cubra", "Abey"};

        System.out.println("Unorted List:");
        System.out.print("{ ");
        for (String n1 : a) {
            System.out.print(n1+", ");
        }
        System.out.print("}\n");
        InsertionSorting.sort(a);

        System.out.println("Sorted List:");
        System.out.print("{ ");
        for (String n1 : a) {
            System.out.print(n1+", ");
        }
        System.out.print("}\n");
    }
}