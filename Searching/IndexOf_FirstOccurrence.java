/*program to find the index of first occurrence of the given element */

package Searching;
public class IndexOf_FirstOccurrence {
    static int firstOccurrence(int arr[],int x){
        if(x>arr[arr.length-1]) //element is not present in the array if the element is greater than the last element in the array. so we will return -1 in this case
        {
            return -1;
        }
        int low = 0;
        int high=arr.length-1;
        while(high>=low){
            int mid =(high+low)/2;
            if(x==arr[mid]){
                if(mid==0 || arr[mid]!=arr[mid-1]) //if mid =0 or if element at index mid-1 is not equal to element at mid  then element at mid is the first occurrence. we will return mid.
                {
                    return mid;
                }
                else {
                    high = mid - 1;
                }
            }
            else if (x<arr[mid]){
                high=mid-1;
            }
            else {
               low=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={2,4,5,5,5,5,6,7,8,9};
        System.out.println(firstOccurrence(arr,5));
    }
}

/*time complexity of this solution is: O(log n). */
