

/* 
 * ƴ���ַ���
	����
		����һ����������int�����е����ݰ���ָ���ĸ�ʽƴ�ӳ�һ���ַ������أ����ø÷��������ڿ���̨��������
        ���磬����Ϊint[] arr ={1, 2, 3};ִ�з������������Ϊ��[1, 2, 3]
	˼·��
		1. ����һ��int���͵����飬�þ�̬��ʼ���������Ԫ�صĳ�ʼ��
		2. ����һ�����������ڰ�int�����е����ݰ���ָ����ʽƴ�ӳ�һ���ַ������ء�����ֵ����String�������б�int[] arr
		3. �ڷ�������String Builder����Ҫ�����ƴ�ӣ����ѽ��ת��String����
		4. ���÷�������һ���������ս��
		5. ������
 */

public class StringBuilderDemo03 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8};
        String ss = arrayString(arr);
        System.out.println(ss);
        
    }

    public static String arrayString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                sb.append("[");
            }

            sb.append(arr[i]);
            
            if(i!= arr.length -1){
                sb.append(", ");
            }

            if (i == arr.length - 1) {
                sb.append("]");
            }
        }

        return sb.toString();
    }

}
