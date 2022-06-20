/*program to find no of time 1 appear in the sorted binary array.  Binary array are the array which contain only 0 and 1*/
package Searching;

public class Count1s_inSortedBinaryArray {
    static int CountOnes(int arr[]){
            int low =0;
            int high=arr.length-1;
            while(high>=low)    //we will find the first occurrence of 1
            {
                int mid= (high+low)/2;
                if(arr[mid]==1){
                    if(mid==0 || arr[mid]!=arr[mid-1]){
                        int count= arr.length-mid;   //since it is a binary array so there will not be any value greater than one , so no of 1s= length of array - first occurrence index of 1.
                        return count;
                    }
                    else{
                        high=mid-1;
                    }
                }
                else
                {
                    low=mid+1;
                }
                //since there is no element greater than one in binary array so, we not go for condition when element is greater than mid.

            }
            return 0;
    }

    public static void main(String[] args) {
        int BinaryArr[]={0,0,0,0,1,1,1,1,1,1,1,1};
        System.out.println("no of 1s = "+CountOnes(BinaryArr));
    }
}
