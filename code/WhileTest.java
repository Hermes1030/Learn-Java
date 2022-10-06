/* 珠穆朗玛峰
 * 需求：
 *      珠峰高8844430毫米，假设有一张足够大的纸，厚度是0.1毫米。
 * 请问：
 *      折叠多少次可以折成珠穆朗玛峰的高度？
 */
public class WhileTest {
    public static void main(String[] args) {
        int count = 0;
        double paper = 0.1;
        int zmlm = 8844430;

        while( paper<=zmlm ){
            paper *= 2;
            count++;
        }
        System.out.println("折叠"+count+"次，纸张和珠峰一样高。");
    }
}
