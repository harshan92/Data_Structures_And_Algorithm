public class LinkedStack<T> implements StackInterface<T> {

    private Node topNode;
    private int numberOfElement=0;

    @Override
    public void push(T newEntry) {
        Node newNode=new Node(newEntry, topNode);
        topNode=newNode;
        numberOfElement++;
    }//O(1)

    @Override
    public T pop() {
        T top=peek();
        if(topNode!=null){
            topNode=topNode.getNext();
            numberOfElement--;
        }
        return top;
    }//O(1)

    @Override
    public T peek() {
        T top=null;
        if(topNode!=null)
            top=topNode.getData();
        return top;
    }//O(1)

    @Override
    public boolean isEmpty() {
        return this.topNode==null;
    }//O(1)

    @Override
    public void clean() {
        topNode=null;
        numberOfElement=0;
    }//O(1)
    
    private class Node{
        private T data;
        private Node next;

        // public Node(T dataPortion){
        //     this(dataPortion, null);
        // }

        public Node(T dataPortion, Node nextNode){
            this.data=dataPortion;
            this.next=nextNode;
        }

        private T getData(){
            return this.data;
        }

        private Node getNext(){
            return this.next;
        }

        // private void setData(T data){
        //     this.data=data;
        // }

        // private void setNext(Node next){
        //     this.next=next;
        // }
    }
}