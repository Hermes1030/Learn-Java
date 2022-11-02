/* 
    需求：请采用多态的思想实现猫和狗的案例，并在测试类中进行测试

    思路：
    1.Animal.java
        - String name;
        - int age;
        - public Animal();
        - public Animal(String name, int age);
        - public eat();
    2. Cat.java
        - public Cat();
        - public Cat(String name, int age);
        - public eat();
    3. Dog.java
        - public Dog();
        - public Dog(String name, int age);
        - public eat();
    4. AnimalDemo.java
        - public static void main(String[] args);

 */


package DuotaiTest;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("cat1");
        a.setAge(5);
        System.out.println(a.getName()+":"+a.getAge());
        a.eat();
        
        a = new Cat("cat1", 5);
        System.out.println(a.getName()+":"+a.getAge());
        a.eat();

        Animal d = new Dog();
        d.setName("dog1");
        d.setAge(3);
        System.out.println(d.getName()+":"+d.getAge());
        d.eat();

        d = new Dog("dog1", 3);
        System.out.println(d.getName()+":"+d.getAge());
        d.eat();
    }
}
