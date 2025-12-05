public class LinkedListQueue {
    private Node front;
    private Node rear;
    
    private class Node {
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null; 
        }
    
    }
    
    public LinkedListQueue() {
        this.front = this.rear = null;
    }
    
    public boolean isEmpty() {
        return front == null;
    }
    
    public void enqueue(int data) {
        Node newNode = new Node(data);
        
        if (isEmpty()){
            front = rear = newNode;
            System.out.println(data + " enqueue to queue ");
            return;
        }    
        
        rear.next = newNode;
        rear = rear.next; 
        System.out.println(data + " enqueue to queue ");
    }
    
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("LinkedListQueue is Empty - nothing Dequeue");
            return -1;
        }
        
        int value = front.data;
        front = front.next;
        
        if (front == null) //Queue becomes empty
            rear = null;
        
        return value;        
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("LinkedListQueue is Empty - nothing Dequeue");
            return -1;
        }
        
        return front.data;    
    }
    
    public void display() {
        if (isEmpty()) {
            System.out.println("LinkedListQueue is Empty...");
            return;
        }
        
        System.out.println("LinkedListQueue Elements : ");
        Node current = front;
        while(current != null){
            System.out.print(current.data +" -> ");
            current = current.next;
        }
        System.out.println("null");       
    }
       
}
