package learnBay_DynemicProgramming;

import java.util.ArrayList;

/*int[] prices = {200, 500, 1000, 700, 30, 400, 900, 400, 50};
Output: Maximum Profit: 870, buy date index: 4, sell date index: 6*/

public class StockSingle_sellProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {200, 500, 1000, 700, 30, 400, 900, 400, 50};
		//Output: Maximum Profit: 870, buy date index: 4, sell date index: 6
		
		BruteForce_MaxProfit(prices);
		
		maxContigiousSum_approach(prices);
		
		LocalMinAndLocalMaximaApproach(prices);
	}

	private static void LocalMinAndLocalMaximaApproach(int[] prices) {
		// TODO Auto-generated method stub
		/*   min  200   30   (Is 200 <500 , and cont..) (Is 700<30 or 30<400...)
		 *   max  1000  900  (Is 200>500 or 500 >100 or 1000>700...  )(Is 400>900 or 900 >400 ....)
				1. Find the local minima and store it as starting index. If not exists, return.
				2. Find the local maxima. and store it as ending index. If we reach the end, set the end as ending index.
				3. Update the solution (Increment count of buy sell pairs)
				4. Repeat the above steps if end is not reached.*/
		
		class BuySellDay{
			int buy, sell;
		}
		ArrayList<BuySellDay> result= new ArrayList<>();
		BuySellDay buysell=new BuySellDay();
		int i=0;
		while(i<prices.length-1){
			
			//// Find Local Minima. Note that the limit is (n-2) as we are 
            // comparing present element to the next element.
			while(i<prices.length-1 && prices[i]>=prices[i+1]){
				i++;
			}
			if(i==prices.length-1) break;
			buysell.buy=i++;
			
			// Find Local Maxima.  Note that the limit is (n-1) as we are 
            // comparing to previous element
			while(i<prices.length-1 && prices[i]<=prices[i+1]){
				i++;
			}
		}
		
	}

	private static void maxContigiousSum_approach(int[] prices) {
		// TODO Auto-generated method stub
		
		int pricesDiffArray[] = new int[prices.length];
		for(int i=1;i<prices.length;i++){
			pricesDiffArray[i]=prices[i]-prices[i-1];
		}
		for(int i=0;i<pricesDiffArray.length;i++){
			System.out.println(pricesDiffArray[i]);
		}
		
		int curr_profit=0;
		int max_profit=Integer.MIN_VALUE;
		
		for(int i=0;i<pricesDiffArray.length;i++){
			curr_profit=curr_profit+pricesDiffArray[i];
			if(curr_profit>max_profit){
				max_profit=curr_profit;
			}
			if(curr_profit<0){
				curr_profit=0;
			}
		}
		System.out.println("*************Max Profit*************"+max_profit);
	}

	private static void BruteForce_MaxProfit(int[] prices) {
		// TODO Auto-generated method stub
		
		/*Use two nested loops. Taking one element at a time,
		consider outer loop value as buying  date index and compare
		it with the every element in the inner loop which will be considered 
		as selling index date. 
		Keep track of the maximum. This will be the maximum profit.*/
		
		int max_profit=0;
		int profit=0;
		int buyDay=0;
		int cellDay=0;
		for(int i=0;i<prices.length;i++){
			for(int j=i;j<prices.length;j++){
				profit=prices[j]-prices[i];
				if(prices[i]<prices[j] && profit > max_profit ){
					max_profit=profit;
					buyDay=i;
					cellDay=j;
				}
			}
		}
		
		System.out.println("*******Brute Force Approcah *********Max Profit *** "+max_profit);
		System.out.println("Brute Force Approcah *******Buying Day***** "+buyDay);
		System.out.println("Brute Force Approcah *******cellDay Day***** "+cellDay);
	}

}
