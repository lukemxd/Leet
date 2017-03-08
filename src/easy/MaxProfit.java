package easy;

public class MaxProfit {

	//Multiple transactions
	public static int maxProfit(int[] prices) {
		if(prices == null || prices.length == 0)
			return 0;
        int max_pro = 0;
        for(int i = prices.length - 1; i > 0; i--){
            if(prices[i] - prices[i - 1] > 0){
            	max_pro += prices[i] - prices[i - 1];
            }	
        }
        return max_pro;    
    }
	
	//One transaction
	public static int maxProfit2(int[] prices) {
		int maxProfit = 0, minPrice = Integer.MAX_VALUE;
		for(int i = 0; i < prices.length; ++i){
			maxProfit = Math.max(maxProfit, prices[i] - minPrice);
			minPrice = Math.min(minPrice, prices[i]);
		}
		return maxProfit;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = new int[]{7, 1, 5, 3, 6, 4};
		System.out.print(maxProfit2(prices));
	}

}
