/*program to search an element in an array */
package Array;
public class Searching_in_array {
    static int search(int arr[], int x, int size) {
       for (int i = 0; i<=size-1;i++){
           if (arr[i]==x)
              return i+1;
       }
       return -1;
    }

    public static void main(String[] args) {
     int arr[] = new int[5];
     arr[0]=10;
     arr[1]=20;
     arr[2]=30;
     arr[3]=40;
     arr[4]=50;
        System.out.println(search(arr,40,5));

    }
}
