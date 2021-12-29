package org.example;

/**
 * @author liusenze
 * @Description:
 * @since 2021/9/30 10:49 上午
 */
public class ChartTest {

    public static void main(String[] args) {

        char a= 1;
        System.out.println(a);
        byte b=1;
        a= (char) b;
        System.out.println(a);
        short s=1;
        a= (char) s;
        System.out.println(a);
        int i=1;
        a= (char) i;
        System.out.println(a);
        a='\u0061';
        System.out.println(a);

        System.out.println("\t33333333");

        b= (byte) s;
        s=b;
        b= (byte) a;
        s= (short) a;
        i=a;
    }

}
