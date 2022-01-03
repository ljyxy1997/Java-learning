public class Demo5 {
    public static void main(String[] args) {
//        操作比较大的数的时候，注意溢出问题
        int money = 1000000000;
        int years = 20;
        int total = money * years; //-1474836480,溢出
        long total2 = money * years;
        long total3 = ((long)years) * money; //先把一个数转成long

        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);


    }

}
