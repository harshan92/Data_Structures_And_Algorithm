import java.util.Vector;

public class VectorStack<T> implements StackInterface<T>{
    private Vector<T> stack;
    private static final int DEFAULT_INITIAL_CAPACITY=50;

    public VectorStack(){
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public VectorStack(int initialCapacity){
        stack=new Vector<T>(initialCapacity);
    }

    @Override
    public void push(T newEntry) {
        stack.add(newEntry);
    }

    @Override
    public T pop() {
        T top=null;
        if(!isEmpty())
            top=stack.remove(stack.size()-1);
        return top;
    }

    @Override
    public T peek() {
        T top=null;
        if(!isEmpty())
            top=stack.lastElement();
        return top;
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public void clean() {
        stack.clear();
    }
    
}