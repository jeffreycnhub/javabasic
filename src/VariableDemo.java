/*
*  变量的定义构成：
*       数据类型 变量名 = 初始化值；
*  数据类型：
*     byte, short, int, long, float, double, char, boolean
*  定义变量的注意事项：
*    1、整型默认是int类型，定义long类型变量的时候，后边要加字母L（大小写均可）
*    2、浮点型默认是 double类型，定义 float 类型变量的时候，后边要加字母F（大小写均可）
*  使用变量的注意事项：
*    1、变量未赋值，不能使用；
*    2、变量只在它所属的范围内有效（这也是变量的 作用域）
*    3、一行上可以定义多个变量，但是不建议这么写
*
* */

public class VariableDemo {
    public static void main(String[] args) {
        byte b = 10;
        System.out.println(b);

        short s = 20;
        System.out.println(s);

        int i = 30;
        System.out.println(i);

        long l = 10000000000L;
        System.out.println(l);

        float f = 10.3F;
        System.out.println(f);

        double d =10.2;
        System.out.println(d);

        char c = 'a';
        System.out.println(c);

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");


    }

}
