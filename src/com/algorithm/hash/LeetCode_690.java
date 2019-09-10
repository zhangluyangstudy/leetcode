package com.algorithm.hash;

import org.junit.Test;

import java.util.*;

/**
 * @author zhangluyang
 * @2019/9/10 10:36
 */
public class LeetCode_690 {
    class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;


    };
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer,Employee> map=new HashMap<>();
        employees.forEach(r->{
            map.put(r.id,r);
        });
        Employee employee = map.get(id);
        Set<Integer> set=new HashSet<>();
        getAll(employee,set,map);
        int result=0;
        for(Integer i:set){
            Employee employee1 = map.get(i);
            result+=employee1.importance;

        }
        return result;
    }
    private void getAll(Employee employee, Set<Integer> set,Map<Integer,Employee> map) {
        set.add(employee.id);
        List<Integer> subordinates = employee.subordinates;
        if(employee.subordinates.size()<=0){
            return;
        }
        subordinates.forEach(r->{
            getAll(map.get(r),set,map);
        });
    }


    @Test
    public void test1(){
        Employee e1=new Employee();
        e1.id=1;
        e1.importance=5;
        List<Integer> l1=new ArrayList<>();
        l1.add(2);
        l1.add(3);
        e1.subordinates=l1;

        Employee e2=new Employee();
        e2.id=2;
        e2.importance=3;
        List<Integer> l2=new ArrayList<>();
//        l2.add(2);
//        l2.add(3);
        e2.subordinates=l2;

        Employee e3=new Employee();
        e3.id=3;
        e3.importance=3;
        List<Integer> l3=new ArrayList<>();
//        l3.add(2);
//        l3.add(3);
        e3.subordinates=l3;

        List<Employee> list=new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);

        getImportance(list,1);


    }
}
