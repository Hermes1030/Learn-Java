package ACM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class work{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double[] course = new double[4];
        int n = inp.nextInt();

        ArrayList<double[]> Student = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j =0;j<4;j++){
                double c = inp.nextDouble();
                course[j] = c;
            }

        }
        Student.add(course);

        System.out.println(Student.size());        
        
        for(int i =0;i<Student.size();i++){
            System.out.print(Student.get(i).toString());
        }

    }
    
    public static String getType(Object o) { //获取变量类型方法
        return o.getClass().toString(); //使用int类型的getClass()方法
    } 
}