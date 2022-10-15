// 不死神兔
// 有一对兔子，从出生第三个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第二十个月的兔子对数为多少。
// 1，1，2，3，5，8...

// 为了存储多个月的兔子对数，定义一个数组，用动态初始化完成数组元素的初始化，长度为20
// 因为第一个月，第二个月兔子的对数是已知的，所以数组的第一个，第二个元素值也都是1
// 用循环数组计算每个月的兔子对数
// 输出数组中最后一个元素的值，就是第20个月的兔子对数
public class Test04{
	public static void main(String[] args){
		int[] rebbit = new int[20];


		rebbit[0] = 1;
		rebbit[1] = 1;

		for(int i = 2;i<rebbit.length;i++){
			rebbit[i] = rebbit[i-1] + rebbit[i-2];
		}
		System.out.println(rebbit[19]);
	}



}