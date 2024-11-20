
// Finding the maximum profit from buying and selling stocks with multiple transactions 
public class stockAndBuyMultipleTransactions {
    static int maximumProfit(int[] prices) {
        if(prices == null || prices.length < 2){
            return 0;
        }

        int res = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) 
                res += prices[i] - prices[i - 1];
        }
        
        return res;
    }

    public static void main(String[] args) {
        int[] prices = { 100, 180, 260, 310, 40, 535, 695 };
        System.out.println(maximumProfit(prices));
    }
}

