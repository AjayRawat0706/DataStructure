/*program to count the no of maximum consecutive 1 */
package Array;
public class Maximum_cosecutive1 {
    static int Max1(int arr[]){
        int count=0;
        int x=0;
        for (int i=1;i<arr.length;i++){
            if (arr[i]==1){
                x++;

            }
            else{
                x=0;
            }
            count=Math.max(count,x);
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1,1,0,1,};
        System.out.println("the no. of maximum consecutive 1 is: "+Max1(arr));
    }
}
