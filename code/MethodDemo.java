public class MethodDemo {
    public static void main(String[] args) {
        isEvenNumber();

    }
    // 定义一个方法 在方法中定义一个变量，判断该数据是否是偶数
    public static void isEvenNumber(){
        int number = 10;

        // 判断该数是否是偶数
        if(number%2==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    
    }

}
