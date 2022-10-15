// 数组内容相同
// 定义一个方法用来比较连个数组的内容是否相同，返回boolean，参数int[] arr,int[] arr2

// 定义两个数组，定义一个方法，比较两个数组的内容是否相同，调用方法，输出结果
// 1. 首先比较数组长度，如果长度不相同，数组内容肯定不相同，返回false
// 2. 其次遍历，比较两个数组中的每一个元素，只要有元素不相同，返回false
// 3. 最后循环遍历结束后，返回true
public class Test07{
	public static void main(String[] args){
		int[] arr = {11,22,33,44,55};
		int[] arr02 = {11,22,33,44,5};

		// 调用方法
		System.out.println(compare(arr, arr02));
	}
	public static boolean compare(int[] arr, int[] arr02){
		// 如果数组长度不相等，直接返回false
		if(arr.length != arr02.length){
			return false;
		}

		// 遍历数组中的元素
		for(int i=0;i<arr.length;i++){
			if(arr[i] != arr02[i]){
				return false;
			}
		}
		return true;
	}
}