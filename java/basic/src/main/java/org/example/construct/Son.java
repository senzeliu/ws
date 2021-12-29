package org.example.construct;

import javax.crypto.interfaces.PBEKey;

/**
 * @author liusenze
 * @Description:
 * @since 2021/9/30 4:51 下午
 */
public class Son extends Dad{

    public static void main(String[] args) {
        new Son();
        //new Son("");

        // 静态方法调用之和左边声明的类型相关
        Dad dad=new Son();
        dad.test1();
        dad=new Dad();
        dad.test1();
    }



    public Son(){
        //System.out.println("Son1");
        //System.out.println(i);
    }

    public Son(String s){
        this();
        //System.out.println("Son2");
    }


    static void test1() {
        System.out.println("static son");
    }


    void test2() {

    }
}
