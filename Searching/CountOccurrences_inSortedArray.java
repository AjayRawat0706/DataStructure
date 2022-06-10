/*program to count the no of time the given element appear in a sorted array*/
package Searching;
public class CountOccurrences_inSortedArray {
    static int firstOccurrence(int arr[],int x)  //function to find firstOccurrence
    {
        int low=0;
        int high=arr.length-1;
        while(high>=low){
            int mid =(high+low)/2;
            if(x==arr[mid]){
                if(mid==0 || arr[mid]!=arr[mid-1]){
                    return mid;
                }
                else{
                    high=mid-1;
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

    static int LastOccurrence(int arr[],int x)  //function to find last-Occurrence
    {
        int low=0;
        int high=arr.length-1;
        while(high>=low){
            int mid =(high+low)/2;
            if(x==arr[mid]){
                if(mid==arr.length-1 || arr[mid]!=arr[mid+1]){
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

    static int noOfCount(int arr[],int x) //function to find no of times element appear
    {
        int first= firstOccurrence(arr,x);
        if (first==-1){
            return 0;
        }
        int count= (LastOccurrence(arr,x)-first+1);   //no of time = last-first+1
        return count;
    }

    public static void main(String[] args) {
        int arr[]={10,15,20,20,20,20,30,30,30,60};
        System.out.println("no of 20 occur = "+noOfCount(arr,20));
    }
}
/*time complexity of this solution is: O(log n)*/