package org.example;

/**
 * @author liusenze
 * @Description:
 * @since 2021/9/30 10:49 上午
 */
public class IntegerTest {

    public static void main(String[] args) {
        int a1=10;
        int a2=0b10;
        int a3=010;
        int a4=0x10;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);


       /* int a,b,c=10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);*/


        int a22=-0b001;
        System.out.println(a22);
        System.out.println(a22>>1);


        short s1=1;
        byte b1=1;
        // byte加short 会转成int
        int i1=b1+s1;
        System.out.println(s1+b1);

        short s2=1;
        s1= (short) (s2+s1);
        byte b2=1;
        b2= (byte) (b2+b1);

        int i2=1;
        int i3=i2++;
        int i4=++i2;
        System.out.println(i3);//1
        System.out.println(i4);//3


        int i7=1;
        int i8=1;
        System.out.println((i7++)+(++i8));//3

        int i5=1;
        int i6=1;
        //System.out.println((i5++)+(++i6));//3
        System.out.println(((i5++)+(++i6))+(i5++));//5
        System.out.println(i5);//3


        Math.pow(2,3);

        System.out.println(Integer.toBinaryString(1));//1
        // 负数二进制用补码表示
        System.out.println(Integer.toBinaryString(-1));//11111111111111111111111111111111



        int i9=1;
        System.out.println(i9>>2);
        System.out.println(i9<<2);


        System.out.println(Integer.toBinaryString(-1>>>2));//1
        System.out.println(-1>>>2);
        System.out.println(Integer.toBinaryString(-1>>2));//1
        System.out.println(-1>>2);
        System.out.println(Integer.toBinaryString(-1<<2));//1
        System.out.println(-1<<2);

        System.out.println(-4>>1);
        System.out.println(-4>>>1);
    }


}
