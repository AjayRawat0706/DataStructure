/*program to print sum of digits in a number.*/
package Recursion;

import java.util.Scanner;

public class sum_of_digits {
    static int fun(int n){
        if(n==0)
            return 0;
return fun(n/10)+n%10;
    }

    public static void main(String[] args) {
        System.out.println("enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("the sum of digits in no "+a+" is: "+ fun(a));
    }
}
