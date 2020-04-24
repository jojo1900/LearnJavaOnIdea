# LearnJava
java的学习记录

### 基本数据类型：
1. 整数：
- byte (8位) -128~127
- short (2byte)
- int (4byte)(缺省默认int)
- long (8byte); long a = 11111111111111L
2. 浮点数：
- float (4byte) float a = 1.1f
- double(8byte)(缺省默认double)
3. 布尔
- boolean (1byte)
4. 字符
- char (2byte)  'a'；强烈建议不使用
### 运算符
(推荐)|| ：或或运算 如果第一个条件为True，则不进行后续的执行

|：或运算，进行后续判断

### 类型强制转换

```
int a = 65
char b = (char) a 
System.out.println(b);

'a'
```

### 字符串加法

String 加法不会改变原String的值，改变值需要用赋值符号

字符串是不可变对象，想要改变，需要重新赋值，


### 字符串相等
尽量用.equals()，不要用 == 

### 字符串构建
使用StringBuild类
```
public class SimpleFor {
    public static void main(String[] args){
        StringBuilder builder = new StringBuilder();
        String s = "BCD";
        builder.append("A");
        builder.append(s);
        String S = builder.toString();
        System.out.println(S);
    }
}

```

### 声明变量
变量使用前必须声明以及初始化，需要指明其类型。

对于局部变量，如果可以根据赋值判断其类型，可以不用指明类型。例如：
```
var num = 2;
var s = "hello"
```

### 声明常量
用final关键字声明常量，命名一般大写；例如：

```
public class SimpleFor {
    public static final double PI = 3.14;
    public static void main(String[] args){
        
    }
}
```

### 枚举类型

### 3.7输入输出

### 引用数据类型
- java 中数据类型分为两类：基本数据类型和引用类型，两者本质都是一个地址；不同是，基本数据类型找值只需要一跳，引用数据类型找值需要两跳。
```
LearnClass l1 = new LearnClass();
```
- 使用new操作符
## 4 对象与类

### 4.1 概述
#### 4.1.1 类
- 封装的关键在于，决不让类中的方法，访问其他类的实例字段。程序只能通过对象的方法，与对象数据进行交互。
- 所有的类都继承自一个超类： "Object"
- B继承自A类，则B类具有A类所有的方法及属性。

### 4.3用户自定义类

#### 4.3.4 构造器(构造函数)：
- 构造器与类同名
- 每个类有一个或以上的构造器(没有也没事，可以继承Object类的)
- 没有返回值，但是不能有void修饰
- 对象生成时，构造器会自动被调用，与new一起使用
  
#### 4.3.5 用 var 声明局部变量。
- 对于明显已知的类型，可以用var声明，例如 var a = 3;
