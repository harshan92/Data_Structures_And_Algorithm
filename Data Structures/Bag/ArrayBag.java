package Bags;

//import java.util.Arrays;

/**
 * @author Harshana-PC
 * @param <T>
 */
public class ArrayBag<T> implements BagInterface<T>{
    private final T[] bag;
    private static final int DEFAULT_CAPACITY=25;
    private int numberOfElements;
    
    //Creates an empty bag whose initial capacity is 25.
    public ArrayBag() {
        this(DEFAULT_CAPACITY);
    }//end default constructor
    
    //Creates an empty bag having a given initial capacity.
    //param capacity the integer capacity desired
    public ArrayBag(int capacity) {
        numberOfElements=0;
        @SuppressWarnings("unchecked")
        T[] tempBag=(T[])new Object[capacity];// unchecked cast
        bag=tempBag;
    }//end constructor

    @Override
    public int getCurrentSize() {
        return numberOfElements;
    }//end getCurrentSize

    @Override
    public boolean isFull() {
        return numberOfElements==bag.length;
    }//end isFull

    @Override
    public boolean isEmpty() {
        return numberOfElements==0;
    }//end isEmpty

    @Override
    public boolean add(T newElement) {
        boolean result=true;
        if(isFull()){
            result=false;//if bag is full can't add elemnts
        }else{// assertion: result is true here
            bag[numberOfElements]=newElement;//if bag has space can add elemnts
            numberOfElements++;//
        }
        return result;
    }//end add

    @Override
    public T remove() {
        T result=null;
        if(numberOfElements>0){
            numberOfElements--;
            result = bag[numberOfElements];
            bag[numberOfElements] = null;
        }
        return result;
    }//remove

    @Override
    public boolean remove(T currentElement) {
        int index=getIndexOf(currentElement);
        T result = removeElement(index);
        return currentElement.equals(result);
    }//end remove(T)

    @Override
    public void clear() {
        while (!isEmpty())
            remove();
    }//end clear

    @Override
    public int getFrequencyOf(T currentElement) {
        int counter=0;
        for(int index=0;index<numberOfElements;index++)
            if(currentElement.equals(bag[index]))
                counter++;
        return counter;
    }//end getFrequencyOf

    @Override
    public boolean contains(T currentElement) {
        boolean found=false;
        for(int index=0;index<numberOfElements;index++)
            if(currentElement.equals(bag[index]))
                found=true;
        return found;
        //return getFrequencyOf(currentElement)>0;
    }//end contains

    @Override
    public T[] toArray() {
        T[] result = (T[])new Object[numberOfElements]; // unchecked cast
        for (int index = 0; index < numberOfElements; index++){
            result[index]=bag[index];
        }
        return result;
    }//end toArray
    
    private int getIndexOf(T anElement){
        int where=-1;
        boolean stillLooking=true;
        
        for(int index=0;stillLooking && (index<numberOfElements);index++){
            stillLooking=false;
            where=index;
        }
        return where;
    }// end getIndexOf
    
    //Removes and returns the entry at a given index within the arraybag.
    //If no such entry exists, returns null.
    private T removeElement(int current_index){
        T result=null;
        if(!isEmpty() && (current_index>=0)){
            result=bag[current_index];
            numberOfElements--;
            bag[current_index]=bag[numberOfElements];// replace entry with last entry
            bag[numberOfElements]=null;// remove last entry
        }//end if
        return result;
    }
    
//    private void ensureCapacity(){
//        if(numberOfElements==bag.length)
//            bag=Arrays.copyOf(bag, bag.length*2);
//    }
}
