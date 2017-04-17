package com.nowcode.select;

/**
 * Created by hzdmm on 2017/4/12.
 */
public class StringEqualTest {
    public static void main(String[] args) {
        String s1= "111";
        String s2 = new String("111");
        String s3 = "11"+"1";
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s1.intern());
    }
}
