package Duotai02;

public class AnimalDemo {
    public static void main(String[] args) {
        // 父类引用指向子类对象
        Animal a = new Cat();
        System.out.println(a.age); // 40
        // System.out.println(a.weight);

        // 多态访问成员方法 编译|运行（编译看左边，运行看右边）
        a.eat();
        // a.PlayGame(); 报错

    }
}
