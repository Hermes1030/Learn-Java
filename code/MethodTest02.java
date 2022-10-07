public class MethodTest02 {
    public static void main(String[] args) {
        // 传入常量
        getMax(10, 12);
        // 传入实参
        int a = 30;
        int b = 35;
        getMax(a, b);
    }
    // 方法定义
    public static void getMax(int a, int b){
        if (a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
