public class Buysellstocks {
    public static  int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            minprice=Math.min(minprice,prices[i]);
            maxprofit=Math.max(maxprofit,prices[i]-minprice);
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
