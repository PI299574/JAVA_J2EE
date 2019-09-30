package LearnBayStack;

import java.util.Scanner;

public class LargestRecatngleHR {

	static long largestRectangle(int[] height) {
		
        // Complete this function
		
		if(height==null||height.length==0){
			return 0;
		}
		java.util.Stack<Integer> stack = new java.util.Stack<Integer>();
		long max=0;
		Integer i=0;
		long area=0;
		
		while(i<height.length){
			if(stack.isEmpty()||height[i]>height[stack.peek()]){
			stack.push(i);
			i++;}
			else{
				
					int top=stack.pop();
					if(stack.isEmpty()){
						area=height[top]*i;
					}else{
						//System.out.println("area"+area);
					area=height[top]*(i-stack.peek()-1);
				}
					//max=area;
					if(max<area){
						max=area;
					}
				
			}
		}
		
		//System.out.println("iii"+i);
		
		while(!stack.isEmpty()){
			int top=stack.pop();
			if(stack.isEmpty()){
				area=height[top]*i;
			}else{
				//System.out.println("area"+area);
			area=height[top]*(i-stack.peek()-1);
		}
			//max=area;
			if(max<area){
				max=area;
			}
		}
		
		return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] h = new int[n];
        for(int h_i = 0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        long result = largestRectangle(h);
        System.out.println(result);
        in.close();
    }

}
