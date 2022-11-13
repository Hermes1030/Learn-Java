package AbstractCatandDog;

public class Dog extends Animal implements Jumpping{
     @Override
     public void eat() {
         System.out.println("? like to eat bone.");
     }

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void Jump() {
        System.out.println("This dos can jump...");
    }
}
