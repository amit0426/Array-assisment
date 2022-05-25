package com.masai;

public class Sum {
	
	public static void columnSum(int [][] arr) {
		
		int index =0;
		
//		int temp[] = new int[arr[index].length];
		
		for(int i=0; i<arr[i].length; i++)
		{
			int sum =0;
			
			for(int j=0; j<arr.length; j++)
			{
				if(arr[j][i]%2==0)
				sum+=arr[j][i];
			}
//			temp[index] = sum;
			System.out.println(sum);
//			index++;
		}
		
//		return temp;
		
	}
	
	
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		Sum text = new Sum();
		columnSum(arr);
		
		
		
		
	}

}
