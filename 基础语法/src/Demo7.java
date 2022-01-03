public class Demo7 {
    //类变量   static
    static double salary = 2500;
    //类的属性，可以不初始化，若不初始化，则输出为这个类型的默认值
    String names;
    int age = 1;



    //main方法
    public static void main(String[] args) {
    //局部变量：在方法里面，必须声明和初始化值,只在本方法内有用
        int i = 10;

        System.out.println(i);
        //变量类型  变量名字 = new Demo7();
        Demo7 demo7 = new Demo7();
        System.out.println(demo7.age);
        System.out.println(demo7.names);

        //类变量   static
        System.out.println(salary);
    }

    //其他方法
    public void add(){

    }
}
