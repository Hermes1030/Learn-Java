package Test11;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        while (true) {

            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.print("请输入你的选择：");

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
                    System.out.println("谢谢使用");
                    // break;
                    // sc.close();
                    System.exit(0);
            }
        }

    }

    public static void addStudent(ArrayList<Student> array) {

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学生学号：");
        String sid = sc.nextLine();
        System.out.print("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.print("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.print("请输入学生居住地：");
        String address = sc.nextLine();

        Student s = new Student();
        s.setName(name);
        s.setAge(age);
        s.setSid(sid);
        s.setAddress(address);

        int targe = 0;
        for(int i=0;i<array.size();i++){
            if(s.getSid().equals(array.get(i).getSid())){
                targe = -1;
                break;
            }
        }
        if(targe == 0){
            if(array.add(s)){
                System.out.println("添加成功");
                return;
            }else{
                System.out.println("添加失败");
                return;
            }
        }else{
            System.out.println("该学号存在，添加失败");
            return;
        }




    }

    public static void removeStudent(ArrayList<Student> array) {
        System.out.println("请输入删除学生的学号：");
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();

        if (array.size() == 0) {
            System.out.println("该学号不存在，该学生表内容为空");
            return;
        }

        int key = 0;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(num)) {
                array.remove(i);
                System.out.println("删除成功");
                key = 1;
                break;
            }
        }
        if (key == 0) {
            System.out.println("该学号不存在");
            return;
        }
    }

    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("当前学生列表为空，请先添加。");
        } else {
            System.out.println("学号\t姓名\t年龄\t居住地");
            for (int i = 0; i < array.size(); i++) {
                System.out.println(array.get(i).getSid() + "\t" + array.get(i).getName() + "\t" + array.get(i).getAge()
                        + "\t" + array.get(i).getAddress());
            }
        }
    }

    public static void updataStudent(ArrayList<Student> array) {
        System.out.println("请输入修改学生的学号：");
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();

        int targe = -1;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(num)) {
                targe = 0;
                System.out.println("请重新输入学生姓名：");
                String name = in.nextLine();
                s.setName(name);
                System.out.println("请重新输入学生年龄：");
                String age = in.nextLine();
                s.setAge(age);
                System.out.println("请重新输入学生地址：");
                String add = in.nextLine();
                s.setAddress(add);
            }
        }
        if (targe == -1) {
            System.out.println("修改失败，该学号不存在");
            return;
        } else {
            System.out.println("修改成功");
            return;
        }
    }
}