
public class PhoneDemo {
    public static void main(String[] args) {
        // ��������
        Phone p = new Phone();
        // ���ó�Ա����
        p.brand = "iphone";
        System.out.println(p.brand);
        p.price = 2000;
        System.out.println(p.price);
        
        // ���ó�Ա���� 
        p.call();
        p.sendMassage();
    }
}
