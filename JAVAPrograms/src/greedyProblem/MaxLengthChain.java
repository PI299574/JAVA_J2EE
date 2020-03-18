package greedyProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Given an array of pairs of numbers of size N. In every pair, the first number is always smaller than the second number.
 A pair (c, d) can follow another pair (a, b) if b < c. The chain of pairs can be formed in this fashion. 
 The task is to find the length of the longest chain which can be formed from a given set of pairs.

Examples:

    Input: N = 5, arr={{5, 24}, {39, 60}, {15, 28}, {27, 40}, {50, 90} }
    Output: 3
    The longest chain that can be formed is of length 3, and the chain is {{5, 24}, {27, 40}, {50, 90}}.
 Length of maximum size chain is 3
 
 Idea is to solve the problem using the greedy approach which is the same as Activity Selection Problem.

    Sort all pairs in increasing order of second number of each pair.
    Select first no as the first pair of chain and set a variable s(say) with the second value of the first pair.
    Iterate from the second pair to last pair of the array and if the value of the first element of the current pair 
    is greater then previously selected pair then select the current pair and update the value of maximum length and variable s.
    Return the value of Max length of chain.

 */

class Pair{
	int a ; int b;


	public Pair(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	
}

public class MaxLengthChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair arr[] = new Pair[] {new Pair(5,24), new Pair(15, 25), new Pair (27, 40), new Pair(50, 60)}; 
		
		
		System.out.println("Length of maximum size chain is " +  
                maxChainLength(arr, arr.length)); 
	}

	private static int maxChainLength(Pair[] arr, int length) {
		// TODO Auto-generated method stub
		int result=1;
		List<Pair> list=new ArrayList<Pair>(Arrays.asList(arr));
		Collections.sort(list,(a,b)->a.b-b.b); //sorted based on b(second) value;
		
		int second=list.get(0).b;
		
		for(int i=0;i<list.size();i++){
			if(list.get(i).a>second){
				result++;
				second=list.get(i).b;
			}
		}
		
		
		
		return result;
	}

}
