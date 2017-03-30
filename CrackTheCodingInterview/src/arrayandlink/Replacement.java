package arrayandlink;

import java.util.*;

public class Replacement {
    public static String replaceSpace(String iniString, int length) {
        // write code here
        char[] str=iniString.toCharArray();
        int spacecount=0,newlength;
        for(int i=0;i<length;i++){
            if(str[i]==' '){
                spacecount++;
            }
        }

        newlength=length+spacecount*2;
        str[newlength]='\0';
        for(int i=length-1;i>=0;i--){
            if(str[i] == ' '){
                str[newlength-1]='0';
                str[newlength-2]='2';
                str[newlength-3]='%';
                newlength=newlength-3;
            }else{
                str[newlength-1]=str[i];
                newlength=newlength-1;
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.print(replaceSpace("wq",2).toCharArray());
    }

}