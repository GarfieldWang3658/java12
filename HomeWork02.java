package com.hspedu.homework_;

public class HomeWork02 {
    public static void main(String[] args) {
        //args.length = 0
        //这里优先发生的异常是 ArrayIndexOutOfBoundsException

        if (args[4].equals("john")){//可能发生空指针异常
            System.out.println("AA");
        }else {
            System.out.println("BB");
    }
        Object o = args[2];//String -》Object 向上转型
        Integer i =(Integer) o;//错误，一定会发生类型转换异常，ClassCastExeption
}
}
