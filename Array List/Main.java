public class Main {

    public static void main(String[] args) {
        List list = new List(10);
        list.add(0, 5);
        list.add(1, 10);
        list.add(2, 7);
        list.add(3, 15);
        list.add(4, 20);
        list.add(5, 30);   

        list.display();   

        int index = list.search(7);
        System.out.println("Item found at index: " + index);

        list.remove(1);   
        list.display();   
    }
}
