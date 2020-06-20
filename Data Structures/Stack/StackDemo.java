public class StackDemo {
    public static void main(String[] args) {
        StackInterface<String> myStack=new LinkedStack<>();

        myStack.push("A1");
        myStack.push("A2");
        myStack.push("B1");
        System.out.println("Current peek is "+myStack.peek());
        myStack.push("B2");
        myStack.push("C1");
        myStack.push("C2");
    }
}