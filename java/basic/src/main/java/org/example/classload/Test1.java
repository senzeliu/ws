package org.example.classload;

/**
 * @author liusenze
 * @Description:
 * @since 2021/12/16 5:24 下午
 */
public class Test1 {

    public static void main(String[] args) {
        new Son();
    }
}

class Dad {

    static {
        System.out.println("dad static");
    }

    {
        System.out.println("dad notstatic");
    }

    public Dad() {
        System.out.println("dad construct");
    }

    Dad test(){
        return null;
    }

}

class  Son extends Dad {

    int a;
    static {
        System.out.println("son static");
    }

    {
        System.out.println("son notstatic");
    }

    public Son() {
        System.out.println("son construct");
    }

    public Son test(){
        return null;
    }

}
