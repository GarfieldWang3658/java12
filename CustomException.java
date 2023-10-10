package com.hspedu.customexception_;

public class CustomException {
    public static void main(String[] args) {
        int age = 80;
        if (!(age>=18&&age<=120)){
            //这里可以通过构造器设定信息
            throw new AgeException("年龄需要在 18～120 之间");
        }
        System.out.println("你的年龄范围正确");
    }
}
//自定义异常
//1、一般情况下，自定义异常是继承RuntimeException
//2、即把自定义异常做成运行时异常，好处：可以使用默认处理机制
//3、比较方便。
class AgeException extends RuntimeException {
    public AgeException(String message) {//构造器
        super(message);
    }
}
