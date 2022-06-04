/* write a program to find the maximum unit of water which can be stored in the bars */
package Array;
public class Trapping_rain_water_native_approach {
    static void water(int arr[]){
        int res= 0;
        for(int i =1;i<arr.length-1;i++)//this loop will run for every bar between first and the end bar
        {
            int left_max=arr[i];
            for (int j=0;j<i;j++){
              left_max=  Math.max(left_max,arr[j]); //here we find left side max of current bar
            }
            int right_max= arr[i];
            for (int j=i+1;j<arr.length;j++){
                right_max=Math.max(right_max,arr[j]); //here we find right side max of current bar
            }

            res = res+ (Math.min(left_max,right_max)-arr[i]);    //amount of water which can be stored in current bar is = min(left_max,right_max)-arr[i].   then we update the result value
        }
        System.out.println("amount of water can be stored is : "+ res );
    }

    public static void main(String[] args) {
       int arr[]={3,0,1,2,5};
       water(arr);
    }
}
/**************** this solution take time complexity O(n^2) ****************/
