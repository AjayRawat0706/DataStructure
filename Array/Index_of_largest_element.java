/*program to find the index of the largest element in an array*/
package Array;
public class Index_of_largest_element {
    static void largest(int arr[]){
        int x =0;
        for (int i=1;i<arr.length;i++){
            if (arr[i]>arr[x])
                x=i;
        }
        System.out.println("the index of largest element is: "+x);
    }

    public static void main(String[] args) {
        int arr[]= new int[5];
        arr[0]=12;
        arr[1]=36;
        arr[2]=24;
        arr[3]=78;
        arr[4]=22;
        largest(arr);
    }
}
