/*write a program to find all the subset of the given string*/
package Recursion;

import java.util.Scanner;

public class subset_of_String {
    static void subset(String s, String charr,int i){
        if (i==s.length()){
            System.out.println(charr);
            return;
        }
        subset(s,charr,i+1);
        subset(s,charr+s.charAt(i),i+1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string: ");
        String s = sc.nextLine();
        System.out.println("the subset of string "+s+" are: ");
        subset(s,"",0);
    }
}
