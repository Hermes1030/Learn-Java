package Abstract02;

public abstract class Animal {
    private int age = 20;
    private final String  city = "gao";

    public Animal(){}
    public Animal (int age){
        this.age = age;
    }
    public void show(){
        age = 20;
        // city = "Zhi";
        System.out.println(age);
        System.out.println(city);
    }
    public abstract void eat();
}
