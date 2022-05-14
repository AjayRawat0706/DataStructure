package Recursion;

import java.util.Scanner;

public class reverse_an_array_single_pointer {
    static void fun(int [] a, int x, int n){
        int temp;
        if (x>=n/2)
            return;
        temp = a[x];
        a[x]=a[n-x-1];
        a[n-x-1]=temp;
        fun(a,x+1,n);

    }

    public static void main(String[] args) {
        System.out.println("enter the size of an array: ");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int [] array = new int[b];
        System.out.println("enter the values in array");
        for (int i=0;i<b;i++){
            array[i]=sc.nextInt();
        }

        System.out.println("the reversed array is :");
        fun(array,0,b);
        for (int i = 0; i <b; i++){
            System.out.print(array[i]+"  ");
        }

    }
}
