public class StringBuilderDemo01 {
    public static void main(String[] args) {
        StringBuilder ss = new StringBuilder("Hello World");
        System.out.println(ss);
        System.out.println(ss.length());

        // 追加字符
        ss.append(" Hello Java").append("Hello PHP").append("Hello Python");
        System.out.println(ss);
        
        // 转置方法
        ss.reverse();   
        System.out.println("It's was reversed:  " + ss);
    }
}
/*
 * result:
 * Hello World
 * 11
 * Hello World Hello JavaHello PHPHello Python
 * It's was reversed:  nohtyP olleHPHP olleHavaJ olleH dlroW olleH
 */