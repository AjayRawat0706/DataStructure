/*TWO POINTER APPROACH PROBLEM:
   Find a triplet that sum to a given value:Given an array and a value, find if there is a triplet in array whose sum is equal to the given value.*/
package Searching;
public class FindTriplet_thatSums_x {
    static void SearchTriplet(int arr[],int x){
        for(int i=0;i<arr.length-2;i++){
            int start=i+1;
            int end=arr.length-1;
            while(end>start){
                int sum=arr[i]+arr[start]+arr[end];
                if(sum==x){
                    System.out.println("the triplet whose sum is "+x+" : "+arr[i]+","+arr[start]+" and "+arr[end]);
                    return;
                }
                if(sum>x){
                    end--;
                }
                else
                    start++;
            }
        }
        System.out.println("there is no triplet whose sum is: "+x);
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,8,9,20,40};
        int x=32;
        SearchTriplet(arr,x);
    }
}
