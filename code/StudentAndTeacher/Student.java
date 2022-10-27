package StudentAndTeacher;

public class Student extends Person{
    public Student(){

    }
    public Student(String name, int age){
        super(name,age);
    }
    public void doHomework(){
        System.out.println("doing...");
    }
}
