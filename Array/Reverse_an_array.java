/*program to reverse an array*/
package Array;
public class Reverse_an_array {
    static void reverse(int arr[]){
        int a=0;
        int b=arr.length-1;
        for (int i=0;i<(arr.length/2);i++){
            int temp;
            temp=arr[i];
            arr[i]=arr[b];
            arr[b]=temp;
            b=b-1;

        }
    }

    public static void main(String[] args) {
        int arr[]=new int[6];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        arr[5]=60;

        reverse(arr);
        System.out.println("array after reversing: ");
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
/******************************************************************************************************/
/*
time complexity of this solution is = Θ(n)
space complexity of this solution is = Θ(1)
*/


