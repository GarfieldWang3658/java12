package com.hspedu.homework_;

import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入");
//        int n1 = scanner.nextInt();
//        int n2 = scanner.nextInt();
        //先把接收到的参数转成整数
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
                //先验证输入的参数个数是否正确，两个参数
            }
                int n1 = Integer.parseInt(args[0]);
                int n2 = Integer.parseInt(args[1]);

                double res = cal(n1, n2);
            System.out.println("结算结果="+res);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("参数格式不正确，需要输入整数");
        } catch (ArithmeticException e) {
            System.out.println("出现了除0的异常。");
        }

    }

    public static double cal(int n1, int n2) {
        return n1 /n2;
    }
}
