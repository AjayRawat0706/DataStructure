package Recursion;

import java.util.Scanner;

public class NthFibonacci_no {
    static int fib(int n){
        if (n==0)
            return 0 ;
        if (n==1)
            return 1;
return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        System.out.println("enter a no: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("no present at "+a+"th term is: "+fib(a));

    }
}
