package com.algorithm.hash;

import java.util.*;

public class LeetCode_1002 {

    /**
     * copy  网上答案
     * @param A
     * @return
     */
    public List<String> commonChars(String[] A) {
        List<String> result = new ArrayList<>();
        // 数组为空或者长度小于2，直接返回空结果
        if(A == null || A.length < 2){
            return result;
        }

        // 使用Map统计每个字符串中字符出现的次数，并把Map结果放入到List中
        List<Map<Character, Integer>> list = new ArrayList<>();
        for (String a : A) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : a.toCharArray()) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            list.add(map);
        }

        // 获取所有Map中key的交集（相当于获取每个字符串中都出现的字符）
        Set<Character> retainSet = list.get(0).keySet();
        for (int i = 1; i < list.size(); i++) {
            retainSet.retainAll(list.get(i).keySet());
        }

        // 循环key的交集，并把获取到的次数最小的值为结果
        // 比如字符串1中a出现了3次，字符串2出现了3次，字符串3出现了1次，那么这3个集合中重复的a的个数就为1
        Iterator<Character> iterator = retainSet.iterator();
        while (iterator.hasNext()){
            Character current = iterator.next();
            int minCount = list.get(0).get(current);
            for (int i = 1; i < list.size(); i++) {
                Integer cnt = list.get(i).get(current);
                if(cnt < minCount){
                    minCount = cnt;
                }
            }
            for (int i = 0; i < minCount; i++) {
                result.add(current + "");
            }
        }
        return result;

    }
}
