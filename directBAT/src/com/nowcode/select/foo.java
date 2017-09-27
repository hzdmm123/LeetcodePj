package com.nowcode.select;

/**
 * Created by hzdmm on 2017/7/29.
 */
public class foo {
    public static void testByte(){
        byte b1=1,b2=2,b3,b6,b8;
        final byte b4=4,b5=6,b7;
//        b3=(b1+b2);  /*语句1*/
        b3=(byte) (b1+b2);  /*语句1*/

//操作数为：byte、short、int 、char
        b6=b4+b5;    /*语句2*/
        b8=(byte)(b1+b4);  /*语句3*/
        b7=(byte)(b2+b5);  /*语句4*/
        System.out.println(b3+b6);
    }
}
