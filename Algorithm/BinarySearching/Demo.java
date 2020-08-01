import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        String[] a={"Jecob", "Allan", "Becky", "Micky", "Caster", "Olly", "Marc"};
        Arrays.sort(a);

        System.out.print("{ ");
        for(String n: a){
            System.out.print(n+", ");
        }
        System.out.print("}");
        System.out.println();

        String key="Mike";
        System.out.println("Index of "+key+" is "+BinarySearch.search(key, a));

        key="Caster";
        System.out.println("Index of "+key+" is "+BinarySearch.search(key, a));

        key="Micky";
        System.out.println("Index of "+key+" is "+BinarySearch.search(key, a));
    }    
}