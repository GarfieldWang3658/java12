package com.hspedu.homework_;

public class HomeWork04 {//BCD
    public static void main(String[] args) {
        try {
            showExce();
            System.out.println("A");//确认到异常之后，就不在输出，跳到catch
        } catch (Exception e) {
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
        System.out.println("D");
    }
    public static void showExce()throws Exception{
        throw new Exception();
    }
}
