/*program to rotate all element in array left by one */
package Array;
public class Left_rotate_by_one {
    static void left_rotate(int arr[]) {
        int n = arr.length;
        int temp = arr[0];
        for (int i = 0; i < n-1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n-1]=temp;
    }
    public static void main(String[] args) {
        int arr[]= new int[5];
        arr[0]=12;
        arr[1]=36;
        arr[2]=24;
        arr[3]=78;
        arr[4]=22;
        left_rotate(arr);
        System.out.println("array after rotating each element left by one: ");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
