import java.math.BigDecimal;

public class Demo3 {
    public static void main(String[] args) {
//        整数拓展: 进制    二进制0b   十进制     八进制0        十六进制0x
        int i = 10;
        int i2 = 010;
        int i3 = 0x10;
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("==========================================");
//      浮点数拓展    银行业务怎么表示? 钱
//        BigDecimal  数学工具类
//        =================================================================
//      float   有限  离散  舍入误差    大约  接近但不等于
//        最好完全避免使用浮点数进行比较
//        最好完全避免使用浮点数进行比较
//        最好完全避免使用浮点数进行比较
        float f = 0.01f;    //0.1
        double d = 1.0 / 10;    //0.1
        System.out.println(f == d);   //false
        float d1 = 2311313213132131313213f;
        float d2 = d1 + 1;

        System.out.println(d1 == d2); //true
        System.out.println("==========================================");

//        ==================================================================
        //        字符拓展
//        ==================================================================
        char c1 = 'a';
        char c2 = '中';
        char c3 = '\u0061'; // unicode 采用16进制编码

        System.out.println(c1);
        System.out.println((int) c1);    //强制转换
        System.out.println(c2);
        System.out.println((int) c2);
        System.out.println(c3);

//        所有的字符本质是数字
//        编码  unicode 2字节
//        转义字符
//        \t 制表符
//          \n 换行符
        System.out.println("Hello\tworld");
        System.out.println("==========================================");
        String sa = new String("hello world");
        String sb = new String("hello world");
        System.out.println(sa == sb);
        String sc = "hello world";
        String sd = "hello world";
        System.out.println(sc == sd);
//        对象  从内存分析
//        布尔值拓展
        boolean flag = true; //此处只是单纯给flag赋值，目的是让后面的代码不报错
        if (flag == true) { }

        if (flag) { }
    }
}