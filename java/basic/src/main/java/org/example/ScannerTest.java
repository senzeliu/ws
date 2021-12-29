package org.example;

import java.util.Scanner;

/**
 * @author liusenze
 * @Description:
 * @since 2021/9/30 3:34 下午
 */
public class ScannerTest {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        if(scanner.hasNext()){
            scanner.next();
        }
        scanner.close();
        test();
    }


    public static void test(int... s){

    }
}
