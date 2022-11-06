

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 现在给你一个仅由字符 a 和 b 组成的字符串 s 作为输入。
// 你需要编写一个程序来实现字符串中每个 a 都出现在每个 b 之前，
// 如果满足要求，
// 那我们就输出 True ；否则，我们就输出 False 。
public class aabb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        String[] a = {};
        a = s.split("");

        System.out.println(Judge(a));
    }

    public static boolean Judge(String[] a) {
        int i;  // 字母b的位置
        // 遍历list 取b下标
        for (i = 0; i < a.length; i++) {
            // System.out.println(a[i]);
            if (a[i].equals("b")) {
                // System.out.println("b在这个位置："+i);
                break;
            }
        }
        
        // int bcount = 0; // 计数b
        // int fbcount = a.length - i; // a列表中b最优长度
        
        // 遍历b后面有几个b 
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