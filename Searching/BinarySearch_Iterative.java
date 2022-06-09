/*program to find the index of the given element in a sorted array using binary search*/
package Searching;

public class BinarySearch_Iterative {
    static int bSearch(int arr[] ,int x){
        if(x>arr[arr.length-1]) //if the given element is grater than the last element in the array we will return -1.
        {
            return -1;
        }
        int low=0;
        int high=arr.length;
        while(high>=low){
            int mid= (low+high)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]>x){
                high=mid-1;
            }
            else{
                low= mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        System.out.println(bSearch(arr,40));
    }
}
