#### 程序阅读题

1）冒泡排序的下沉法是将较大的元素就像一样从上部下沉到低部，其基本思想是从前向后对相邻的两个数组元素进行比较，若后面元素的值小于前面元素的值，则让这两个元素交换位置；否则，不进行交换。依次进行下去，第一趟排序可将数组中值最大的元素移至数组最后的位置。 请结合下面下沉法的程序回答后面的问题。

```java
public class Sorter {
      public static void main(String[] args) {
                int[] arr = { 63, 4, 24, 1, 3, 15 };
                Sorter sorter = new Sorter();
                sorter.sort(arr);
                System.out.println(Arrays.toString(arr));
      }
      public void sort(int[] p) {
            for (int i = 1; i < p.length; i++) {
                   // 比较相邻两个元素，较大的数往后冒泡
                  for (int j = 0; j < p.length - i; j++) {
                           if (p[j] > p[j + 1]) {
                                     int temp = _______ ;
                                     p[j] =  ________;
                                     p[j + 1] = ________ ;
                           }
                    }
             }
       }
}

```

（1）上述if语句中需填入3行代码，该部分是冒泡排序的关键步骤，请完善程序。
（2）上述程序执行后，最终程序的输出是？

##### 答案
（1）
```java
if(p[j] > p[j + 1]){
	int temp = p[j];    // temp 存大值
	p[j] = p[j + 1];    // 前后交换
	p[j + 1] = temp;
}
```

（2）
```java
[1, 3, 4, 15, 24, 63]
```


2）冒泡排序的上浮法是较小的元素就像气泡一样从底部上升到顶部，其基本思想是从后向前对相邻的两个数组元素进行比较，若后面元素的值小于前面元素的值，则让这两个元素交换位置；否则，不进行交换。依次进行下去，第一趟排序可将数组中值最小的元素移至下标为0的位置。 请结合下面的上浮法的程序回答后面的问题。 

```java
public class Sorter {
      public static void main(String[] args) {
                int[] arr = { 63, 4, 24, 1, 3, 15 };
                Sorter sorter = new Sorter();
                sorter.sort(arr);
                System.out.println(Arrays.toString(arr));
      }
      public void sort(int[] p) {
      	        for (int i = 1; i < p.length; i++) {
                // 比较相邻两个元素，较大的数往后冒泡
                       for (int j = p.length - 1; j > i; --j) {
                                if (p[j] < p[j - 1]) {
                                     int temp =______;
                                     p[j] =______;
                                     p[j - 1] =______;
                               }
                       }
                }
       }
}
```


（1）上述if语句中需填入3行代码，该部分是冒泡排序的关键步骤，请完善程序。
（2）上述程序执行后，最终程序的输出是？

##### 答案
（1）
```java
if(p[j] < p[j - 1]){
   int temp = p[j];   // temp 存小值
   p[j] = p[j - 1];   // 前后交换
   p[j - 1] = temp;
}
```
（2）
```java
[63, 1, 3, 4, 15, 24]
```
