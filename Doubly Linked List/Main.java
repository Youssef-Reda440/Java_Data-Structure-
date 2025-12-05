public class Main{
    public static void main(String[] args) {
         DLinkedList list1 = new DLinkedList();
        
        list1.Append(10);
        list1.Append(20);
        list1.Append(30);
        list1.Append(40);
        System.out.println("Doubly linkedlist1");
        list1.traverseForwared();
        list1.traverseBackward();
        list1.Insert_At_Position(0, 0);
        list1.Insert_At_Position(15, 2);
        list1.traverseForwared();
        list1.traverseBackward();
        list1.delete(15);
        list1.delete(30);
        list1.traverseForwared();
        list1.traverseBackward();

        System.out.println("Contain 10 ?");
        list1.search(10);
        System.out.println("Contain 100 ?");
        list1.search(100);
       
    }
}