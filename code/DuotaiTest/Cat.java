package DuotaiTest;

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void eat() {
        System.out.println("Cat is eatting from Cat class.");
    }
    
}
