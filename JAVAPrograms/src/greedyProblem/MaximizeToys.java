package greedyProblem;
/*
Given an array consisting of cost of toys. Given an integer K depicting the amount of money available to purchase toys. 
Write a program to find the maximum number of toys one can buy with the amount K.

Note: One can buy only 1 quantity of a particular toy.

Examples :


Input:  N = 10, K =  50
        cost = { 1, 12, 5, 111, 200, 1000, 10, 9, 12, 15 }
Output: 6
Explanation: Toys with amount 1, 5, 9, 10, 12, and 12 
can be purchased resulting in a total amount of 49. Hence,
maximum number of toys is 6.

Input: N = 7, K = 50
       cost = { 1, 12, 5, 111, 200, 1000, 10 }
Output: 4


The idea to solve this problem is to first sort the cost array in ascending order.
 This will arrange the toys in increasing order of the cost. Now iterate over the 
 cost array and keep calculating the sum of costs until the sum is less than or equal to K.
 Finally return the number of toys used to calculate the sum which is just less than or equals to K.
 
 o(N*LOGN)
 */
public class MaximizeToys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
