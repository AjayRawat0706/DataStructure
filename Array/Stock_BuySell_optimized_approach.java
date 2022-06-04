/*program to find max profit which can be made in stock market by buying and selling the stocks assuming you know the future price of the stocks */
package Array;
public class Stock_BuySell_optimized_approach {
    static void max_profit(int arr[]){
        int profit=0;
        for (int i =1;i<arr.length;i++){
            if (arr[i]>arr[i-1]){
                profit= profit+(arr[i]-arr[i-1]); //when value of arr[i] i.e. the price of stock is increasing we are updating our profit and when then price i.e. arr[i] value is going down we are not doing anything
            }
        }
        System.out.println("max profit = "+profit);
    }

    public static void main(String[] args) {
        int price[]=new int[5];
        price[0]=1;
        price[1]=5;
        price[2]=3;
        price[3]=8;
        price[4]=12;
        max_profit(price);
    }
}

/***** this solution take theta(n) time *****/