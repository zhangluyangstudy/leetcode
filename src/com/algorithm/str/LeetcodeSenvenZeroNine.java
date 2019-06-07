package com.algorithm.str;

public class LeetcodeSenvenZeroNine {
    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for(int i = 0 ; i < chars.length; i++){
            if(chars[i] >= 'A' && chars[i] <= 'Z'){
                chars[i] += 32;
            }
        }
        return new String(chars);
    }
}
