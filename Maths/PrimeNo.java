package Maths;

import java.util.Scanner;

public class PrimeNo {
    static void fun(int n){
        int temp =0;
        for (int i= 2; i<n;i++){
            if (n%i==0){
                temp = temp+1;
            }
        }
        if (n==2||temp==0)
        {
            System.out.println("it is prime no");
        }
        else
            System.out.println("it is not a prime no");
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("enter a no to check is it prime or not");
      int a  = sc.nextInt();
      fun(a);
    }
}
