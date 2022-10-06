public class ArrayDemo{
    public static void main(String[] args) {
        int[] arr = new int[10];
        /* 
         *      左边：
         *          int 说明数组中的元素时int类型
         *          []  说明这是一个数组
         *          arr 这是数组的名称
         *      右边：
         *          new 为数组申请内粗才能空间
         *          int 说明数组中的元素类型是int类型
         *          []  说明这是一个数组
         *          10  数组长度，其实就是数组中的元素个数
         */
        // 输出数组名
        System.out.println(arr);    // [I@4517d9a3

        // 输出数组数据元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

    }
}