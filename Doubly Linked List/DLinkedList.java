public class DLinkedList {
    private Node head;

    private class Node{
        int data;
        Node next;
        Node prev;
        
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
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
            n.prev =current ;
        }
        
    }
    
    public void InsertFirst(int item){
        Node newNode = new Node(item);
        newNode.next = head;
        if (head != null){
           head.prev = newNode; 
        }
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
        newNode.prev = current;
        if (current.next != null){
            current.next.prev = newNode;
        }
        current.next = newNode; 

            
    }
    
    public void delete(int item){
        if (head == null)
            return;
        
        if (head.data == item){
            head = head.next;
            head.next.prev = null;
            return;
        }
        
        Node current = head;
        while (current.next != null){
            if (current.next.data == item){
                current.next = current.next.next;
                if(current.next.next != null)
                    current.next.next.prev = current;
                return;
            }
            current = current.next;          
        }
        System.out.println("This item Not Found");      
    }
    
    public void merge(DLinkedList list2){
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
    
    public void traverseForwared(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
        
    }
    
    public void traverseBackward(){
        Node current = head;
        while (current.next != null)
            current = current.next;
        while(current.prev != null){
            System.out.print(current.data + " -> ");
            current = current.prev;
        } 
        System.out.print(current.data + " -> ");
        System.out.println("null");
              
    }
        
}