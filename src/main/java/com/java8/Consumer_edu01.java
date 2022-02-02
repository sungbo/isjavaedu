package com.java8;

import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_edu01 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);

        /*
        list.forEach(new Consumer<Integer>() {
            public void accept(Integer t) {
                System.out.println("값은 :: " + t);
            }
        });
         */

        list.forEach(s->System.out.println(s
        ));

    }

}
