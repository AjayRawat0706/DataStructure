/*program to find maximum difference between element in an array*/
package Array;

public class Maximum_difference {
    static void max_diff(int arr[]){
        int minValue=arr[0];
        int max_diff=arr[1]-arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]<minValue)
                minValue=arr[i];
            int diff=arr[i]-minValue;
            if (diff>max_diff){
                max_diff=diff;
            }
        }
        System.out.println(max_diff);
    }

    public static void main(String[] args) {
        int arr[]= new int[7];
        arr[0]=2;
        arr[1]=3;
        arr[2]=10;
        arr[3]=6;
        arr[4]=4;
        arr[5]=12;
        arr[6]=1;
        max_diff(arr);
    }
}
