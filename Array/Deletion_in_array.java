/*write a program to delete a particular element in an array*/
package Array;
public class Deletion_in_array {
    static int deletion(int arr[],int x,int size){
        int idx = 0;
        for (int i=0;i<=size-1;i++){
            if(arr[i]==x) {
                idx = i;
                break;
            }
        }
        for (int i=idx;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        return size-1;
    }

    public static void main(String[] args) {
        int n=5;
        int arr[]= new int[n];
        arr[0]=10;
        arr[1]=70;
        arr[2]=60;
        arr[3]=30;
        arr[4]=40;
       n= deletion(arr,70,5);
        System.out.println("new array after deletion is: ");
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
