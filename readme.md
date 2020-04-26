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


#### 4.3.7 隐式参数和显式参数。
- 隐式参数：当前对象，可以用this指代
- 显式参数：传进来的参数

#### 4.3.8 封装
- 类的数据，都要设为private。数据只能通过类的方法访问。

#### 4.3.9 基于类的访问权限
- 类的方法可以访问该类 所有 对象的私有数据。

#### 4.3.11 final实例字段
- final 修饰的字段，构造对象时初始化，以后不能再改变

### 4.4静态字段与静态方法
####4.4.1 静态变量（因为每个对象都可以改，所以最好不要设置）
- 静态字段就是类字段，不需要初始化对象就可以访问，被该类所有的对象共享，
- 对于非静态的实例字段，每个对象都有一个自己的副本。

####4.4.2 静态常量
- Math类中的静态常量：
```java
public class Math{
    public static final double PI = 3.1415926;
}

```
无需生产对象，通过Math.PI就可以访问。
####4.4.3 静态方法（不需要this参数的方法）
- 静态方法只能访问静态字段，不能访问实例字段。但是实例对象可以调用静态方法（不推荐）。
- Math.pow(x,a)
什么时候使用静态方法：
1.方法不需要访问对象状态，需要的参数都显式提供。
2.方法只需要访问静态字段。

####4.4.4 工厂方法

####4.4.5 main方法
- main方法也是一个静态方法，可以用来做单元测试。

### 4.5方法参数
- 调用方式有按值调用和按引用调用；Java中都是按值调用，也就是说，方法得到的是所有参数值的一个副本，无法修改参数变量的内容。
- 参数有两类：基本数据类型和对象引用。基本数据类型不可修改，参数是对象引用，传来的是引用的副本（还是同一个地址），可以改变对象的属性。
- 需要注意的是，Java对 对象采用的也是按值传递，只不过对象引用的副本还是同一个地址。

### 4.6对象构造
####4.6.1 重载
同名的方法，对传入参数的不同，有不同的处理逻辑，但是返回类型必须相同。

####4.6.2 默认字段初始化
- 如果构造器中没有显式的为字段（属性）初始化，那么会自动赋为默认值：int->0;bo0lean->false;对象引用->null。

####4.6.3无参数的构造器

####4.6.4显式字段初始化

####4.6.5参数名
小写字母或者aName
```java
public Employee(String n,double s);
public Employee(String aName,double aSalary);
```
####4.6.6 this 调用另一个构造器（this是当前对象）
```java
public Employee(String n,double s){this(....)}

```

####4.6.7 初始化块
- 代码的顺序执行。

###4.7包
- 包将类组织在一个集合中，防止类重名。同理，包名需要绝对唯一。
- 一个类可以使用所属包中所有的类，以及其他包的公共类。访问其他包时用import。两个包中使用了两个同名类时，需要写全包名。
- 静态导入：只导入静态方法和静态字段。
 
 
 
## 5 继承

### 5.1 类、超类（父类）、子类

```java
public class Manage extends Employee{
}
```
- super，对比this，类似于一个父类的对象。
- 多态：一个对象变量，可以指示多种实际类型的现象，称为多态。
- 子类的方法可以覆盖父类的方法，如果父类方法为public，则子类方法也至少为public。
- final关键字：final类无法继续继承，没有子类
- 类的强制类型转换使用的场景：当使用子类中特有的方法时，才需要进行：
- 类的强制类型转换：只能在继承层次内进行强制类型转换，将父类强制类型转换时子类时，先用instanceof进行检查，看能不能转换。
- 抽象方法：返回空的方法，起到占位的作用。

- 抽象类：类中包含一个或以上抽象方法的类。抽象类不能进行实例化，不能生成对象。可以指定一个抽象类的对象变量，但是这个对象变量只能引用非抽象类对象。
```java
Person p = new Student("vince vu","Economics");
```
- public：对外部完全可见
- 无修饰符，默认：对本包可见。
- protect修饰符：对本包和所有子类可见。
- private:仅对本类可见。

### 5.2：Object类：所有类的超类
- 如果没有明确指出超类，则默认为Object类

#### 5.2.1 Object 类型的变量
- 可以用Object类型的变量引用任何类型的对象。
#### 5.2.2 equals方法
- 子类复写后的方法，用来判断值是否相等。
- == 判断内存地址是否相等。
- 书中有对写equals方法的建议（P177）
#### 5.2.4 hashCode方法
- 为了鉴别对象是否相同，Object类的hashcode方法默认根据对象的存储地址得到散列码。对于内置的String类型，复写了该方法，hashcode根据内容得出，相同内容的String，得到的hashcode也相同。
而对于StringBuild方法，由于没有复写hashcode方法，所以内容相同的对象，得到的hashcode不同。
- equals与hashcode定义必须相容：如果x.equals(y)->true,那么,x.hashcode()必须与y.hashcode()相同。

#### 5.2.5 toString方法
- 返回对象的字符串表示，比如Employee中toString方法->"Employee[name=...,salary=...,hireDay=...,]"

### 5.3 泛型数组列表
```java
ArrayList<Employee> staff = new ArrayList<Employee>();
var staff = new ArrayList<Employee>();
staff.add(new Employee("name",...)); //增加元素
staff.size() //返回元素个数
staff.ensureCapacity(100) //初始分配100个元素的内存空间
staff.trimToSize // 将数组列表存储容量削减到当前大小。
staff.get(i) //访问
staff.set(i,harry)//设置   
```
 5.4 对象包装器与自动装箱
 - 基本数据类型对应的对象称为包装器。 int->Integer... 