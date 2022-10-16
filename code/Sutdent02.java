public class Sutdent02 {
    // 成员变量
    private String name;
    private int age;
    // get/set 方法

    public void setName (String name){
        // name = name;
        this.name = name;
    }
    /* public void setName(String n){
        name = n;
    } */
    public String getName(){
        return name;
    }
    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println("name：" + name + ", age:" + age);
    }
}
