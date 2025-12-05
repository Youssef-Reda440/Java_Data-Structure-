public class LinkedList {
    private Node head;
    
    private class Node {
        int data;
        Node next;
    
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    
    }
    
    public void Append(int item){
        Node n = new Node(item);
        if(head == null)
            head = n;
        else {
            Node current = head;
            while(current.next != null)
                current = current.next;
            current.next = n;          
        }
        
    }
    
    public void InsertFirst(int item){
        Node newNode = new Node(item);
        newNode.next = head;
        head = newNode; 
        
    }
    
    public void Insert_At_Position(int item, int pos){
        Node newNode = new Node(item);
        if (pos == 0){
            InsertFirst(item);
            return;
        }
        
        Node current = head;
        int index = 0;
        while(current != null && index < pos-1){
            current = current.next;
            index++;
        }
        
        if(current == null){
            System.out.println("You entered position out of bounds, please enter valid position");
            return;
        }
        
        newNode.next = current.next;
        current.next = newNode;   
            
    }
    
    public void delete(int item){
        if (head == null)
            return;
        
        if (head.data == item){
            head = head.next;
            return;
        }
        
        Node current = head;
        while (current.next != null){
            if (current.next.data == item){
                current.next = current.next.next;
                return;
            }
            current = current.next;          
        }
        System.out.println("This item Not Found");      
    }
    
    public void merge(LinkedList list2){
        if (head == null){
            head = list2.head;
            return;
        }
        
        Node current = head;
        while (current.next != null)
            current = current.next;
        
        current.next = list2.head;
        
    }
    
    public void search(int item){
        Node current = head;
        while(current.data != item){
            current = current.next;  
            if(current == null){
                System.out.println("This item is Not Found");
                return;
            }    
        }
        System.out.println("The item if Found");
        
    }
    
    public void traverse(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
        
    }
        
}
