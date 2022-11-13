package AbstractCatandDog;

/* 
 *      需求：
 *          请采用抽象类的思想实现猫和狗的案例
 *      思路：
 *          Animal.java
 *          - String name;
 *          - int age;
 *          - Animal()、Animal(String name, int age)
 *          - get\set()、eat()
 * 
 *          Cat.java extends Animal
 *          - Cat()、Cat(String name, int age)
 *          - eat()
 *          
 *          Dog.java extends Animal
 *          - Dog()、Dog(String name, int age)
 *          - eat()
 * 
 *          AnimalDemo.java
 *
 *      需求：添加接口方式（Jumpping）
 * 
 */


public class AnimalDemo {
    public static void main(String[] args) {
        Animal c = new Cat();
        c.eat();
        c.setName("cat");
        c.setAge(7);
        ((Cat) c).Jump();
        System.out.println(c.getName()+c.getAge());


        Animal c1 = new Cat("cat1", 5);
        c1.eat();
        ((Cat) c1).Jump();
        System.out.println(c1.getName()+c1.getAge());

        Animal d = new Dog();
        d.eat();
        d.setName("dog");
        d.setAge(9);
        ((Dog) d).Jump();
        System.out.println(d.getName()+d.getAge());
        
        Animal d1 = new Dog("dog1", 6);
        d1.eat();
        ((Dog) d1).Jump();
        System.out.println(d1.getName()+d1.getAge());
        
    }
}
