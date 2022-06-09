/*program to find the index of the given element through binary search using recursion*/
package Searching;
public class BinarySearch_recursive {
    static int search(int arr[],int x,int high,int low){
        if(low>high)  //if the low become greater than zero means element is not present. we will return -1
        {
            return -1;
        }
        int mid=(low +high)/2;
        if(arr[mid]==x){
            return mid;
        }
        else if(x>arr[mid]){
            return search(arr,x,high,mid+1);
        }
        else {
            return search(arr, x, mid - 1, low);
        }

    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        System.out.println(search(arr,30,arr.length-1,0));
    }
}
