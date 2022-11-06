/*      方法重载与返回值无关
 *          在调用时，jvm 会通过参数的不同来区分同名的方法
 */
public class MethodDemo02{
    public static void main(String[] args) {
        int result = sum(10, 20);
        System.out.println(result);

        double result2 = sum(10.2,10);
        System.out.println(result2);

        int result3 = sum(10, 20, 30);
        System.out.println(result3);


    }
    // 求两个int 类型数据和的方法
    public static int sum(int a, int b){
        return a + b;
    }    


    // 求两个double 类型数据和的方法
    public static double sum(double a, double b){
        return a + b;
    }


    // 求三个int 类型数据和的方法
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
}