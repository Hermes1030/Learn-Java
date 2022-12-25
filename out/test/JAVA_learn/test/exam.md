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

1. 上述if语句中需填入3行代码，该部分是冒泡排序的关键步骤，请完善程序。

```java
if(p[j] > p[j + 1]){
	int temp = p[j];    // temp 存大值
	p[j] = p[j + 1];    // 前后交换
	p[j + 1] = temp;
}
```

2. 上述程序执行后，最终程序的输出是？

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

1. 上述if语句中需填入3行代码，该部分是冒泡排序的关键步骤，请完善程序。

```java
if(p[j] < p[j - 1]){
   int temp = p[j];   // temp 存小值
   p[j] = p[j - 1];   // 前后交换
   p[j - 1] = temp;
}
```

2. 上述程序执行后，最终程序的输出是？

```java
[63, 1, 3, 4, 15, 24]
```


3）已知一个类的定义如下，请根据该类的定义回答后面的问题。

```java
public class Pair<T extends AbstractList<Integer> & List<Integer> & RandomAccess, U> {
        private T first;
        private U second;
        public Pair() {
                first = null;
                second = null;
        }
        public Pair(T first, U second) {
                this.first = first;
                this.second = second;
        }
        public T getFirst() {
                return first;
        }
        public U getSecond() {
                return second;
        }
        public void setFirst(T newValue) {
                first = newValue;
        }
        public void setSecond(U newValue) {
                second = newValue;
        }
}
```

1. 该类用到了Java中的什么机制？

```text
泛型机制
```

2. 在类中“T extends AbstractList\<Integer> & List\<Integer> & RandomAccess”和“U”表示含义分别是什么？

```Text
表示类Pair中类型参数T为AbstractList，List，RandomAccess的子类，U为任意类型
```

3. 在类的定义中有AbstractList\<Integer>、List\<Integer> 、RandomAccess三个类型限定，这三个限定是有次序要求的，哪些可以调？哪些不可以调？

```Text
AbstractList<lnteger>必须放在首位，List<lnteger> 和 RandomAccess 可调换位置
```

4. 按下列方式使用创建对象是否合法：
     （a）Pair<ArrayList\<Integer>, Double> t = new Pair<ArrayList\<Integer>, Double>();
     （b）Pair<ArrayList\<String>, Integer> t = new Pair<ArrayList\<String>, Integer>();
     （c）Pair<ArrayList\<Integer>, float> t = new Pair<ArrayList\<Integer>, float>();

```Text
(a)合法，(b)ArrayList<String>超出限制，(c)类型参数 (float) 不能为基本类型
```



4）程序设计题1
1. 请设计并编写一个同时满足下列所有需求的抽象类。
	（a）该类是抽象类，类名为Shapes，其所在的包名为oop.core.base，该类可以通过import语句被其他包中的类所访问到；
	（b）该类中有两个int类型的成员变量，变量名分别为width和height，这两个变量可以被同一个包中的类以及该类的所有子类访问到；
	（a）该类含有一个构造方法，该构造方法需传进去两个int类型的参数，参数名称分别为：width，height，该构造方法使用this关键字实现了对其成员变量width和height的初始化；
	（a）该类中含有一个方法名为getArea的抽象方法，该方法无输入参数且其返回值为double类型；
	（b）该类中含有一个方法名为getPerimeter的抽象方法，该方法无输入参数且其返回值为double类型。
	
```java
package oop.core.base
public abstract class Shapes{
	public int width;
	public int height;
	public Shapes(int width,int height){
		this.width = width;
		this.height = height;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
}
```

2. 请设计并编写一个同时满足下列所有需求的类。
	（a） 该类的类名为Square，其包名为oop.core，该类可以通过import语句被其他包中的类所访问到，该类继承了第1题中的抽象类Shapes；
	（b）该类有一个构造方法，该构造方法含有两个int型输入参数，参数名称分别为width，height，该构造方法通过super关键字实现了对其父类成员变量的初始化；
	（c）该类对其父类的getArea方法进行了实现，要求返回面积，即计算width* height的值；
	（d）该类对其父类的getPerimeter方法进行了实现，要求返回周长，即2*(width+height)的值。
	
```java
package opp.core;
public class Square extends Shapes{
	public Square (int width,int height){
		super(width, height);
		this.widht = widht;
		this.height = height;
	}
	public double getArea(){
		return this.widht*this.height;
	}
	public double getPerimeter(){
		return 2*(this.widht+this.height)
	}
}
```
3.  在第1题和第2题的基础之上，仔细阅读程序，写出下列程序的输出结果。

```java
package oop.test;
import oop.core.Square;
public class SquareTest {
     public static void main(String[] args) {
          Square squ = new Square(3, 4);
          double area = squ.getArea();
          double peri = squ. getPerimeter();
          System._out_.print("area = " + area + "  peri = " + peri);
      }
}
```

```bash
area = 12.0  peri = 14.0
```

5）程序设计题2
1. 请设计并编写一个同时满足下列所有需求的接口。
	（a）定义一个public接口，接口名为Shapes，其所在的包名为oop.core.base；
	（b）定义返回值为double类型并且无输入参数的public抽象方法，其中方法名为getArea；
	（c）定义返回值为double类型并且无输入参数的public抽象方法，其中方法名为getPerimeter。
	
```java
package oop.core.base;
public interface Shapes{
	public abstract double getArea();
	public abstract double getPerimeter();
} 
```

2. 请设计并编写一个同时满足下列所有需求的类。
	（a）定义一个public类Square，其包名为oop.core，且该类实现了第1题中的接口Shapes；
	（b）在类Square中定义两个double类型的public成员变量，其中成员变量名为：width，height；
	（c）用带有两个形式参数的public构造方法对Square类中的成员变量进行初始化，其中形式参数名为：width，height；
	（d）在Square类中对getArea方法进行实现，返回面积，即width* height；
	（e）在Square类中对getPerimeter方法进行实现，返回周长，即2*(width+height)。

```java
package oop.core;
public class Suare implements Shapes{
	public double width;
	public double height;
	public Square(double widht,double height){
		this.widht = widht;
		this.height = height;
	}
	public double getArea(){
		return this.width*this.height;
	}
	public double getPerimerter(){
		return 2*(this.width+this.height);
	}

}
```

3. 在第1题和第2题的基础之上，仔细阅读程序，写出下列程序的输出结果。

```java
package oop.test;
import oop.core.Square;
public class SquareTest {
     public static void main(String[] args) {
          Square squ = new Square(3, 4);
          double area = squ.getArea();
          double peri = squ. getPerimeter();
          System.out.print("area = " + area + "  peri = " + peri);
      }
}
```

```java
area = 12.0  peri = 14.0
```