public class HelloWorld {
    //文件名需要与类名相同

    //main方法是程序的入口
    public static void main(String[] args) {
        System.out.println("hello world"); //sout 简写
        boolean a = true;
        boolean b = false;
        System.out.println(a || (10 / 0 > 1)); //  || 或或运算 如果第一个条件为True，则不进行后续的执行
        int c = 400;
        c >>= 2; //移位运算符，

        int d = 65;
        char e = (char) d; //强制类型转换
        System.out.println(e);

        String s = "";
        System.out.println("a+b=" + (c + d));


    }
}
