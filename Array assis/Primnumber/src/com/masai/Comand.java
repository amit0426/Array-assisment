package com.masai;

public class Comand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum1 = 0;
		int k = Integer.parseInt(args[0]);
		if(args.length==1)
		{
			int j = 1;
			int sum = 0;
			
			for(int i=1; i<=k; i++)
			{
				
				j=j*i;
				
			}
			System.out.println(j);
		}
		if(args.length == 2)
		{
			sum1 = Integer.parseInt(args[0])-Integer.parseInt(args[1]);
			System.out.println(sum1);
		}
		else
		{
			System.out.println("Error");
		}
		
		
		
		

	}

}
