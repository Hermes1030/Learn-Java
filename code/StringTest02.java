import java.util.Scanner;

/* 
 * �����ַ���
 *          ���󣺼���¼��һ���ַ�����ʹ�ó���ʵ���ڿ���̨�������ַ���
 * 
 *          ˼·��
 *              1. ��Scannerʵ��
 *              2. �����ַ��������Ȼ�ȡ�ַ�����ÿ���ַ�
 *                  public char charAt(int index):����ָ����������cahrֵ���ַ���������Ҳ�Ǵ�0��ʼ
 *              3. �����ַ��������Ҫ�ܹ�����ַ����ĳ���
 *                  public int length():���ش��ַ����ĳ���
 *                  ����ĳ��ȣ�������.length
 *                  �ַ����ĳ��ȣ��ַ�������.length()
 *              4. �����ַ�����ͨ�ø�ʽ
 *              ```java
 *              for(int i=0; i<s.length(): i++){
 *                  s.charAt(i); // ����ָ�����������ַ�ֵ
 *              }
 *          
 */


public class StringTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("������һ���ַ�����");
        String line = input.nextLine();
        
        
        // �����ַ����������ܹ���ȡ���ַ����е�ÿ��ֵ
        
        /* System.out.println(line.charAt(0));
        System.out.println(line.charAt(1));
        System.out.println(line.charAt(2));
        for(int i=0;i<3;i++){
            System.out.println(line.charAt(i));
        } */
        
        // �����ַ�������λ�ȡ�ַ����ĳ���
        // System.out.println(line.length());

        for(int i = 0;i<line.length();i++){
            System.out.println(line.charAt(i));
        }
        input.close();
    }
}
