public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("s��ջ�ڴ��ַ��" + s);
        s.name = "Msr Gao";
        
        // ����˽�г�Ա����
        s.setAge(50);
        s.getAge();
        System.out.println(s.getAge());
        
        
        s.study();
        s.doHomework();
        // System.out.println(s.name + s.age);

        // �������
        Student s1 = new Student();
        System.out.println("s1��ջ�ڴ��ַ��" + s1);
        s1.name = "Msr Li";
        // s1.age = 51;

        s1.study();
        s1.doHomework();
        // System.out.println(s1.name + s1.age);

        // �������ָ��ͬһ����
        System.out.println("s1.name��ʼֵΪ��"+s1.name);
        // System.out.println("s1.age��ʼֵΪ��"+s1.age);
        Student s2 = s1;
        s2.name = "������s2";
        // s2.age = 1001;

        System.out.println("s1.name���:"+ s1.name);
        // System.out.println("s1.age���:"+ s1.age);
        System.out.println("s2.name" + s2.name);
        // System.out.println("s2.age:"+ s2.age);
    }
}

/* 
 * ִ�������

s��ջ�ڴ��ַ��Student@4517d9a3
Studing  
doing    
Msr Gao50
s1��ջ�ڴ��ַ��Student@372f7a8d
Studing
doing
Msr Li51

s1.name��ʼֵΪ��Msr Li
s1.age��ʼֵΪ��51
s1.name���:������s2
s1.age���:1001
s2.name������s2
s2.age:1001

*/