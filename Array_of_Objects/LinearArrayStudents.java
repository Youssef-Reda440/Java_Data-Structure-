public class LinearArrayStudents {
    private Student[] arr;
    private int size;
    
    public LinearArrayStudents (int capacity) {
        this.arr = new Student[capacity];
        this.size = 0;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == arr.length;
    }
    
    
    public void insert(Student s) {
       if (!isFull()){
           arr[size++] = s;
           return;
       } 
        System.out.println("array is Full");       
    }
    
    public Student search(int id){
        for (int i  = 0; i < size; i++){
            if (arr[i].getId() == id){
                return arr[i]; 
                
            }
        }
        return null;
    }
    
    public void delete(String FirstName, String LastName) {
        int index;
        for (int i = 0; i < size; i++){
            if (arr[i].getFirstName() == FirstName && arr[i].getLastName() == LastName){
                index = i;
                for (int j = index; j < size-1; j++)
                    arr[j] = arr[j+1];
                size--;                 
            }               
        }       
    }
    
    public void display() {
        for (int i = 0; i < size; i++){
            System.out.print("Student " + (i+1) + " -> " + " Name : " + arr[i].getFirstName() + " " + arr[i].getLastName() + " , ID : " + arr[i].getId());
            System.out.println("");
        }       
    }
      
}
