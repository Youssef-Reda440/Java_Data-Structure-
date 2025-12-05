public class Main {
    public static void main(String[] args) {
        System.out.println("This is QueueArray");
        System.out.println("Notes : ");
        System.out.println("1.If i return to you (-1) -> Queue is Empty");
        
        ArrayQueue queue1 = new ArrayQueue(10);
        
        System.out.println("Enqueue operation...");
        queue1.enqueue(10);
        queue1.enqueue(20);
        queue1.enqueue(30);
        queue1.enqueue(40);
        queue1.enqueue(50);
        queue1.enqueue(60);
        queue1.enqueue(70);
        queue1.display();
        System.out.println("Dequeue operation...");
        queue1.dequeue();
        queue1.dequeue();
        queue1.display();
        System.out.println("Front Element is : " + queue1.peek());
        
    }
    
}
