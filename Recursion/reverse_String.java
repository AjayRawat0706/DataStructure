/*program to reverse an string using recursion*/
package Recursion;

import java.util.Scanner;


public class reverse_String {

    static String reverse(String s){
        if(s.isEmpty()){
            return s;
        }
        else{
            return reverse(s.substring(1))+s.charAt(0);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.print(reverse(word));
    }
}
