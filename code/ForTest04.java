/* 
 * ˮ�ɻ���
 * ˮ�ɻ���һ����λ������ʮ��λ�������͵���ԭ��
 * 
 * �ڿ���̨�������ˮ�ɻ���
 * 
 */
public class ForTest04 {
    public static void main(String[] args) {
        for(int i = 100;i<1000;i++){
            // ��ȡi��ÿ��λ
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 10 / 10 % 10;
            // �жϸ���λ�������Ƿ����ԭ��
            if(a*a*a + b*b*b + c*c*c == i){
                System.out.println(i+"��ˮ�ɻ���");
            }
        }     
    }
}
