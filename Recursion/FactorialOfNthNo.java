package Recursion;

import java.util.Scanner;

public class FactorialOfNthNo {
    static int fun(int n){
        if(n==0)
            return 1;
        return n*fun(n-1);
    }

    public static void main(String[] args) {
        System.out.println("enter a no. to find its factorial: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("factorial of "+a+" is: "+fun(a));
    }
}
