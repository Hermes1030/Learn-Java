import java.util.ArrayList;
import java.util.Scanner;

import StudentAndTeacher.Student;

/* 

�洢ѧ�����󲢱���
	���󣺴���һ���洢ѧ������ļ��ϣ��洢3��ѧ������ʹ�ó���ʵ���ڿ���̨�����ü���ѧ�������������������ڼ���¼��
	˼·��
	1. ����ѧ����
	2. �������϶���
	3. ����¼��ѧ��������Ҫ������
	4. ����ѧ�����󣬰Ѽ���¼������ݸ�ֵ��ѧ������ĳ�Ա����
	5. �����������ѧ������
	6. �������ϣ�����ͨ�ñ�����ʽʵ�� 
    
*/

public class ArrayListTest03 {
    public static void main(String[] args) {
        // // ����¼����
        // Scanner input = new Scanner(System.in);
        // // ����ѧ����
        // System.out.println("������ѧ��1��������");
        // String name = input.nextLine();
        // System.out.println("������ѧ��2�����䣺");
        // String age = input.nextLine();
        // Student s1 = new Student(name, age);

        // System.out.println("������ѧ��2��������");
        // String name2 = input.nextLine();
        // System.out.println("������ѧ��2�����䣺");
        // String age2 = input.nextLine();
        // Student s2 = new Student(name2, age2);

        // System.out.println("������ѧ��3��������");
        // String name3 = input.nextLine();
        // System.out.println("������ѧ��3�����䣺");
        // String age3 = input.nextLine();
        // Student s3 = new Student(name3, age3);

        ArrayList<Student> array = new ArrayList<>();
        // array.add(s1);
        // array.add(s2);
        // array.add(s3);

        for (int i = 3; i > 0; i--) {
            addArray(array);
        }

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).getName() + ":" + array.get(i).getAge());
        }

    }

    public static void addArray(ArrayList<Student> array) {
        Scanner input = new Scanner(System.in);
        System.out.println("������ѧ��������");
        String name = input.nextLine();
        System.out.println("������ѧ�����䣺");
        String age = input.nextLine();

        // Student s = new Student(name, age);
        // array.add(s);

    }

}
