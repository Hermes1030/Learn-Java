package Abstract01;

// 抽象类   -->  抽象方法
// 抽象方法 -->  抽象类
public abstract class Animal {
    // 抽象方法
    public abstract void eat();

    public void sleep(){
        System.out.println("睡觉");
    }
}
