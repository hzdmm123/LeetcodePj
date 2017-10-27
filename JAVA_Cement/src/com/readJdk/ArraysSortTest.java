package com.readJdk;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by hzdmm on 2017/10/13.
 */
public class ArraysSortTest {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("6", "1", "3", "1","2");

        Collections.sort(strings);//sort方法在这里

        for (String string : strings) {

            System.out.println(string);
        }
    }
}
