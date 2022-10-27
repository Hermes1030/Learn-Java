package StudentAndTeacher;
public class Teacher extends Person {
    public Teacher(){
    }
    public Teacher(String name, int age){
        super(name, age);
    }
    public void Teach() {
        System.out.println("教书育人");
    }
}
