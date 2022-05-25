package com.masai;

import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		
		Main ob = new Main();
		int[] arr = {10,12,5,50,11,14,15};
		int[] result = ob.findAndReturnPrimeNumber(arr);
		
		
		for(int i=0; i<result.length; i++)
		{
			if(result[0] == 0) 
			{
				System.out.println("Prime number not found ");
				break;
			}
			else if(result[i] !=0) 
			{
				System.out.println(result[i]);
				
			}
			else
			{
				break;
			}
			
		}
	
		
	}
	
	
	public   int[] findAndReturnPrimeNumber(int[] inputArray)
	{
		int[] ans = new int[7];
		
		int count = 0;
		
		for(int i=0; i<inputArray.length; i++) {
			
			int c = 0;
			
			for(int j=1; j<=inputArray[i]; j++)
			{
				if(inputArray[i]%j==0) {
					c++;
				}
			}
			
			if(c==2)
			{
				ans[count++] = inputArray[i];
			}
		}
		
		
		return ans;
		

		
	}
	

		

}
