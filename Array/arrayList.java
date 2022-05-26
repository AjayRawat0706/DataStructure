/*
Java ArrayList is a dynamic array and we do not have to specify the size while creating it the size of the ArryList
 automatically increases when we add items.
*/
package Array;
import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println(al);

    }
}
