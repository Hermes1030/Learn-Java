public class MethodDemo01{
    public static void main(String[] args) {
        // 常量值的调用
        isEvenNumber(11);
    }
    // 需求：定义一个方法，该方法接收一个参数，判断该数据是否是偶数
    public static void isEvenNumber(int number){
        if(number%2==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}