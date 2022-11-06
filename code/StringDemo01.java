/* 
 *      String 构造方法：
 *          public String();
 *          public String(char[] chs);
 *          public String(byte[] bys);
 *          String s = "abc";
 */

public class StringDemo01 {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println("s1:" + s1);

        char[] chs = { 'a', 'b', 'c' };
        String s2 = new String(chs);
        System.out.println("s2:" + s2);

        byte[] bys = { 97, 98, 99 };
        String s3 = new String(bys);
        System.out.println("s3:" + s3);

    }
}
