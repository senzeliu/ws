package org.example.innerclass1;

import org.example.innerclass.OuterClass;

/**
 * @author liusenze
 * @Description:
 * @since 2021/12/16 6:12 下午
 */
public class InnerClassTest {
    public static void main(String[] args) {
        OuterClass o = new OuterClass();
        OuterClass.InnerClass in = o.new InnerClass();
        in.test();
    }
}
