import java.util.Scanner;

/* 
 * 
 *      �ַ�����ת
 *              ����
 *                  ����һ��������ʵ���ַ����ķ�ת������¼��һ���ַ��������ø÷������ڿ���̨��������
 *                  ���磺����¼��abc��������cba
 * 
 *              ˼·��
 *                  1. ����¼��һ���ַ�������Scannerʵ��
 *                  2. ����һ��������ʵ���ַ�����ת������ֵ����String������String s
 *                  3. �ڷ�����StingBuilderʵ���ַ����ķ�ת�����ѽ��ת��String����
 *                  4. ���÷�������һ���������ս��
 *                  5. ������
 *       
 */

public class StringBuilderDemo04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String s0 = reverse(s);
        
        System.out.println(s0);

        in.close();
    }

    public static String reverse(String s) {
        
        StringBuilder sb = new StringBuilder(s);    // �ڶ���StringBuilderʱ ֱ�ӽ�s���빹������

        // ������ʵ���ñ������������ַ���

        // for (int i = 0; i < s.length(); i++) {
        //     sb.append(s.charAt(i));
        // }
        // sb.reverse();

        sb.reverse();
        return sb.toString();
        // return new StringBuilder(s).reverse().toString()
    }
}
