import java.util.ArrayList;

//      �洢�ַ���������
//      	���󣺴���һ���洢�ַ����ļ��ϣ��洢3���ַ���Ԫ�أ�ʹ�ó���ʵ�����ڿ���̨�����ü���
//      	˼·��
//      		1. ��������
//      		2. ������������ַ�������
//      		3. �������ϣ�����Ҫ�ܹ���ȡ�������е�ÿһ��Ԫ�أ����ͨ��get(int index)����ʵ��
//      		4. �������ϣ���ȡ����
//      		5. �������ϵ�ͨ�ø�ʽ
//      		
//           ```java
//      		for(int i=0;i<���϶���.size();i++){
//      			���϶���.get(i)
//      		}
//      		```


public class ArrayListTest01 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        
        array.add("gao");
        array.add("zhi");
        array.add("qiang");
        array.add("Java");

        for(int i=0;i<array.size();i++){
            System.out.println(array.get(i));
        }
    }   
}
