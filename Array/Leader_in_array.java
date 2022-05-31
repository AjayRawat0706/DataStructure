/*program to print leader in an array*/
package Array;
public class Leader_in_array {
    static void print_leader(int arr[]){
        int current_leader = arr[arr.length-1];
        System.out.println(current_leader);
        for (int i=arr.length-2;i>=0;i--){
            if(arr[i]>current_leader){
                current_leader=arr[i];
                System.out.println(current_leader);
            }
        }
    }

    public static void main(String[] args) {
        int arr[]= new int[5];
        arr[0]=92;
        arr[1]=36;
        arr[2]=44;
        arr[3]=78;
        arr[4]=22;
        print_leader(arr);
    }
}
/*time complexity = θ(n)*/