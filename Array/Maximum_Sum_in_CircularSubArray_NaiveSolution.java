/*program to find the maximum circular SubArray sum*/
package Array;
public class Maximum_Sum_in_CircularSubArray_NaiveSolution {
    static int max_sum(int arr[]){
        int res=0;
        for(int i =0;i<arr.length;i++){
            int sum= arr[i];
            int max=arr[i];
            for (int j=1;j<arr.length;j++){
                int index=(i+j)%arr.length;
                sum=sum+arr[index];
                max=Math.max(sum,max);
            }
            res=Math.max(res,max);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={5,3,-2,4};
        System.out.println("Maximum sum in circular SubArray: "+max_sum(arr));
    }
}
/*Time complexity of this solution is: O(n^2)*/