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

        System.out.println(arr[arr.length-1]+" = "+freq);//this is for the last element


    }

    public static void main(String[] args) {
        int arr[] = {10,10,10,20,20,30,40,40,50};

        frequency(arr);
    }
}
/*time complexity of this solution is= theta(n)*/