package GeneriTongpeifu;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<?> a = new ArrayList<Object>();
        List<?> a1 = new ArrayList<Number>();
        List<?> a2 = new ArrayList<Integer>();

        System.out.println("-----");

        // 通配符的上限
        List<? extends Number> a3 = new ArrayList<Number>();
        List<? extends Number> a4 = new ArrayList<Integer>();
        System.out.println("-----");

        // 通配符的下限
        List<? super Number> a5= new ArrayList<Object>();
        List<? super Number> a6= new ArrayList<Number>();
//        List<? super Number> a7= new ArrayList<Integer>();


    }
}
