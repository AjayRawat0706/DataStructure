package Recursion;

public class Example1 {
    static void fun(int n){
        if (n<=0)
            return;
        System.out.println("hello");
        fun(n-1);
    }

    public static void main(String[] args) {
        fun(4);
    }
}
