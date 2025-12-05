public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        
        Stack stack = new Stack(5);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        
        stack.display();
        
        System.out.println("Top Element : " + stack.top());
        System.out.println("Pop Element : " + stack.pop());
        
        stack.display();
        
        long end = System.currentTimeMillis();
        System.out.println("Time elapsed: " + (end - start) + " ms");
    }
    
}
