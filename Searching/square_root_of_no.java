/*program to find the nearest square root of the no. example for 25=5, for 20=4*/
package Searching;

import java.util.Scanner;

public class square_root_of_no {
    static int squareRoot(int n){
        int low=1;
        int high=n;
        int ans=-1;  //we will set ans =-1
        while(high>=low)   //we do binary search
        {
            int mid =(low+high)/2;
            int sq=mid*mid;
            if(sq==n)  //if sq is equal to n it means mid is the square root of n.
            {
                return mid;
            }
            if(sq>n){
                high=mid-1;   //if sq is greater than n we change the high= mid-1.
            }
            else{
               ans=mid;    //if sq is less than n . we set ans =mid. and further check for higher value of mid
               low=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a no to find its square root: ");
        int a = sc.nextInt();
        System.out.println("the square root of "+a+" is: "+squareRoot(a));

    }
}
/*time complexity of this solution is O(log n) */