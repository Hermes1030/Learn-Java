

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// ���ڸ���һ�������ַ� a �� b ��ɵ��ַ��� s ��Ϊ���롣
// ����Ҫ��дһ��������ʵ���ַ�����ÿ�� a ��������ÿ�� b ֮ǰ��
// �������Ҫ��
// �����Ǿ���� True ���������Ǿ���� False ��
public class aabb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        String[] a = {};
        a = s.split("");

        System.out.println(Judge(a));
    }

    public static boolean Judge(String[] a) {
        int i;  // ��ĸb��λ��
        // ����list ȡb�±�
        for (i = 0; i < a.length; i++) {
            // System.out.println(a[i]);
            if (a[i].equals("b")) {
                // System.out.println("b�����λ�ã�"+i);
                break;
            }
        }
        
        // int bcount = 0; // ����b
        // int fbcount = a.length - i; // a�б���b���ų���
        
        // ����b�����м���b 
        // for(int p =i;p<a.length;p++){
        //     if(a[p].equals("b")){
        //         bcount ++;
        //     }
        // }
        for(int p = i;p<a.length;p++){
            if(a[p].equals("a")){
                return false;
            }
        }
        return true;
        //          a, a, a, b, b, b
        //          b, a, b, a,...
        //          b, b, b, b,....
        //downmark  0  1  2  3  4  5
        //length  6
        // i = 3; bcout = 3; fbcount = a.length - i;
        // aaabab
        // i = 3; bcount = 2;
        
        // if(bcount!=fbcount){
        //     return false;
        // }else{
        //     return true;
        // }

    }

    // System.out.println(ss.charAt(1));

}