package AbstractCatandDog;

public class Cat extends Animal implements Jumpping{
    @Override
    
    public void eat() {
        System.out.println("? like to eat fish.");
    }

    public Cat() {}

    public Cat(String name, int age) {
        super(name, age);
    }

    public void Jump() {

        System.out.println("This cat can Jump...");

    }
}
