/* �洢ѧ�����󲢱���
	���󣺴���һ���洢ѧ������ļ��ϣ��洢3��ѧ������ʹ�ó���ʵ���ڿ���̨�����ü���
	˼·��
	1. ����ѧ����
	2. �������϶���
	3. ����ѧ������
	4. ���ѧ�����󵽼�����
	5. �������ϣ�����ͨ�ñ�����ʽʵ�� */

import java.util.ArrayList;

public class ArrayListTest02 {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();

        // Student s1 = new Student("gao", 20);
        // Student s2 = new Student("zhi", 22);
        // Student s3 = new Student("qiang", 23);

        // array.add(s1);
        // array.add(s2);
        // array.add(s3);

        
        for(int i=0;i<array.size();i++){
            System.out.println(array.get(i).getName() +":"+ array.get(i).getAge());
        }


    }
}
