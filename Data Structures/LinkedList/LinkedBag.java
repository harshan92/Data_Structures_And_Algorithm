// package LinkedList;

public class LinkedBag<T> implements BagInterface<T>{
    private Node firstNode;
    private int numberOfElements;

    @Override
    public int getCurrentSize() {
        return numberOfElements;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isEmpty() {
        return firstNode==null;
    }

    @Override
    public boolean add(T newElement) {
        Node newNode=new Node(newElement);
        newNode.next=firstNode;
        firstNode=newNode;
        numberOfElements++;
        return true;
    }

    @Override
    public T remove() {
        T result=null;
        if(firstNode!=null){
            result=firstNode.data;
            firstNode=firstNode.next;
            numberOfElements--;
        }
        return result;
    }

    @Override
    public boolean remove(T anEntry) {
        boolean result=false;
        Node nodeN=getReferanceTo(anEntry);
        if(nodeN!=null){
            nodeN.data=firstNode.data;
            remove();
            result=true;
        }
        return result;
    }

    @Override
    public void clear() {
        // firstNode=null;

        while(!isEmpty()){
            remove();
        }
    }

    @Override
    public int getFrequencyOf(T currentElement) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean contains(T anEntry) {
        boolean found=false;
        Node currentNode=firstNode;
        while(!found && (currentNode!=null)){
            if(anEntry.equals(currentNode.data)){
                found=true;
            }else{
                currentNode=currentNode.next;
            }
        }
        return found;
    }

    @Override
    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] result=(T[]) new Object[numberOfElements];
        int index=0;
        Node currentNode=firstNode;
        while((index<numberOfElements) && (currentNode!=null)){
            result[index]=currentNode.data;
            index++;
            currentNode=currentNode.next;
        }
        return result;
    }

    private Node getReferanceTo(T anEntry){
        boolean found=false;
        Node currentNode=firstNode;
        while(!found && (currentNode!=null)){
            if(anEntry.equals(currentNode.data)){
                found=true;
            }else{
                currentNode=currentNode.next;
            }
        }
        return currentNode;
    }

    private class Node{
        private T data;
        private Node next;

        private Node(T dataPortion){
            this(dataPortion, null);
        }

        private Node(T dataPortion, Node nextNode){
            data=dataPortion;
            next=nextNode;
        }
    }
    
}