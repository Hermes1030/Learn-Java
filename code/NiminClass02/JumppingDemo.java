package NiminClass02;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator jo = new JumppingOperator();
        Jumpping c = new Cat();
        jo.operate(c);

        System.out.println("------");

        jo.operate(new Cat(){
            @Override
            public void jump() {
                System.out.println("This it can jump.");
            }
        });
    }
}
