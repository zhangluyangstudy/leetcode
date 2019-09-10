package com.algorithm.stack;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode_739 {
    /**
     * 此方法不可取，时间复杂度太高
     * @param T
     * @return
     */
    public int[] dailyTemperatures(int[] T) {
        int[] target=new int[T.length];
        List<Integer> list=new ArrayList<Integer>();
        Stack<Integer> stack=new Stack<Integer>();
        Stack<Integer> temp=new Stack<Integer>();
        for (int i=T.length-1;i>=0;i--){
            stack.push(T[i]);
        }
        //先弹出第一个元素
        stack.pop();
        int count=0;
        int index=0;
        while (!stack.empty()){
            int t1=stack.pop();
            if(t1>T[index]){
                count++;
                target[index]=count+temp.size();
                index++;
                temp.push(t1);
                while (temp.size()>1){
                    stack.push(temp.pop());
                }
                temp.pop();
                count=0;
                continue;
            }
            if(stack.empty()&&temp.empty()){
                break;
            }
            temp.push(t1);
            if(stack.empty()){
                count=0;
                target[index]=count;
                index++;
                while (temp.size()>1){
                   stack.push(temp.pop());
                }
                temp.pop();
            }

        }
        return target;
    }

    @Test
    public void test1(){
        int[] ints = dailyTemperatures1(new int[]{73,74,75,71,69,72,76,73});
//        int[] ints = dailyTemperatures1(new int[]{75, 73, 74});
        for (int i=0;i<ints.length;i++){
            System.out.println(ints[i]);
        }

    }

    /**
     * 网上优秀算法
     * @param T
     * @return
     */
    public int[] dailyTemperatures1(int[] T) {
        Stack<Integer> stack=new Stack<Integer>();
        int[] res=new int[T.length];
        for (int i=0;i<T.length;i++){
            res[i]=0;
            while (!stack.empty()&&T[i]>T[stack.peek()]){
                int temp=stack.pop();
                res[temp]=i-temp;
            }
            stack.push(i);
        }
        return res;

    }
}
