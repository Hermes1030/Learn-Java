/* 
 * if 语句格式：
 *  
 *  if(关系表达式){
 *      语句体;
 *  }
 */
public class IfDemo {
    public static void main(String[] args) {
        
        System.out.print("开始\n");

        // 定义变量
        int a = 10;
        int b = 20;

        // 要求判断a和b的值，如果相等就输出a等于b
        if (a == b){
            System.out.println("a和b相等");
        }
        
        // 要求判断a和c的值，如果相等就输出a等于c
        int c = 10;
        if(a == c){
            System.out.println("a和c相等");
        }

        System.out.println("结束");
    
    }
}
