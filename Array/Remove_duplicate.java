/*program to remove duplicate items from a sorted array */
package Array;
public class Remove_duplicate {
    static void remove_duplicate(int arr[]){
        int res=1;
        for (int i=1;i<arr.length;i++){
            if (arr[i]!=arr[res-1]) {
              arr[res]=arr[i];
              res++;
            }
        }
        System.out.println("array after removing duplicate element:" );
        for (int i =0;i<res;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[]= new int[10];
        arr[0]=12;
        arr[1]=12;
        arr[2]=24;
        arr[3]=24;
        arr[4]=36;
        arr[5]=48;
        arr[6]=48;
        arr[7]=73;
        arr[8]=102;
        arr[9]=220;
        remove_duplicate(arr);
    }
}
