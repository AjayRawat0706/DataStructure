/*ques: Print 1 to n no. using recursion*/
package Recursion;

import java.util.Scanner;

public class Print_1to_n_numbers {
    static void fun(int n){
        if (n==0)
            return;
        fun(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int a = sc.nextInt();
        System.out.println("numbers from 1 to "+a+" are: ");
        fun(a);
    }
}
