public class OperatorDemo1 {
    public static void main(String[] args) {
        // 利用三元运算符完成实例01
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;

        int tempHeight = height1 > height2 ? height1 : height2;
        int maxHeight = tempHeight > height3 ? tempHeight : height3;

        System.out.println("maxHeight:" + maxHeight);

    }
}

/*
 * output:
 * maxHeight:210
 * 
 */