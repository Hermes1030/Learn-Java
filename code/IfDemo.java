/* 
 * if ����ʽ��
 *  
 *  if(��ϵ���ʽ){
 *      �����;
 *  }
 */
public class IfDemo {
    public static void main(String[] args) {
        
        System.out.print("��ʼ\n");

        // �������
        int a = 10;
        int b = 20;

        // Ҫ���ж�a��b��ֵ�������Ⱦ����a����b
        if (a == b){
            System.out.println("a��b���");
        }
        
        // Ҫ���ж�a��c��ֵ�������Ⱦ����a����c
        int c = 10;
        if(a == c){
            System.out.println("a��c���");
        }

        System.out.println("����");
    
    }
}
