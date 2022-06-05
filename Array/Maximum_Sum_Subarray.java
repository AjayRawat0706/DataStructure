/*program to find maximum sum in the sub-array*/
package Array;
public class Maximum_Sum_Subarray {
     static int maxSum(int arr[]){
         int  sum=0;
         int temp=0;
         for (int i=0;i<arr.length;i++){
             temp=Math.max((temp+arr[i]),arr[i]);
             sum=Math.max(sum,temp);
         }
         return sum;
     }

    public static void main(String[] args) {
        int arr[]={-3,8,-2,4,-5,6};
        System.out.println("Maximum sum in aub-array: "+maxSum(arr));
    }
}
/*time complexity of this solution is:  O(n)*/