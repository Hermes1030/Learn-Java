/* 
	需求：
		逢七过

	思路：
		数据在1-100之间，用for循环实现数据的获取
		数据规则，用if语句实现数据的判断，要么个位是7，要么十位是7，要么能够被7整除
		在控制台输出
*/
public class Test03{
	public static void main(String[] args){
		for(int x = 1; x <=100; x++){
			if(x%10 ==7 || x/10%10 ==7 || x%7==0){
				System.out.println(x);
			}
		}
	}
}