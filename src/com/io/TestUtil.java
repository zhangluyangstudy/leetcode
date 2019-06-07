package com.io;

import org.junit.Test;

import java.io.*;

public class TestUtil {
    @Test
    public void test1(){
        //获取需要复制的文件
        File file=new File("E:\\movie\\1.txt");

        //创建文件流对象
        FileInputStream fis=null;
        FileOutputStream fos=null;

        try {
            fis=new FileInputStream(file);
            fos=new FileOutputStream(new File("E:\\movie\\2.txt"));

            //为读取文件做准备
            byte[] bs=new byte[50];//储存读取的数据
            int count=0;//储存读取的数据量

            //边读取，边复制
            while((count=fis.read(bs))!=-1){
                fos.write(bs, 0, count);
                fos.flush();
            }
            //复制完毕，关流
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }



    @Test
    public void test2(){
        FileOutputStream fos=null;

        try {
            fos=new FileOutputStream(new File("E:\\movie\\3.txt"));
            fos.write("test".getBytes());
            fos.flush();
            //为读取文件做准备

            //复制完毕，关流
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {

            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test3(){
        FileReader fileReader=null;
        FileWriter fileWriter=null;
        File file=new File("E:\\movie\\1.txt");
        try {
            fileReader=new FileReader(file);
            char[] chars=new char[10];
            fileWriter=new FileWriter(new File("E:\\movie\\2.txt"));
            int count=0;
            while (fileReader.read(chars)!=-1){
                fileWriter.write(chars);
            }
            fileWriter.flush();;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {

        }
    }


}
