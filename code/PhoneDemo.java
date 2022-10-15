
public class PhoneDemo {
    public static void main(String[] args) {
        // 创建对象
        Phone p = new Phone();
        // 调用成员变量
        p.brand = "iphone";
        System.out.println(p.brand);
        p.price = 2000;
        System.out.println(p.price);
        
        // 调用成员方法 
        p.call();
        p.sendMassage();
    }
}
