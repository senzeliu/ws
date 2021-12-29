package org.example.spring.aop.xml;

import org.example.spring.common.service.UserService;
import org.example.spring.common.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.plaf.multi.MultiSpinnerUI;
import java.util.*;

public class Application {


    static class MyPair {
        int count;
        String str;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        //System.out.println(str);
        String[] strs = str.split(" ");

        int n = Integer.parseInt(strs[0]);
        int k = Integer.parseInt(strs[1]);

        // System.out.println(k);
        // System.out.println(n);

        Map<String, MyPair> map = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            String ss = in.nextLine();
            MyPair myPair = map.get(ss);
            if (myPair == null) {
                myPair = new MyPair();
                myPair.count = 1;
                myPair.str = ss;
                map.put(ss, myPair);
            } else {
                myPair.count += 1;
            }
        }

        List<MyPair> list=topk(new ArrayList<>(map.values()),k);
        for(int i=k-1;i>=0;i--){
            System.out.println(list.get(i).str+" "+list.get(i).count);
        }

    }

    public static List<MyPair> topk(List<MyPair> ins,int k) {

        for (int i = 1; i < ins.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (ins.get(j).count < ins.get(j - 1).count) {
                    MyPair temp = ins.get(j - 1);
                    ins.set(j - 1,ins.get(j));
                    ins.set(j , temp);
                }
                else if (ins.get(j).count == ins.get(j - 1).count&&ins.get(j).str.compareTo(ins.get(j - 1).str)<0) {
                    MyPair temp = ins.get(j - 1);
                    ins.set(j - 1,ins.get(j));
                    ins.set(j , temp);
                }
            }
        }
        return ins.subList(ins.size()-k,ins.size());
    }

}
