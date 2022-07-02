package Searching;

public class AllocateMinimumPages_naiveMethod {
    static int sum(int arr[],int b,int e){
        int s=0;
        for(int i=b;i<=e;i++){
            s=s+arr[i];
        }
        return s;
    }

    static int minPages(int arr[],int n ,int k){

        if(k==1){
            return sum(arr,0,n-1);
        }
        if(n==1){
            return arr[0];
        }
        int res=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            res=Math.min(res,Math.max(minPages(arr,i,k-1),sum(arr,i,n-1)));
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={10,20,4,7,30,24};
        int student=3;
        int n=arr.length;
        System.out.println(minPages(arr,n,student));
    }
}
