public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        //1、num1/num2=>10/0
        //2、当执行到num1/num2时，程序就会出现（抛出）异常ArithmeticException
        //3、当抛出该异常后，程序就退出，由于程序奔溃，后续代码将不再执行。
        //4、不应该出现了一个不算致命的问题，就导致整个系统奔溃。
        //5、java设计者提供了异常处理机制来解决该问题。
//        int res = num1/num2;

        //如果程序员认为一段代码可能出现异常，或问题，可以使用try-catch 异常处理机制来解决。
        //从而保证程序的健壮性/容错性
        //将代码块-》选中-》快捷键 ctrl + alt + t -》选择 try-catch
        //如果进行异常处理，即使出现异常，程序可以继续执行。
        try {
            int res = num1/num2;
        } catch (Exception e) {
           // throw new RuntimeException(e);
            System.out.println("出现异常的原因是："+e.getMessage());//呼出异常信息。

        }
        System.out.println("程序继续运行。。。");
    }
}
