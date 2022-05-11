package Recursion;

import java.util.Scanner;

public class String_is_Palindrone {
   static boolean palindrone(String s,int start, int end){
      if (start>=end)
          return true;
      return (s.charAt(start)==s.charAt(end))&&palindrone(s,start+1,end-1);

    }

    public static void main(String[] args) {
        System.out.println("enter a string to check weather it is palindrone or not: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int a =word.length()-1;
        int b = 0;
        if (palindrone(word,b,a)==true)
            System.out.println("it is palindrone");
        else
            System.out.println("it is not palindrone");
   }
}
