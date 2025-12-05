public class ArrayQueue {
    private int[] queue;
    private int size;
    private int front;
    private int rear;
    
    public ArrayQueue(int size) {
        this.queue = new int[size];
        this.size = size;
        this.front = -1;
        this.rear = -1;
    }
    
    public boolean isFull() {
        return rear == size-1;
    }
    
    public boolean isEmpty() {
        return front == -1 || front > rear;
    }
    
    public void enqueue(int item){
        if(isFull())
            System.out.println("Queue is Overflow!!, cannot insert " + item);
        else{
            if (front == -1) front =0;
            queue[++rear] = item;
            System.out.println("Enqueue : " + item);
        }
        
    }
    
    public int dequeue() {
        if (isEmpty()){
            System.out.println("Queue is Underflow!!");
            return -1;
        }
        
        else {
            int removed = queue[front++];
            System.out.println("Dequeue : " + removed);
            return removed;
        }
    }
    
    public int peek() {
       if (isEmpty()){
            System.out.println("Queue is Underflow!!");
            return -1;
        }
       else {
           System.out.println("Peek : " + queue[front]);
           return queue[front];
       }
    }
    
    public void display() {
        if (isEmpty()){
            System.out.println("Queue is Empty....");
            return;
        }
        System.out.print("Queue elements : ");
        for (int i = front; i <= rear; i++){
            System.out.print(queue[i] +"  ");
        }
        System.out.println("");
      
    }
  
}
