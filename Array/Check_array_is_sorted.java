/*program to check if array is sorted or not*/
package Array;
public class Check_array_is_sorted {
    static boolean sorted(int arr[]){
        int a=0;
        for (int i =1; i<arr.length;i++){
            if (arr[a]>arr[i]){

                return false;
            }
            else {
                a=i;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        int arr[]=new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        boolean a= sorted(arr);
        if(a==true){
            System.out.println("array is sorted ");
        }
        else
            System.out.println("array is unsorted");
    }
}
