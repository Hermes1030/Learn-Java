package Generi;

public class Demo {
    public static void main(String[] args) {

        Generic<String> t = new Generic<String>();
        t.setA("Hello world.");
        System.out.println(t.getA());

        Generic<Integer> i = new Generic<Integer>();
        i.setA(123456);
        System.out.println(i.getA());
    }
}
