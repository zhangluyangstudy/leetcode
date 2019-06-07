package com.algorithm.str;

public class LeetcodeSixFiveSenven   {

    public boolean judgeCircle(String moves) {
        char[] chars = moves.toCharArray();
        int sum1=0;
        int sum2=0;
        for(char c:chars){
            switch (c){
                case 'L':
                    sum1+=1;
                    break;
                case 'R':
                    sum1-=1;
                    break;
                case 'U':
                    sum2+=1;
                    break;
                case 'D':
                    sum2-=1;
                    break;
            }
        }
        return sum1==0&&sum2==0?true:false;

    }
}
