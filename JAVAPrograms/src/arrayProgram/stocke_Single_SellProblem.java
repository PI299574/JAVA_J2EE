package arrayProgram;

import java.util.ArrayList;

import javax.swing.CellEditor;

/*int[] prices = {200, 500, 1000, 700, 30, 400, 900, 400, 50};
Output: Maximum Profit: 870, buy date index: 4, sell date index: 6*/
public class stocke_Single_SellProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {200, 500, 1000, 700, 30, 400, 900, 400, 50};
		//Output: Maximum Profit: 870, buy date index: 4, sell date index: 6
		
         //ContigiousSumArrayApproach(prices, prices.length);
         //LocalMinLocalMaxApproch(prices,prices.length);
		ButeForceApprocah(prices,prices.length);
	}

	private static void ButeForceApprocah(int[] prices, int length) {
		// TODO Auto-generated method stub
		
		int max_profit=0;
		int buy_day=0;
		int sell_day=0;
		int profit=0;
		for(int i=0;i<length;i++){
			for(int j=i;j<length;j++){
				profit=prices[j]-prices[i];
				if(profit>max_profit && prices[j]>prices[i]){
					max_profit=profit;
					buy_day=i;
					sell_day=j;
				}
			}
			System.out.println("maxpro***"+max_profit);
			
		}
		System.out.println("*******Brute Force Approcah *********Max Profit *** "+max_profit);
		System.out.println("Brute Force Approcah *******Buying Day***** "+buy_day);
		System.out.println("Brute Force Approcah *******cellDay Day***** "+sell_day);
	}

	private static void LocalMinLocalMaxApproch(int[] prices, int length) {
		// TODO Auto-generated method stub
		class BuySellDay{
			int buy;
			int sell;
		}
		ArrayList<BuySellDay> result=new ArrayList<>();
		int i=0;
		while(i<length-1){
		while((i<length-1) && (prices[i]<=prices[i+1])){
			i++;
		}
		if(i==length-1){
			break;
		}
		BuySellDay e=new BuySellDay();
		e.buy=i;
		
		while((i<length) && (prices[i-1]<=prices[i])){
			i++;
		}
		
		e.sell=i;
		//result.add(e);
		}
		if(result.size()!=0){
			System.out.println(result.size());
		}else{
			System.out.println("There is no day when buying the stock "
                    + "will make profit");
		}
		
	}

	private static void ContigiousSumArrayApproach(int[] prices, int n) {
		// TODO Auto-generated method stub
		System.out.println("***********ContigiousSumArrayApproach**********");
		int priceDiffArray[]=new int[n];
		for(int i=1;i<n;i++){
			priceDiffArray[i]=prices[i]-prices[i-1];
		}
		for(int i=0;i<n;i++){
			System.out.println(priceDiffArray[i]);
			
		}
		int max_profit=Integer.MIN_VALUE;
		int currentProfit=0;
		
		for(int i=0;i<n;i++){
			currentProfit=currentProfit+priceDiffArray[i];
			if(currentProfit>max_profit){
				max_profit=currentProfit;
			}
			if(currentProfit<0){
				currentProfit=0;
			}
		}
		System.out.println("*************Max Profit*************"+max_profit);
	}

}
