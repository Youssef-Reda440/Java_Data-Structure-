public class Main {
    public static void main(String[] args) {
        LinkedListQueue q = new LinkedListQueue();
        
        System.out.println("Is queue Empty? " + q.isEmpty());
        
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        
        System.out.println("Dequeue : " + q.dequeue());
        System.out.println("Is queue Empty? " + q.isEmpty());
        
        q.enqueue(70);
        System.out.println("Dequeue : " + q.dequeue());
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        
        System.out.println("Is queue Empty? " + q.isEmpty());
        
    }
}
