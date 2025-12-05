public class Main {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList(); 
        
        System.out.println("Single LinkedList 1");
        list1.Append(10);
        list1.Append(20);
        list1.Append(30);
        list1.Append(40);
        list1.Append(50);
        list1.traverse();
        list1.InsertFirst(5);
        System.out.println("Single LinkedList 1 After Inserting");
        list1.traverse();
        list1.Insert_At_Position(60, 3);
        System.out.println("Single LinkedList 1 After Inserting");
        list1.traverse();
        System.out.println("Single LinkedList 1 After Deleting");
        list1.delete(30);
        list1.traverse();
        list1.InsertFirst(0);
        System.out.println("Single LinkedList 1 After Inserting");
        list1.traverse();
        
        System.out.println("Single LinkedList 2");
        list2.Append(80);
        list2.Append(90);
        list2.Append(100);
        list2.traverse();
        
        System.out.println("After Merge LinkedList 1 & 2");
        list1.merge(list2);
        list1.traverse();
        
        list2.Append(110);
        System.out.println("Single LinkedList 2 After Appending");
        list2.traverse();
        
        System.out.println("Finally Single LinkedList 1");
        list1.traverse();        
        
    }
    
}
