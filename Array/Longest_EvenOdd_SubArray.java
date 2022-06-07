/*program to find the length of longest even-odd  contiguous sub-array  */
package Array;
public class Longest_EvenOdd_SubArray {
static int LongestEvenOdd(int arr[]){
    int max=0;
    int temp=1;
    for (int i=1;i<arr.length;i++){
        if ((arr[i]%2==0&&arr[i-1]%2!=0) || (arr[i]%2!=0&&arr[i-1]%2==0)) //here it will check if current element is odd then previous element is even or not. or if current element is even then previous element is odd or not
        {
            temp++;  //if the above condition is satisfied then it will increase the temp by 1.
        }
        else{
            temp=1;  //if the condition is not satisfied them it will make the temp = 1.
        }
        max=Math.max(max,temp);
    }
    return max;
}

    public static void main(String[] args) {
        int arr[]={7,10,2,5,8,11,16,22,21,19};
        System.out.println("length of longest even-odd SubArray = "+LongestEvenOdd(arr));
    }
}
/*time complexity of this solution is: O(n)*/
