public class Main {

    public static void main(String[] args) {
            LinearArrayStudents list = new LinearArrayStudents(10);
            LinearArrayStudents list2 = new LinearArrayStudents(10);
                  
            list.insert(new Student("Youssef", "Ahmed", 1000));
            list.insert(new Student("Youssef", "Reda", 1001));
            list.insert(new Student("Mohamed", "Moustafa", 1002));
            
            list2.insert(new Student("Mohamed", "Ahmed", 1008));
            list2.insert(new Student("A", "B", 1009));
            list2.insert(new Student("C", "D", 1010));
            
            Student s = list.search(1001);
            if(s != null)
                s.display();
            
            Student s2 = list2.search(1001);
            if(s2 != null)
                s2.display();
            
            list2.delete("A", "B");
            
            System.out.println("List 1 of Students : ");
            list.display();
            
             System.out.println("List 2 of Students : ");
            list2.display();
 
    }
}
