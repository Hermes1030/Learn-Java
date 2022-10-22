public class Student{
    String name;
    // int age;
    private String age;
    public Student(String name, String age){
        this.name = name;
        this.age = age;
    }
    
    public void study(){
        System.out.println("Studing");
    }
    public void doHomework(){
        System.out.println("doing");
    }
    // public void setAge(String a){
    //     if (a<=1 || a>=120){
    //         System.out.println("你给的年龄有误");
    //     }else{
    //         age = a;
    //     }

    // }
    public String getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}