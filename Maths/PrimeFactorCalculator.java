package Maths;

import java.util.Scanner;

public class PrimeFactorCalculator {
    static void fun(int n){
        for (int i = 2; i<=n;i++) {

            if (n % i == 0) {
                int temp =0;
                for (int j = 2; j < i; j++){
                    if (i%j==0){
                        temp=temp+1;
                    }
                }
                if (i==2||temp==0)
                {
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no to check its prime factors");
        int a  = sc.nextInt();
        fun(a);
    }
}
