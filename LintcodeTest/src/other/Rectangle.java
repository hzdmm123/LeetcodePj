package other;

/**
 * Created by hzdmm on 2017/10/23.
 * 实现一个矩阵类Rectangle，包含如下的一些成员变量与函数：

 两个共有的成员变量 width 和 height 分别代表宽度和高度。
 一个构造函数，接受2个参数 width 和 height 来设定矩阵的宽度和高度。
 一个成员函数 getArea，返回这个矩阵的面积。
 */
public class Rectangle {
       /*
     * Define two public attributes width and height of type int.
     */
    // write your code here
    public int height;
    public int width;
    /*
     * Define a constructor which expects two parameters width and height here.
     */
    // write your code here
    public Rectangle(int height,int width){
        this.height=height;
        this.width=width;
    }
    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    // write your code here
    public int getArea(){
        return height*width;
    }
}
