/*program to print the frequency(no of time element occur) of element in sorted array */
package Array;
public class Frequencies_in_sorted_array {
    static void frequency(int arr[]){

        int freq =1;
        for(int i =1;i<arr.length;i++){
            if (arr[i]==arr[i-1]){
                freq++;
            }
            else{
                System.out.println(arr[i-1]+" = "+freq);
                freq=1;
            }
        }

        System.out.println(arr[arr.length-1]+" = "+freq); //this is for the last element


    }

    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0]=10;
        arr[1]=10;
        arr[2]=10;
        arr[3]=40;
        arr[4]=40;
        arr[5]=50;
        arr[6]=60;
        arr[7]=60;
        arr[8]=90;
        arr[9]=90;
        frequency(arr);
    }
}
