/*program to find majority element in an array of size n. An element is majority element if it appears more thn n/2 times */
package Searching;

public class MajorityElement {
    //we will use Moore voting algorithm to solve this problem. this algorithm works in two phases.
    static int majorityElement(int arr[]){
        //Phase 1: in this we find a candidate which is majority element
        int res=-1;
        int count=0;
        for (int i =0;i<arr.length;i++){
            if (count==0){
                res=arr[i];
                count =1;
            }
            else if(res==arr[i]){
                count++;
            }
            else{
                count--;
            }

        }
        // Phase 2: Check if candidate is actually a majority element
        count =0;
        for(int j=0;j<arr.length;j++){
            if(res==arr[j]){
                count++;
            }
            if(count>arr.length/2){
                return res;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={8,8,6,6,6,4,6};
        System.out.println(majorityElement(arr));
    }
}

/*time complexity of this solution is O(n)*/