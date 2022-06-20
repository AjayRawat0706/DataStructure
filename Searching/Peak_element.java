/*program to find the index of peak element in an array. an element is peak if it is greater than its neighbouring element.*/
package Searching;

public class Peak_element {
    static int peakElement(int arr[]){
        int n =arr.length;
        int low =0;
        int high=n-1;
        while(high>=low){
            int mid =(low+high)/2;
            if((mid==0 || arr[mid]>arr[mid-1]) && (mid==n-1 || arr[mid]>arr[mid+1])) //if this condition satisfy it means element at index mid is peak element
            {
                return mid;
            }
            if(mid>0 && arr[mid-1]>arr[mid]){
                high=mid-1;
            }
            else{
                low =mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,1,3,5,6,4};
        System.out.println(peakElement(arr));
    }
}
// time complexity of this solution is O(log n)
