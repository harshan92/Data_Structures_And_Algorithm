package Bags;

/**
 *
 * @author Harshana-PC
 */
public interface BagInterface<T>{
    /* Gets the current number of elements in the bag.
    Return the integer number of entries currently in the bag. */
    public int getCurrentSize();
    
    /*Sees whether this bag is full.
    Return true if the bag is full, or false if not*/
    public boolean isFull();
    
    /*Sees whether this bag is empty.
    Return true if the bag is empty, or false if not*/
    public boolean isEmpty();
    
    /*Adds a new element to the bag.
    param newElement the object to be added as a new entry
    Return true if the addition is successful, or false if not*/
    public boolean add(T newElement);
    
    /*Removes one unspecified entry from this bag, if possible.
    Return either the removed entry, if the removal was successful, or null*/
    public T remove();
    
    /*Removes one occurrence of a given entry from this bag, if possible.
    Param currentElement the entry to be removed
    Return true if the removal was successful, or false if not*/
    public boolean remove(T currentElement);
    
    /*Removes all elements from this bag.*/
    public void clear();
    
    /*Counts the number of times a given element appears in this bag.
    param currentElement the entry to be counted
    return the number of times currentElement appears in the bag */
    public int getFrequencyOf(T currentElement);
    
    /*Checks whether this bag contains a given element.
    param currentElement the element to locate
    return true if the bag contains currentElement, or false otherwise*/
    public boolean contains(T currentElement);
    
    /*Creates an array of all entries that are in this bag.
    return a newly allocated array of all the entries in the bag*/
    public T[] toArray();
}
