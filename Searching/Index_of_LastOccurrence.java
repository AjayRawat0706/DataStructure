/*program to find the index of last occurrence of the given element */
package Searching;
public class Index_of_LastOccurrence {
    static int lastOccurrence(int arr[],int x){
        int low =0;
        int high=arr.length-1;
        while(high>=low){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                if (mid==arr.length-1 || arr[mid]!=arr[mid+1])
                {
                        return mid;
                }
                else{
                    low=mid+1;
                }
            }
            else if(x>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,1,2,4,5,5,5,5,6,7,8,9};
        System.out.println(lastOccurrence(arr,5));
    }
}

/*time complexity of this solution is: O(log n) . and it take auxiliary space: O(1). */
