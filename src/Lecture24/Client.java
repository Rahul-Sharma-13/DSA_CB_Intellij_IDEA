package Lecture24;

public class Client {
    public static void main(String[] args) {
//        case -1
//        P obj = new P();
//        System.out.println(obj.d);
//        System.out.println(obj.d1);
//        obj.fun();
//        obj.fun1();
//        case - 2
        P obj = new C();
        System.out.println(obj.d);
        System.out.println(obj.d1);
        System.out.println(((C)obj).d2);
        System.out.println(((C)obj).d);
        obj.fun();//P
        obj.fun1();//P
        ((C) obj).fun2();//C
    }
}
