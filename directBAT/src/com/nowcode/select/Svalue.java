package com.nowcode.select;

/**
 * Created by hzdmm on 2017/3/14.
 */
public class Svalue {
    public static void main(String[] args) {
        int i=5;
        int s=(i++)+(++i)+(i--)+(--i);
        System.out.println(s);
    }
}
