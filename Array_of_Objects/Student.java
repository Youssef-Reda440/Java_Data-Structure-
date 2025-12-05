public class Student {
    private String FirstName;
    private String LastName;
    private int id;
    
    public Student (String FirstName, String LastName, int id) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.id = id;      
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getId() {
        return id;
    }
    
    public void display(){
        System.out.println("Name : " + getFirstName() + " " + getLastName() + ", Id : " + getId());
    }
    
}
