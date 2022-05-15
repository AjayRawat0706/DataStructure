/*
program to find maximum no of pieces a rope can be cut
*/
package Recursion;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class RopeCutting {
    static int  fun(int n, int a, int b, int c ){

        if(n<0)
            return -1;
        if (n==0)
            return 0 ;
        int result = Math.max(fun(n-a, a, b, c),
                Math.max(fun(n-b, a, b, c),
                        fun(n-c, a, b, c)));
        if(result==-1)
            return -1;
        return result+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the rope: ");
        int n = sc.nextInt();
        System.out.println("enter the length of pieces in which the rope is to be cut: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c = sc.nextInt();
        System.out.println("maximum no of pieces in which the rope can be cut is: ");
        System.out.print(fun(n,a,b,c));
    }
}
