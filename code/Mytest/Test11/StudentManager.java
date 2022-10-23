package Test11;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        while (true) {

            System.out.println("--------��ӭ����ѧ������ϵͳ--------");
            System.out.println("1 ���ѧ��");
            System.out.println("2 ɾ��ѧ��");
            System.out.println("3 �޸�ѧ��");
            System.out.println("4 �鿴����ѧ��");
            System.out.println("5 �˳�");
            System.out.println("���������ѡ��");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line) {
                case "1":
                    addStudent(array);
                    break;
                case "2":
                    removeStudent(array);
                    break;
                case "3":
                    updataStudent(array);
                    break;
                case "4":
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("ллʹ��");
                    // break;
                    System.exit(0);
            }
        }

    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������ѧ��ѧ�ţ�");
        String sid = sc.nextLine();
        System.out.println("������ѧ��������");
        String name = sc.nextLine();
        System.out.println("������ѧ�����䣺");
        String age = sc.nextLine();
        System.out.println("������ѧ����ס�أ�");
        String address = sc.nextLine();

        Student s = new Student();
        s.setName(name);
        s.setAge(age);
        s.setSid(sid);
        s.setAddress(address);

        if (array.size() == 0) {
            if (array.add(s)) {
                System.out.println("��ӳɹ�");
            } else {
                System.out.println("δ֪ԭ�����ʧ��");
            }
        } else {
            for (int i = 0; i < array.size(); i++) {
                if (s.getSid().equals(array.get(i).getSid())) {
                    System.out.println("��ѧ���Ѵ��ڣ����ʧ��");
                    break;
                }
            }
        }

    }

    public static void removeStudent(ArrayList<Student> array) {
        System.out.println("������ɾ��ѧ����ѧ�ţ�");
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();

        if (array.size() == 0) {
            System.out.println("��ѧ�Ų����ڣ���ѧ��������Ϊ��");
            return;
        }

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (!s.getSid().equals(num) && i == array.size() - 1) {
                System.out.println("��ѧ�Ų�����");
                break;
            }
            if (s.getSid().equals(num)) {
                array.remove(i);
                System.out.println("ɾ���ɹ�");
                break;
            }

        }

    }

    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("��ǰѧ���б�Ϊ�գ�������ӡ�");
        } else {
            System.out.println("ѧ��\t����\t����\t��ס��");
            for (int i = 0; i < array.size(); i++) {
                System.out.println(array.get(i).getSid() + "\t" + array.get(i).getName() + "\t" + array.get(i).getAge()
                        + "\t" + array.get(i).getAddress());
            }
        }
    }

    public static void updataStudent(ArrayList<Student> array) {
        System.out.println("�������޸�ѧ����ѧ�ţ�");
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        
        for (int a = 0; a < array.size(); a++) {
            Student w = array.get(a);
            if(!w.getSid().equals(num) && a==array.size()-1){
                System.out.println("��ѧ�Ų�����");
                break;
            }
        }

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(num)) {

                System.out.println("����������ѧ��������");
                String name = in.nextLine();
                s.setName(name);
                System.out.println("����������ѧ�����䣺");
                String age = in.nextLine();
                s.setAge(age);
                System.out.println("����������ѧ����ַ��");
                String add = in.nextLine();
                s.setAddress(add);

            }

        }
    }
}