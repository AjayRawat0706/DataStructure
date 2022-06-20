/*Given a sorted array and a number x, find the pair in array whose sum is  x*/
package Searching;

public class Two_pointer_approach {
    static void checkSum(int arr[],int x){
        int start =0;
        int end=arr.length-1;
        while (end>start){
            int sum=arr[start]+arr[end];
            if(sum==x){
                System.out.println(arr[start]+" and "+ arr[end] );
                return;
            }
            if(sum>x){
                end--;
            }
            else
                start++;
        }
        System.out.println("no pair exist");
    }

    public static void main(String[] args) {
        int arr[]={2,4,8,9,11,12,20,30};
        checkSum(arr,24);
    }
}
