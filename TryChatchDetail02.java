public class TryChatchDetail02 {
    public static void main(String[] args) {
        //如果try代码块有可能有多个异常
        //可以使用多个catch分别捕获不同的异常，相应处理。
        //要求子类异常写前面，父类异常写后面。

        try {
            Person person = new Person();
            System.out.println(person.getName());
            int n1 =10;
            int n2 = 0;
            int res = n1/n2;
        } catch (Exception e) {
            System.out.println("空指针异常"+e.getMessage());
            throw new RuntimeException(e);
        }


    }
}
class Person{
    private String name = "jack";

    public String getName() {
        return name;
    }
}
