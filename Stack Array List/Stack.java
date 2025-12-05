public class Stack {
    private int capacity;
    private int[] StackArray;
    private int top;
    
    public Stack(int capacity){
        this.capacity = capacity;
        this.StackArray = new int[capacity];
        this.top = -1;
    } 
    
    public boolean isEmpty(){
        return top == -1;
    }
    
    public boolean isFull(){
        return top == capacity -1;
    }
    
    public void push(int value){
        if(isFull())
            System.out.println("The StackArray Is Full, We cannot add " + value);
        else {
           StackArray[++top] = value;
            System.out.println(value + " Pushed to Stack");
        } 
        
    }
    
    public int pop(){
        if(isEmpty()){
            System.out.println("The StackArray is Empty");
            return -1;
        } 
        else {
            return StackArray[top--];
        } 
   
    }
    
    public int top(){
        if(isEmpty()){
            System.out.println("The StackArray is Empty");
            return -1;
        } 
        else          
            return StackArray[top];
         
    }
    
    public void display(){
        if(isEmpty())
            System.out.println("The StackArray is Empty");
        else {
            System.out.print("Stack Elements : ");
            for(int i = 0; i <= top; i++) 
                System.out.print(StackArray[i] + "  ");
            System.out.println("");                            
        }
    }
    
}
