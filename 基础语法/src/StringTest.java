/*
只是七种基本数据类型之间进行运算，不包括boolean类型
String类型变量的使用
1.string属于引用数据类型,翻译为字符串
2.声明string类型变量时，使用”“
3.String可以和八种基本数据类型变量做运算，且只能为连接运算：+
4.运算结果必是string
5.八种基本数据类型之间运算是数的运算
 */



public class StringTest {
    public static void main(String[] args) {
        String s1 = "hello world";
        System.out.println(s1);
        String s2 = "a";
        String s3 = "";
        System.out.println(s2);
        System.out.println(s3);
        
        //********************************
        int number = 1001;
        String numberstr = "学号";
        String info = numberstr + number;
        System.out.println(info);
        //********************************
        //练习1
        char c = 'a'; //97  A:65
        int num = 10;
        String str = "hello";
        System.out.println(c+num+str);//107hello
        System.out.println(c+str+num);//ahello10
        System.out.println(c+(num+str));//a10hello
        System.out.println((c+num)+str);//107hello
        System.out.println(str+num+c);//hello10a

        //练习2   谨记”“为string
        //输出*   *
        System.out.println("*   *");
        System.out.println('*' + '\t' + '*');
        System.out.println('*' + "\t" +'*');
        System.out.println('*' + '\t' +'*');
        System.out.println('*' + ('\t' +"*"));

    }
}
