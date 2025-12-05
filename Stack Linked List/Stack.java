public class Stack {
    private Node top;
    
    private class Node {   
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    
    public Stack(){
        top = null;
    }
    
    public boolean isEmpty(){
        return top == null;
    }
    
    public void push(int value){
        Node newNode = new Node( value);
        if (top == null)
            top = newNode;
        else {
            newNode.next = top;
            top = newNode;
        }
        System.out.println(value + " Pushed to Stack");
        
    }
    
    public int pop(){
        if (isEmpty())
            System.out.println("The StackLinkedList is empty");
        else {
            int pop_value = top.data;
            top = top.next;
            return pop_value;
        }
        return -1;
    
    }
    
    public int top(){
        if (isEmpty())
            System.out.println("The StackLinkedList is empty");
        else
            return top.data;       
        return -1;
    
    }
   
    public void display(){
        if (isEmpty()){
            System.out.println("The StackLinkedList is Empty");
            return;
        }
        Node current = top;
        System.out.print("Stack Elements : ");
        while (current != null){
            System.out.print(current.data + "  ");
            current = current.next;
        }
        System.out.println("");
    }
  
}
