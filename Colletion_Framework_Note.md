# 集合

## 1. 集合的体系结构

###  集合的两个结构

#### Collection(单列集合)

PS：其中 Collection、List、Set为接口

##### 1. **List系列**  

###### ArrayList

###### LinkedList

###### Vector(已经淘汰)

##### 2. **Set系列**

###### HashSet

###### HashSet—LinkedHasSet

###### TreeSet

##### 3. List和Set的==区别==

###### 				List系列集合：添加的元素是**==有序可重复有索引==**

###### 				Set系列的集合：添加的元素是==无序不重复没索引==

#### Map（双列集合）

## 2. collection集合

#####  1. Collection**==常用方法==**

Collection是单列集合的**祖宗接口，**它的功能是全部单列集合都可以**继承**使用的。

###### 4.1 ==**add**(E e)–boolean==:添加对象到集合

###### 4.2 ==clear()==:清空集合对象

###### 4.3 ==remove(E e)-boolean==:把给定对象重集合中删除

###### 4.4 ==contains(object obj)-boolean==: 

- 1. ###### 判断当前集合是否包含给定的对象

  2. ###### 对象为自定义对象时 调用contains时需要再javabean中对==equals方法进行重写==

###### 4.5 ==isEmpty()-boolean==:判断当前集合是否为空

###### 4.6 ==size()-int==: 返回集合的个数/长度

![image-20230514025042991](C:\Users\Steven\AppData\Roaming\Typora\typora-user-images\image-20230514025042991.png)

##### 2. Collection的遍历方式（==**含底层**==）

###### 2.1 迭代器遍历

 	1. 迭代器遍历相关的三个代码
 	 - Interor<E> iterator() :   获取一个迭代器对象
 	 - bollean hasNext(): 判断当前指向的位置是否有元素
 	 - E next(): 获取当前指向的元素并移动指针到下一位
 	2. 迭代器的==写法==

```java
package com.ittheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Steven
 * @ClassName A03_ColletionDemo3.java
 * @Description
 * @createTime 2023-05-14 18:49
 **/
public class A03_ColletionDemo3 {
    public static void main(String[] args) {
        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //2.获取迭代器对象
        Iterator<String> it = coll.iterator();
        //3.使用循环不断的去获取集合中的每一个元素
        while(it.hasNext()){
            //4.next方法的两件事：获取元素并移动指针
            String str = it.next();
            System.out.println(str);
        }
    }
}

```

3. 细节分析

   1.如果当前**没有元素还强行获取**  会报错**NoSuchElementException**
   2.迭代器遍历完毕，指针不会复位
   3.循环中只能用==一次==next方法
   4.迭代器遍历时,	不能用集合的方法进行增加或者删除
   								如果要进行删除可以使用**迭代器中的remove方法**进行删除
   								但是添加就没有办法进行
   
3. **==底层逻辑==**

   ![image-20230515211912681](C:/Users/Steven/AppData/Roaming/Typora/typora-user-images/image-20230515211912681.png)
   
   
   
   4.1 关于其中的modcount（修改次数） 会在进行next（）的时候对modCount进行判断（即checkForComdification）来确保没有调用集合中的方法对链表实现修改进而避免了==并发修改异常==
   
   关于并发修改异常的**定义**：   
   
   迭代器是依赖于集合而存在的，在判断成功后，集合的中新添加了元素，而迭代器却不知道，所以就报错了，这个错叫并发修改异常。
      简单描述就是：迭代器遍历元素的时候，通过集合是不能修改元素的。

###### 2.2 增强for循环

1. 格式

```java
        for (String s : coll) {
            System.out.println(s);
        }
        //快捷coll.for
```

2. 注意
     - **增强for遍历只能用于单列集合和数组**

###### 2.3 lambda表达式

使用lambda表达式的前提是接口必须是==**函数式接口**==

```java
  public static void main(String[] args) {
        //1.创建一个集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("a");
        coll.add("b");
        coll.add("c");

        //2.利用匿名内部类的形式
//        coll.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

     

        //3.Lambda表达式(其中小括号和参数匹配 参数的类型可以省略 大括号和方法体匹配 中间用->连接 其他都可以省略)
        //()->{}   
        // coll.forEach((String s)->{
        //    System.out.println(s);
        //  });
        coll.forEach(s-> System.out.println(s));

    }
```

###### 2.4三种方式的选择

- 迭代器: 在遍历的过程中需要**删除元素**，请使用迭代器
- 增强for、Lambda:
  **仅仅想遍历**，那么使用增强for或Lambda表达式

## 3. List集合

#### 1. List集合的特有方法

- Collection的方法List都继承了
- List集合因为有索引，所以多了很多索引的操作方法。
- ![image-20230514203727932](C:/Users/Steven/AppData/Roaming/Typora/typora-user-images/image-20230514203727932.png)

``` java
 public static void main(String[] args) {
        //创建一个集合
        List<String> list = new ArrayList<>();

        //2.添加元素
        list.add("a");
        list.add("b");
        list.add("c");

        //void add(int index,E element)  在此集合中的指定位置插入指定的元素
        //细节：原来索引上的元素会依次往后移
//        list.add(1,"Q");



         // E remove(int index)  删除指定索引处的元素，返回被删除的元素
//        String remove = list.remove(0);
//        System.out.println(remove);



        //E set(int index,E element)  修改指定索引处的元素,返回被修改的元素
//        String result = list.set(0, "QQQ");
//        System.out.println(result);


        //E get(int index)     返回指定索引处的元素
//        String s = list.get(0);
//        System.out.println(s);//a


        //3.打印集合
        System.out.println(list);
    }
```

#### 2. List集合的遍历方式

List系列集合的五种遍历方式:

1.迭代器:  在遍历的过程中需要==删除元素==，请使用迭代器
2.列表迭代器:在遍历的过程中需要==添加元素==，请使用列表迭代器
3.增强for/lambda表达式  仅仅想遍历
5.普通for循环  想对索引进行操作

```java
public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        //1.迭代器方式进行遍历
//        Iterator<String> it = list.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
        //2.增强for
//        for (String s : list) {
//            System.out.println(s);
//        }
        //3.Lambda表达式
       // list.forEach(s -> System.out.println(s));
        //4.普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //5列表迭代器
        //获取一个列表迭代器的对象，里面的指针默认也是指向0索引的
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            String str = it.next();
            if("bbb".equals(str)){
                it.add("ddd");//在遍历过程中可以进行添加删除的操作
            }
            System.out.println(str);
        }
    }
```



## 4.数据结构

### 	1.栈

#### 		栈的特点：==后进先出，先进后出==

### 	2.队列

#### 		队列的特点：==先进先出，后进后出==

### 	3.数组

#### 		数组的特点：==查询快 增删慢==（和）

### 	4.链表

##### 1.特点

 链表中的每个元素都是一个结点 每个结点都是一个独立的对象，在内存中是不连续的，每个结点包含的数据值和下个结点的地址

 链表的查询慢，无论查询那个数据都要从头开始查找，所以==查询较慢==，但是链表的==增删快==



![image-20230515112712963](C:/Users/Steven/AppData/Roaming/Typora/typora-user-images/image-20230515112712963.png)

##### 2. 双向链表![image-20230515113017985](C:/Users/Steven/AppData/Roaming/Typora/typora-user-images/image-20230515113017985.png)



## 5. ==ArrayList 集合==

### 1. ArrayList集合底层原理

1.1 利用空参创建的集合，在底层创建一个默认长度为0的数组、
1.2 添加第一个元素时，底层会创建一个新的长度为10的数组
1.3 存满时，会扩容1.5倍
1.4 如果一次添加多个元素，1.5倍还放不下，则新创建数组的长度以实际为准

![image-20230515122853760](C:/Users/Steven/AppData/Roaming/Typora/typora-user-images/image-20230515122853760.png)

## 6. LinkedList集合

#### 1. LinkedList集合底层原理

![image-20230515204842452](C:/Users/Steven/AppData/Roaming/Typora/typora-user-images/image-20230515204842452.png)

## 7. 泛型深入

### 1.为什么会有泛型

没有泛型的时候，集合如何存储数据

如果没有给集合指定的数据类型，默认认为所有集合的数据类型都是Object类型

此时可以往集合添加任意的数据类型

但是却带来一个**坏处** 我们在获取数据的时候，无法使用他的特有行为

此时出现了泛型，可以在添加数据的时候就把类型进行统一。

而且我们在获取数据的时候，也省的强转 使代码的编写更加的简易

### 2.泛型的格式

<数据类型>  泛型只能支持==引用数据类型==。

### 3.泛型的好处

3.1 统一**数据类型**

3.2 把运行时期的问题提前到了编译期间，避免了强制类型转换可能出现的异常，因为在编译阶段类型就能确定下来。

3.3扩展知识点：Java中的泛型是==**伪泛型**==

![image-20230516163529779](C:/Users/Steven/AppData/Roaming/Typora/typora-user-images/image-20230516163529779.png)

### 4. 泛型的细节

4.1 泛型中不能写基本数据类型

**==原因==**：因为在集合底层中 数据在集合中都是以Object类进行存储的，在使用到集合的数据时候才会把数据从Object强制转换，而**基本数据类型不能直接转换成Object类**所以只能使用==引用类型==

4.2 指定泛型的具体类型后，传递数据时，可以传入该类类型或者其子类类型

4.3 如果不写泛型，类型默认是object

### 5.泛型的定义

#### 5.1类后面		泛型类

使用场景：当一个类中，某个变量的数据类型不确定时，就可以定义带有泛型的类

![image-20230516164638665](C:/Users/Steven/AppData/Roaming/Typora/typora-user-images/image-20230516164638665.png)

![image-20230516170340160](C:/Users/Steven/AppData/Roaming/Typora/typora-user-images/image-20230516170340160.png)

#### 5.2方法上面		泛型方法

![image-20230516170629596](C:/Users/Steven/AppData/Roaming/Typora/typora-user-images/image-20230516170629596.png)

![image-20230516171142642](C:/Users/Steven/AppData/Roaming/Typora/typora-user-images/image-20230516171142642.png)

实例演示：

![image-20230516174157275](C:/Users/Steven/AppData/Roaming/Typora/typora-user-images/image-20230516174157275.png)

#### 5.3接口后面		泛型接口

![image-20230516174303427](C:/Users/Steven/AppData/Roaming/Typora/typora-user-images/image-20230516174303427.png)



![image-20230516175311349](C:/Users/Steven/AppData/Roaming/Typora/typora-user-images/image-20230516175311349.png)

### 6.泛型的继承和==通配符==

- 泛型不具备继承性，但是数据具备继承性

```java
 利用泛型方法有一个小弊端，此时它可以接受任意的数据类型
*  Ye Fu Zi Students
*
*  希望：本方法虽然不确定类型，但是以后希望只能传递Ye Fu Zi
     *  此时我们可以使用泛型的通配符：
     *      ？也表示不确定的类型
     *      它可以进行类型的限定
     *      ？ extends E： 表示可以传递E或者E所有的子类类型
     *      ？ super E:表示可以传递E或者E所有的父类类型
     */应用场景:
	1.如果我们在定义类、方法、接口的时候，如果类型不确定，就可以定义泛型类、泛型方法、泛型接口。
	2.如果类型不确定，但是能知道以后只能传递某个继承体系中的，就可以泛型的通配符泛型的通配符:
	关键点: 可以限定类型的范围。

```

[实际demo](https://github.com/Steven-267/Java_Collection_Framework/commit/5b5298b3caaad7a4bac04e0ccaa1ba4a22a9ab0f?diff=unified#diff-9ee7223f2f34191d8094b5d2fc7292af384fd3d38b89bc058751a873eb435c94)看其中a05Test包

## 8. 数据结构（树）

### 1.树的结构

每个树都是由多个节点（Node）构成的 每个节点中包含四部分（父节点地址、本身值、左子节点地址、右子节点地址）  

![image-20230517152933652](C:/Users/Steven/AppData/Roaming/Typora/typora-user-images/image-20230517152933652.png)

### 2.树中的专有名词

2.1  度：每一个节点的字节点的数量，在二叉树中，任意节点的度<=2  \

2.2 树高：树的总层数

2.3 根节点:最顶层的节点

2.4 左子节点

2.5 右子节点

2.6 根节点的左子树

2.7根节点的右子树



### 3. 普通二叉树

 特点：每一个节点上最多有两个子节点

###  4.二叉查找树（二叉排序树、二叉搜索树）

1. ##### 特点：

- 每一个节点上最多有两个子节点
- 任意节点上最多有两个子节点
- 任意节点右子树上的值都大于当前节点

2. ##### 二叉查找树**添加节点**的要求

- 小的存左边，大的存右边，一样的不存。

3. ##### 二叉查找树查找节点

4. ##### 二叉查找树的弊端:

可能会出现下面这种情况 从小到大一边倒  导致查询效率低  所以出现了另一种二叉树 即==平衡二叉树==

![image-20230517154752631](C:/Users/Steven/AppData/Roaming/Typora/typora-user-images/image-20230517154752631.png)

### 5.平衡二叉树

#### 1. ==规则==

任意的节点左右子树高度差不超过1

#### 2.旋转机制==⭐⭐

- #### 左旋

  - 当不平衡的点==不为**根节点**==时候
  - 确定支点：从添加的节点开始，不断的往父节找不平衡的节点
  - 以不平衡的节点作为支点
  - 把支点左旋降级，变成左子节点
  - 晋升原来的右子节点
  - 当不平衡的点==**为根节点**==时候
  - 以不平衡的节点作为支点
  - 将根节点的右侧往左拉
  - 原先的右子节点变成新的父节点，并把多余的左子节点出让，给已经降级的根节点当右子节点

- #### 右旋

  - 和左旋==同理==

- #### 触发条件：当添加一个节点之后，该树不再是一颗平衡二叉树

#### 3.需要旋转的四种情况

ps：感觉还是==具体情况具体分析==

左左：一次右旋
左右：先局部左旋，再整体右旋
右右：一次左旋
右左：先局部右旋，再整体左旋

### 6.二叉树的==遍历方式==⭐⭐⭐

#### 4.1 前序遍历（中左右）

#### 4.2中序遍历（左中右）⭐

#### 4.3后序遍历（左右中）

#### 4.4层序遍历

### ==7.红黑树❗⭐⭐⭐==

#### 1.来源

平衡二叉树是高度平衡的 但是高度平衡需要通过多次的旋转来确保二叉树高度平衡

而多次的旋转**==浪费时间==**

所以出现了一种以==红黑规则==为基础的数据结构 **==红黑树==**

#### 2.特点

- 是一个二叉查找树

- 不是高度平衡的

- 特有的==**红黑规则**==

- 节点的==**结构**==

  ![image-20230517161217894](C:/Users/Steven/AppData/Roaming/Typora/typora-user-images/image-20230517161217894.png)

#### 3.==红黑规则==❗❗

- **节点或是红色的，或者是黑色的**
- **根节点必须是黑色**
- **如果一个节点没有子节点或者父节点，则该节点相应的指针属性值为Nil，这些Nil视为叶节点，每个叶节点(Nil是黑色的**
- **如果某一个节点是红色，那么它的子节点必须是黑色(不能出现两个红色节点相连的情况)**
- **对每一个节点，从该节点到其所有后代叶节点的简单路径上，均包含相同数目的黑色节点;**
- ![image-20230517195638947](C:/Users/Steven/AppData/Roaming/Typora/typora-user-images/image-20230517195638947.png)

#### 4.添加节点的规则

1. 默认颜色：添加节点**默认是红色**的（效率高）
2. ==添加时**旋转变色**的规则==

![image-20230517195717130](C:/Users/Steven/AppData/Roaming/Typora/typora-user-images/image-20230517195717130.png)













## 9. Set系列集合

### 1.特点：

添加的元素是无序、不重复、无索引

- 无序：存取的顺序不一样
- 不重复：集合元素不重复（去重）
- 无索引：没有带索引的方法，所以不能使用普通for遍历，也不能通过索引获取元素
- Set集合的方法上基本上与Colletion的API一致

### 2.Set集合的实现类特点

- Hashset：无序、不重复、无索引
- LinkedHashSet：有序、不重复、无索引
- TreeSet：可排序、不重复、无索引

![image-20230521133720611](C:/Users/Steven/AppData/Roaming/Typora/typora-user-images/image-20230521133720611.png)

## 10. HashSet

ps：对比ArrayList多了去重

### 1.HashSet底层原理

- HashSet集合底层采取==哈希表==存储数据（int index =(数组长度 -1)&哈希值 –>当前元素应该存入的位置）
- 哈希表是一种对于增删改查数据性较好的结构
- 哈希表的组成
  - JDK8之前：**数组+链表**
  - JDK8之后：**数组+链表+红黑树**
- ==哈希值==：对象的整数表现形式
  - 定义
    - 根据hashCode方法算出来的int类型的整数
    - 该方法定义在obiect类中，所有对象都可以调用，默认使用地址值进行计算
    - 一般情况下，会重写hashCode方法，利用对象内部的属性值计算哈希值
  - 特点
    - 如果没有重写hashCode方法，不同对象计算出的哈希值是不同的（默认的hashCode的方法通过==对象地址值==计算
    - 如果已经重写hashcode方法，不同的对象只要属性值相同，计算出的哈希值就是一样的（==去重==）
    - 在小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样。(哈希碰撞）
- 如果集合中存储的是自定义的对象，必须要重写hashCode和equals方法
  - 重写hashCode方法是：想要通过属性值去计算哈希值
  - 重写equals方法是：想在比较的时候比较的是对象你内部的属性值
    - 如果不重写**默认使用地址值**进行计算和比较  没有意义 –>（==无法去重==）

### 2.添加演示

**当链表长度大于8而且数组长度大于等于64**时候将链表转成红黑树

![image-20230521141035670](C:/Users/Steven/AppData/Roaming/Typora/typora-user-images/image-20230521141035670.png)

### 3.HashSet的三个问题

- 问题1: HashSet为什么存和取的顺序不一样?
- 问题2: HashSet为什么没有索引?
  - 数据类型太多  不好定义索引
-   问题3: HashSet是利用什么机制保证数据去重的?
  - 通过
  - HashCode–>哈希值–>位置
  - equals–>对象内部的属性值是否相同

## 11. LinkedHashSet

### 1.特点

- 有序、不重复、无索引
- 这里的有序指的是保证存储和取出的元素顺序一致
- 原理:底层数据结构是依然哈希表，只是每个元素又额外的多了一个==双链表的机制记录存储的顺序==

### 2.使用场景

- 在以后如果要数据去重我们使用哪个?
  - 默认使用HashSet（效率高）
  - 如果要求**==去重且存取有序==**，才使用LinkedHashSet

## 12. TreeSet

ps：对比HashSet多了排序

### 1.特点

- 不重复、无索引、可排序
- 可排序: 按照元素的默认规则 (有小到大)排序
- TreeSet集合底层是基于==红黑树的数据结构==实现排序的，增删改查性能都较好。 

### 2.TreeSet集合默认的规则

- 对于数值类型: Integer，Double，默认按照从小到大的顺序进行排序
- 对于字符、字符串类型:按照字符在ASCII码表中的数字升序进行排序

### 3.TreeSet的两种比较方式

**使用原则**:默认使用第一种，如果第一种不能满足当前需求，就使用第二种

​				**第二种优先**

#### 1. 方式一：默认排序

默认排序/自然排序:Javabean类实现Comparable接口指定比较规则

类实现Comparable接口，重写里面的抽象方法，再指定比较规则

![image-20230521160942072](C:/Users/Steven/AppData/Roaming/Typora/typora-user-images/image-20230521160942072.png)

#### 

#### 2.方式二：比较器排序

比较器排序:创建TreeSet对象时候，传递比较器Comparator指定规则

![image-20230521162428467](C:/Users/Steven/AppData/Roaming/Typora/typora-user-images/image-20230521162428467.png)



![image-20230521170826509](C:/Users/Steven/AppData/Roaming/Typora/typora-user-images/image-20230521170826509.png)

![image-20230521170838450](C:/Users/Steven/AppData/Roaming/Typora/typora-user-images/image-20230521170838450.png)



## 13. 综合案例，使用场景

## 14. 源码分析

## 15.双列集合的特点

<img src="C:/Users/Steven/AppData/Roaming/Typora/typora-user-images/image-20230522202402363.png" alt="image-20230522202402363" style="zoom:25%;" />

### 1. 双列集合的特点

- 双列集合一次需要存一对数据，分别为键和值
- ==键不能重复==，值可以重复
- 键和值是一一对应的，每一个键只能找到自己对应的值
- 键+值这个整体我们称之为**“键值对”或者“键值对对象”**，在Java中叫做**“Entry对象“**

### 2.常见的==api==

![image-20230522202503802](C:/Users/Steven/AppData/Roaming/Typora/typora-user-images/image-20230522202503802.png)

#### 1.==put==–>添加、==覆盖==

put方法的细节;   添加/**覆盖**
在添加数据的时候，如果键不存在，那么直接把键值对对象添加到map集合当中,方法**返回nu11**在添加数据的时候，如果键是存在的，那么会把**原有的键**值对对象**覆盖**，会把==**被覆盖的值进行返回**==。

### 3.Map的·遍历方式

#### 1.键找值

主要方法：

```java
//获取所有的键，把这些键放到一个单列集合中
Set<String> keys = map.keySet() 这个方法会返回一个Set集合（单列集合）
//遍历单列集合，得到每一个键  使用到map.get(key)返回值是value值
               //lambda表达式
        /*  keys.forEach((s)->{
//            System.out.println(s);

            //3.3利用map集合种的键获取对应的值   get
            String value = map.get(s);
            System.out.println(s+"="+value);
        });*/

/*        //增强for
        for (String key : keys) {
            System.out.println(key);
            String s = map.get(key);
            System.out.println(key+"="+s);
        }*/

/*        //迭代器
        Iterator<String> iterator = keys.iterator();
        while(iterator.hasNext()){
            String i = iterator.next();
            System.out.println(i);
            String s = map.get(i);
            System.out.println(i+"="+s);

        }*/
        });
```

#### 2.键值对

通过map.entrySet（）**获取每一对键值对 然后存入到一个Set集合中**

再使用getKey（）和getValue（）两个方法对Set集合进行遍历

```java
 public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("标枪选手","马超");
        map.put("人物挂件","明世隐");
        map.put("御龙骑士","尹志平");

        //3.Map集合的第二种遍历方法
        //通过键值对对象进行遍历
        //3.1通过一个方法（entrySet（））获取所有的键值对对象
        //原理：把每一对键值对对象放到一个Set集合中，再通过getvalue（）和getkey（）两个方法分别获取键和值
        Set<Map.Entry<String, String>> entries = map.entrySet();

  /*      //增强for
        for (Map.Entry<String, String> entry : entries) {
            //System.out.println(entry);
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);

        }*/
/*
        //迭代器
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            //System.out.println(next);
            String key = next.getKey();
            String value = next.getValue();
            System.out.println(key+"="+value);
        }
*/
/*
        //lambda表达式
        entries.forEach(s-> {
            String key = s.getKey();
            String value = s.getValue();
            System.out.println(key+"="+value);
        });
*/



    }
```



#### 3.Lambda表达式

底层是**==键值对==！！！**

![image-20230523121624600](C:/Users/Steven/AppData/Roaming/Typora/typora-user-images/image-20230523121624600.png)

```java
 public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("鲁迅","这句话是我说的");
        map.put("曹操","不可能绝对不可能");
        map.put("刘备","接着奏乐接着舞");
        map.put("柯镇恶","看我眼色行事");


        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+"="+value); 
            }
        });
        //利用lambda表达式进行遍历
        map.forEach((key,value)-> System.out.println(key+"="+value));
    }
```



## 16.HashMap

### 1.特点和底层原理

- HashMap是Map里面的一个实现类
- 没有额外需要学习的特有方法，直接使用Map里面的方法就可以了
- 特点都是由键决定的:无序、不重复、无索引
- HashMap跟**==HashSet底层原理==**是一模一样的，都是哈希表结构
- HashMap底层是哈希表结构的
- 依赖hashCode方法和equals方法保证==**键的唯一**==
- ==如果键存储的是自定义对象，需要**重写hashCode和equals方法**==⭐⭐❗❗❗❗
- 如果值存储自定义对象，不需要重写hashCode和equals方法





## 17.LinkedHashMap

### 1.特点

- 由键决定:==**有序**==、不重复、无索引。
- 这里的有序指的是保证存储和取出的元素顺序一致这里的有序指的是保证存储和取出的元素顺序一致
- **原理**︰底层数据结构是依然哈希表，只是每个键值对元素又额外的多了一个**双链表**的机制记录存储的顺序。

## 18.TreeMap

## 19.源码解析

## 20.可变参数

## 21.Collections

## 22.综合练习 (集合的嵌套，斗地主等)

