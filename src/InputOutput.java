import com.sun.security.jgss.GSSUtil;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Date;
import java.util.Scanner;

public class InputOutput {
    public  static void  main(String[] args) throws IOException {

        //输入时，先构造一个与 "标准输入流" system.in关联的Scanner对象
        Scanner in = new Scanner(System.in);

        //读取一行
        String name = in.nextLine();
        System.out.println(name);

        //读取一个单词,遇到空格时结束
        String greeting = in.next();
        System.out.println(greeting);

        //读取一个整数
        int age = in.nextInt();

        //格式化字符串,输出时，用printf
        String message = String.format("hello,%s,next year,your age will be %d",name,age+1);
        System.out.println(message);

        System.out.printf("current time: %tc",new Date());

        //文件读取与写入
        Scanner readFile = new Scanner(Path.of("C:\\Users\\yang9\\IdeaProjects\\LearnJava\\src"), StandardCharsets.UTF_8);
        PrintWriter writeFile = new PrintWriter("writeFile.txt",StandardCharsets.UTF_8);

    }

}
