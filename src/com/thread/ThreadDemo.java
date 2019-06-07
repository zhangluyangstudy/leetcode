package com.thread;

public class ThreadDemo {
    public static void main(String[] args) {

        Thread t=new Thread(){

            public  void  run(){
                attack();
            }

        };

       // t.run();
        t.start();
        System.out.println("current"+Thread.currentThread().getName());

    }

    private static  void attack() {
        System.out.println("finght");
        System.out.println("current"+Thread.currentThread().getName());
    }


}
