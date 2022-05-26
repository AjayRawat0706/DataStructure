package Array;

public class Index_of_second_largest_element {
    static void secondlargest(int arr[]){
        int a = 0;
        int b= 1;
        if (arr[a]<arr[b]) {
            a = 1;
            b=0;
        }
        for(int i=1;i<arr.length;i++){
            if (arr[i]>arr[a]){
                b=a;
                a=i;
            }
            else if (arr[i]!=arr[a]){
                if(arr[i]>arr[b])
                    b=i;
            }
        }
        if (arr[a]==arr[b]){
            System.out.println("there is no second largest element in the array");
            return;
        }

        System.out.println("index of second largest element is: " + b);
    }

    public static void main(String[] args) {
        int arr[]= new int[10];
        arr[0]=12;
        arr[1]=36;
        arr[2]=240;
        arr[3]=78;
        arr[4]=22;
        arr[5]=240;
        arr[6]=29;
        arr[7]=88;
        arr[8]=102;
        arr[9]=38;
        secondlargest(arr);
    }
}
