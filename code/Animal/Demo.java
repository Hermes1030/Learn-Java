package Animal;

public class Demo {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.setName("cat_One");
        c.setAge(2);
        System.out.println(c.getName()+":"+c.getAge());
        c.catchMouse();

        System.out.println("--------");

        Cat c2 = new Cat("cat_Two", 3);
        System.out.println(c2.getName()+":"+c2.getAge());
        c.catchMouse();

        System.out.println("-----------");

        Dog d = new Dog();
        d.setName("dog_One");
        d.setAge(5);
        System.out.println(d.getName()+":"+d.getAge());
        d.StandAtDoor();

        System.out.println("-----------");

        Dog d1 = new Dog("dog_Two", 6);
        System.out.println(d1.getName()+":"+d1.getAge());
        d1.StandAtDoor();


    }
}
