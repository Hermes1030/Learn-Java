/* 
 * ͳ��ˮ�ɻ������������
 */
public class ForTest05 {
    public static void main(String[] args) {
        int count = 0;
        for(int i =100; i < 1000;i++){  // ˮ�ɻ�����һ����λ��������i�ĳ�ʼֵΪ100
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 10 / 10 % 10;

            if(a*a*a + b*b*b + c*c*c ==i){
                System.out.println(i);
                count++;
            }
        }
            System.out.println("һ����"+count+"��ˮ�ɻ���");
        
    }
}
