import java.util.Scanner;

// �ַ�����ת

//      ����
//          ����һ��������ʵ���ַ�����ת������¼��һ���ַ��������ø÷������ڿ���̨������
//      ���磬����¼��abc��������cba

//      ˼·��
//          1.����¼��һ���ַ�������Scannerʵ��
//          2.����һ��������ʵ���ַ�����ת������ֵ����String������String s
//          3.�ڷ����а��ַ������ű�����Ȼ���ÿһ���õ����ַ�ƴ�ӳ�һ���ַ���������
//          4.���÷�������һ���������ܽ��
//          5.������

public class StringTest05 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("������һ���ַ�����");
            String charArr = input.nextLine();
            // String getChar = reBack(charArr);
            String getChar = reBack(charArr);
            System.out.println("ת������ַ�����"+getChar);
        }

    }
    public static String reBack(String charArr){
        String charStack = "";
        for(int i=0;i<charArr.length();i++){
            // System.out.println(charArr.charAt(len - i -1)); 
            charStack += charArr.charAt(charArr.length() - i -1);
        }
        return charStack;
    }
}
/* 
 * 
 *  ����Ľ���
 *           ��������
 *           for(int i=charArr.length-1;i>=0;i--){
 *               charStack += charArr.charAt(i)
 *           }
 */ 