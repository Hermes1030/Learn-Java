public class Student{
    String name;
    // int age;
    private int age;

    public void study(){
        System.out.println("Studing");
    }
    public void doHomework(){
        System.out.println("doing");
    }
    public void setAge(int a){
        if (a<=1 || a>=120){
            System.out.println("�������������");
        }else{
            age = a;
        }

    }
    public int getAge(){
        return age;
    }
}