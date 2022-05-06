/*the sieve of Eratosthenes is an algorithm for finding all prime numbers up to any given limit.*/
package Maths;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {
    static void fun(int n){
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime,true);
        for (int i=2;i*i<=n;i++){
            if(isPrime[i]){
                for (int j = 2*i;j<=n;j=j+i)
                    isPrime[j]=false;
            }
        }
        for(int i=2;i<=n;i++){
            if (isPrime[i])
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        System.out.println("enter a no. ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("all the prime no. till "+a+" are: ");
        fun(a);
    }
}
