package Outer02;

public class InnerDemo {
    public static void main(String[] args) {
        // 创建内部类对象，并调用方法
//        Inner i = new Inner();

//        Outer.Inner i = new Outer().new Inner();
//        i.show();

        Outer i = new Outer();
        i.method();
    }
}
