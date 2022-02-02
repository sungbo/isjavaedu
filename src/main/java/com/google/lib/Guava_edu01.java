package com.google.lib;

import com.google.common.base.Splitter;

import java.util.Iterator;


//구아바 기능 사용해보기
public class Guava_edu01 {

    private static String fruits = "사과딸기레몬포도";

    public static void main(String[] args) {

        Iterable<String> split = Splitter.fixedLength(2).split(fruits);
        Iterator<String> iterator = split.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());

    }

}
