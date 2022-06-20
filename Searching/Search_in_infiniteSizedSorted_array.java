/*program to search element in an infinite sized sorted array */
package Searching;

public class Search_in_infiniteSizedSorted_array {
    static int search(int arr[],int x){
        if(arr[0]==x){
            return 0;
        }
        int i=1;
        while(arr[i]<=x){
            if(arr[i]==x){
                return i;
            }
            i=i*2;
        }
        int low= (i/2)+1;
        int high=i-1;
        while(high>=low){
            int mid=(high+low)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,6,7,9,11,13,18,21,24,25,28,31,33,36,39,41,54,56,58,78,79,82,84,86,89,90,98,99};
        System.out.println(search(arr,18));
    }
}
/*time complexity of this solution is O(log n)*/
