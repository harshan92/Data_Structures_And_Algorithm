// package LinkedList;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Creating  an Empty bag");
        BagInterface<String> aBag=new LinkedBag<String>();
        System.out.println("Is Bag Empty "+aBag.isEmpty());
        aBag.add("Book1");
        aBag.add("Book2");
        aBag.add("Lunch box");
        aBag.add("Pencil Case");
        System.out.println("Number of items: "+aBag.getCurrentSize());
        System.out.println("Is Bag Empty "+aBag.isEmpty());
        String removedItem=aBag.remove();

        System.out.println("Removed item: "+removedItem);
        System.out.println("Number of items: "+aBag.getCurrentSize());
    }
}