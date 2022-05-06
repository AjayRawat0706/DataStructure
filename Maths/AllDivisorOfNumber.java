/*to print all divisor of a number in sorted order*/
package Maths;
import java.util.Scanner;
public class AllDivisorOfNumber {
    static void fun(int n) {
        for (int i = 1; i * i <= n; i++)   //this loop will take O(√n) time complexity
        {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        for (int j = (int) Math.sqrt(n); j>=1; j--)  //this loop will also take O(√n) time complexity, so time complexity of whole fun is O(√n)
            if (n%j==0){
                if (j!=n/j)
                System.out.println(n/j);
            }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no to print all its divisor");
        int a = sc.nextInt();
        System.out.println("all the divisor of "+a+" are: ");
        fun(a);
    }

}
