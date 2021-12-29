package org.example.innerclass;

import org.example.classload.Test1;

/**
 * @author liusenze
 * @Description:
 * @since 2021/12/16 6:12 下午
 */
class InnerClassTest {
    public static void main(String[] args) {
        OuterClass o=new OuterClass();
        OuterClass.InnerClass in=o.new InnerClass();
        in.test();

        OuterClass2 o2=new OuterClass2();
        OuterClass2.InnerClass2 in2=new OuterClass2.InnerClass2();
        in.test();

        // 匿名内部类
        new InnerClassTest(){
            @Override
            public void test() {
                super.test();
            }
        };
    }

    public void test(){}
}

public class OuterClass{

    public class InnerClass{
        public void test(){
            System.out.println("InnerClass");
        }
    }
}

class OuterClass2{

    public static class InnerClass2{
        public void test(){
            System.out.println("InnerClass");
        }
    }
}
