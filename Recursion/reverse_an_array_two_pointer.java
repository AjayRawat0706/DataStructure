package Recursion;

import java.util.Scanner;

public class reverse_an_array_two_pointer {
    static void fun(int[] a, int x, int y) {
        int temp;
        if (x >= y)
            return;
        temp = a[x];
        a[x] = a[y];
        a[y] = temp;
        fun(a, x + 1, y - 1);

    }

    public static void main(String[] args) {
        System.out.println("enter the size of an array: ");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int[] array = new int[b];
        System.out.println("enter the values in array");
        for (int i = 0; i < b; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("the reversed array is :");
        fun(array, 0, b - 1);
        for (int i = 0; i < b; i++) {
            System.out.print(array[i]+"  ");
        }
    }
}
