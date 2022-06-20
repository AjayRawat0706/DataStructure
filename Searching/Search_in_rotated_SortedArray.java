/*program to search an element in a rotated sorted array */
package Searching;

public class Search_in_rotated_SortedArray {
    static int search(int arr[],int x){
        if(x==arr[arr.length-1])  //there are three corner cases i.e when x is at index 0, or at index 1 , or x is last element
        {
            return arr.length-1;
        }
        if(x==arr[0]){
            return 0;
        }
        if(arr.length>=2&&x==arr[1]){
            return 1;
        }
        int low =0;
        int  high=arr.length-1;
        while(high>=low){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[low]<arr[mid]) //if arr[low]<arr[mid] it means left side is sorted
            {
                if(x>=arr[low]&&x<arr[mid]) //if this condition satisfy it means element is present between low and mid
                {
                    high=mid-1;
                }
                else
                    low=mid+1;
            }
            else //it means right side of the mid is sorted
            {
                if(x>arr[mid] && x<=arr[high])  //if this condition satisfy it means element is present between mid and high
                {
                    low=mid+1;
                }
                else
                    high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,5,1};
        int x=1;
        System.out.println(search(arr,x));
    }
}
/*time complexity of this solution is O(log n)*/