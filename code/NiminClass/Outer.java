package NiminClass;

public class Outer {
    public void method(){
//
//        new Inter(){
//            @Override
//            public void show() {
//                System.out.println("�����ڲ���");
//            }
//        };
//        new Inter(){
//            public void show(){
//                System.out.println("�����ڲ���");
//            }
//        }.show();
        Inter i = new Inter() {
            @Override
            public void show() {
                System.out.println("�����ڲ���");
            }
        };

        i.show();

    }
}
