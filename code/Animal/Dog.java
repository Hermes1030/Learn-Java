package Animal;
public class Dog extends Animal{
    public Dog(){

    }
    public Dog(String name, int age){
        super(name, age);
    }
    public void StandAtDoor(){
        System.out.println("That dog standing...");
    }
}