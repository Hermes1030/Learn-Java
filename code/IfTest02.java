/* ���Խ���
 * ���󣺸���С�����Եĳɼ���ȡӦ�õĽ�������ͨ������̨���
 * ������100~95 ɽ�����г�
 *       94~90  ���ֳ�һ��
 *       89~80  ���ν��һ��
 *       80 ������ ����һ��
 */

import java.util.Scanner;

public class IfTest02 {
    public static void main(String[] args) {
    // С���ĳɼ����ݼ�������
        Scanner sc = new Scanner(System.in);
        System.out.print("������С���ĳɼ�:");
    
        int score = sc.nextInt();
    

        if (score <=100 && score >=0){
            if (score >= 95){
                System.out.println("����ɽ�����г�һ��");
            }else if(score <= 94 && score >= 90  ){
                System.out.println("��������԰һ��");
            }else if(score <= 89 && score >= 80){
                System.out.println("�������ν��һ��");
            }else {
                System.out.println("��С������һ��");
            }
        }else{
            System.out.println("��������ȷ�ķ���");
        }
        sc.close();
    }
    
}