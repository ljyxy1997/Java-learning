public class VariableTest {
    public static void main(String[] args) {

        //1.编码情况1
        long i = 123123; //此处long未加L未报错，其实是将int赋值给long，自动转换了
        //long j = 134646313314; 过大的整数
        long j = 132464466L;
        System.out.println(i);
        System.out.println(j);


        //******************************
        //float f1 = 12.3;（12.3是double型，高不会自动转低）


        //2.编码情况2
//        整型常量，默认类型为int
//        浮点型常量，默认为double
        byte b = 12;
        //byte b1 = b + 1; //编译失败

        //float f1 = b + 12.3; //编译失败(double转float需强制转)
    }
}
