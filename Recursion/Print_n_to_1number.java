/*ques: Print n to 1 no. using recursion*/

package Recursion;

import java.util.Scanner;

public class Print_n_to_1number {
    static void fun(int n){
        if (n==0)
            return;
        System.out.println(n);
        fun(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int a = sc.nextInt();
        System.out.println("numbers from "+a+" to 1 are: ");
        fun(a);
    }
}
