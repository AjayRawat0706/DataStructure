/*program to find the maximum circular SubArray sum*/
package Array;
public class Maximum_Sum_in_CircularSubArray_OptimizedSolution {
    static int normalMaxSum(int arr[]) //this function return the normal max sum in sub-array.
    {
        int res=0;
        int tempSum=0;
        for(int i=0;i<arr.length;i++){
            tempSum=Math.max(arr[i] , (tempSum+arr[i]));
            res= Math.max(tempSum,res);
        }
        return res;
    }
     static int OverallSum(int arr[]){
        int normalMax = normalMaxSum(arr);
        if (normalMax<0)
        {
            return normalMax;  //if the normal max is less than zero it means every element is -ve. so we will return normal max
        }
        int arraySum=0;
        for(int i=0;i<arr.length;i++)  //here we find the overall sum of array and invert every element i.e +ve to -ve and -ve to +ve
        {
            arraySum= arraySum+arr[i];
            arr[i]=-arr[i]; //inverting the element +ve to -ve and -ve to +ve
        }
        int normalMin = -(normalMaxSum(arr));  //since the array element are inverted the normal max function will give normal min
        int circularMax= arraySum-normalMin; //it will give the circular max.
        return Math.max(circularMax,normalMax);
    }

    public static void main(String[] args) {
        int arr[]={5,3,-2,4};
        System.out.println("Maximum sum in circular SubArray: "+OverallSum(arr));
    }
}

/*time complexity of this solution is: O(n) */
