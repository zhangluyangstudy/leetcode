package com.algorithm.stack;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_155 {
    private List<Integer> list=new ArrayList<Integer>();
    private int min=0;
    private int secondMin=0;
    private int size=0;
    public LeetCode_155() {


    }

    public void push(int x) {
        if(size<=0){
            min=x;
        }else{
            if(x<min){
                min=x;
            }

        }
        list.add(x);
        size++;

    }

    public void pop() {
        if(size>0){
            int top=list.remove(size-1);
            size--;
           changeMin(top);
        }

    }

    public int top() {
        if(size>0){
            return list.get(size-1);
        }
        return 0;
    }

    public int getMin() {
        return min;
    }

    public void changeMin(int top){
        if(size<=0){
            min=0;
        }else {
            if(min==top){
                int temp=list.get(0);
                for(int i:list){
                    if(temp>=i){
                        temp=i;
                    }
                }
                min=temp;
            }
        }
    }

    public static void main(String[] args) {
        LeetCode_155 l=new LeetCode_155();
        l.push(2);
        l.push(0);
        l.push(3);
        l.push(0);
        l.pop();
        l.pop();
        l.pop();
        int min = l.getMin();
        System.out.println(min);
    }


}
