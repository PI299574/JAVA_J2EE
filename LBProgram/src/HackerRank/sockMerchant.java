package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sockMerchant {
	static int sockMerchant(int n, int[] arr) {
        // Complete this function
        
        HashMap<Integer,Integer> hmap= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hmap.containsKey(arr[i])){
                hmap.put(arr[i],hmap.get(arr[i])+1);
            }
            else{
                hmap.put(arr[i],1);
            }
        }
        int count=0;
        for(Map.Entry<Integer,Integer> m : hmap.entrySet()){
           // System.out.println(m.getKey() +" "+m.getValue());
            if( m.getValue()!=1){
                count+= m.getValue()/2;
            }
          
        }
          return count;  
        }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}

