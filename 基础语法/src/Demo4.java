public class Demo4 {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte) i; //内存溢出(byte范围（-128~127）超过了，所以溢出（大容量往小容量转换可能出现溢出从而出现数据不等）)
        System.out.println(b);
//        强制转换    （类型）变量名   高--低
//        自动转换    低--高

        double c = i;

        //--------------------------------------
//        byte,short,char,int,long,float,double
        //--------------------------------------
        /*
        注意点：
        1. 不能对布尔值进行转换
        2. 不能把对象类型转换为不相干的类型
        3. 在把高容量转换到低容量的时候，强制转换
        4. 转换的时候可能存在内存溢出或者精度问题！

         */
        System.out.println("-------------------");
        System.out.println((int)23.7);
        System.out.println((int)-23.7f);
        System.out.println("-------------------");
        char d = 'a';
        int e = d+1;
        System.out.println(e);
        System.out.println((char)e);
    }
}
