package com.jvm;

public class Test1 {
    public static void main(String[] args) {
        Test1 t1=new Test1();
        int i=0;
        t1.add(i);
        i++;
        //int j=i++;
        System.out.println("i---------"+i);
//        System.out.println("j----------"+j);
    }
    public void add(int i){
        //1
        ++i;
    }
}
