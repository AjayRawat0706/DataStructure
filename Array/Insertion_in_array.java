/*program to insert an element in a particular position in an array */
package Array;
public class Insertion_in_array {
    static void insert(int arr[],int x,int p, int size, int n){
        if(size==n){
            System.out.println("the array is already full");
            return;
        }
        int idx = p-1;
        for (int i=n-1;i>=idx;i--){
            arr[i+1]=arr[i];
        }
        arr[idx]=x;
        System.out.println("new array after insertion is: ");
        for (int i = 0;i<size;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=40;
        arr[3]=50;

        insert(arr,30,3,5,4);

    }
}
