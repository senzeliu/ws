package org.example;

/**
 * @author liusenze
 * @Description:
 * @since 2021/9/30 10:49 上午
 */
public class FloatTest {
    public static void main(String[] args) {
        float a1 = 111;
        float a2 = 111;
        System.out.println(a1 == a2);

        float a3 = 11111111111111111f;
        float a4 = 11111111111111122f;
        System.out.println(a3 == a4);
    }
}
