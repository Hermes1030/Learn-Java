import java.util.Scanner;

/* 
 * �û���¼
 *      ������֪�û������룬���ó���ʵ��ģ���û���¼�����λ��ᣬ��½�󣬸�����Ӧ��ʾ
 * 
 *      ˼·��
 *          1. ��֪�û��������룬���������ַ���
 *          2. ����¼���û�������
 *          3. �ü���¼����û������������֪���û����Ƚϣ�������Ӧ��ʾ��
 *          4. ��ѭ��ʵ�ֶ�λ��ᣬ��forѭ��
 */


public class StringTest01 {
    public static void main(String[] args) {
        // ������������
        String username = "gao";
        String userpasswd = "123456";
        // ����һ���û��������
        Scanner user_input = new Scanner(System.in);

        // ����forѭ����֤�û�����
        for(int i = 0;i<3;i++){

            System.out.println("�������û�����");
            String user = user_input.nextLine();
            System.out.println("���������룺");
            String passwd = user_input.nextLine();
    
            if(username.equals(user) && userpasswd.equals(passwd)){
                System.out.println("��¼�ɹ�");
                break;
                
            }else{
                if(i == 2){
                    System.out.println("��¼ʧ�ܣ���û�л�����");
                    break;
                }else{
                    System.out.println("��¼ʧ�ܣ��㻹��"+ (2-i) +"�λ���");
                }
            }


        }
        
        user_input.close();
    }
}
