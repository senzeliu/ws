package org.example.reflection;

/**
 * @author liusenze
 * @Description:
 * @since 2021/12/16 6:43 下午
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(Test.class.getClass());
        System.out.println(Inter.class.getClass());
        System.out.println(Cla.class.getClass());
    }

}

interface Inter {

}

abstract class Cla{

}
