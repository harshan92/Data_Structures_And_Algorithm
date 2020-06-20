import java.util.Arrays;

public class ArrayStack<T> implements StackInterface<T> {
    private T[] stack;
    private int topIndex;
    private static final int DEFAULT_INITIAL_CAPACITY=50;
    
    public ArrayStack(){
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public ArrayStack(int initalCapacity){
        @SuppressWarnings("unchecked")
        T[] tempStack=(T[])new Object[initalCapacity];
        stack=tempStack;
    }

    private void ensureCapacity(){
        if(topIndex==stack.length-1)
            stack=Arrays.copyOf(stack, 2*stack.length);
    }

    @Override
    public void push(T newEntry) {
        ensureCapacity();
        topIndex++;
        stack[topIndex]=newEntry;
    }//O(1)

    @Override
    public T pop() {
        T top=null;
        if(!isEmpty())
        {
            top=stack[topIndex];
            stack[topIndex]=null;
            topIndex--;
        }
        return top;
    }//O(1)

    @Override
    public T peek() {
        T top=null;
        if(!isEmpty())
            top=stack[topIndex];
        return top;
    }//O(1)

    @Override
    public boolean isEmpty() {
        return topIndex<0;
    }//O(1)

    @Override
    public void clean() {
       topIndex=-1;
    }
    
}