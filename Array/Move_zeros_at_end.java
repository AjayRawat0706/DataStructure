/*program to move all the zeros at the end in an array */
package Array;
public class Move_zeros_at_end {
    static void Zero_end(int arr[]){
        int count=0;
        for (int i = 0;i<arr.length;i++){
            if (arr[i]!=0){
                int temp=arr[count];
                arr[count]=arr[i];
                arr[i]=temp;
                count++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]= new int[10];
        arr[0]=12;
        arr[1]=0;
        arr[2]=24;
        arr[3]=0;
        arr[4]=0;
        arr[5]=24;
        arr[6]=0;
        arr[7]=73;
        arr[8]=0;
        arr[9]=38;
        Zero_end(arr);
        System.out.println("array after moving all the zeros to the end: ");
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
