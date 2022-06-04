/* write a program to find the maximum unit of water which can be stored in the bars */
package Array;
public class Trapping_rain_water_optimized_approach {
    static int water_collected(int arr[]){
        int n= arr.length;
        int res = 0;
        int leftMax[]=new int[n];   //here we make two arrays that will store left max and right max for all values of bars
        int righttMax[]=new int[n];

        leftMax[0]=arr[0];
        for (int i=1;i<n;i++){
            leftMax[i]=Math.max(arr[i],leftMax[i-1]);
        }

        righttMax[n-1]=arr[n-1];
        for (int i=n-2;i>=0;i--){
            righttMax[i]=Math.max(arr[i],righttMax[i+1]);
        }
        for(int i =1;i<n-1;i++){
            res= res+(Math.min(leftMax[i],righttMax[i])-arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={3,0,1,2,5};
        System.out.println("maximum unit of water which can be stored: "+water_collected(arr));
    }
}

/**** time complexity of this solution is θ(n) and this solution take θ(n) Auxiliary space. ****/
