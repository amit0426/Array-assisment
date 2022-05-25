package com.masai;

import java.util.Arrays;

class Main {
		
//		1.first way to assis array (*****************************************
//		public static void main(String[] args) {
//		// create an array
//		int[] marks = {40, 40, 55, 25, 55};
//		// access each array elements
//		System.out.println("Accessing Elements of Array:");
//		System.out.println("First Element: " + marks[0]);
//		System.out.println("Second Element: " + marks[1]);
//		System.out.println("Third Element: " + marks[2]);
//		System.out.println("Fourth Element: " + marks[3]);
//		System.out.println("Fifth Element: " + marks[4]);
//		}
		
//second way to assis a array *********************************************
		
//		public static void main(String[] args) {
//			// create an array
//			int[] marks = {58, 45, 52};
//			// loop through the array
//			// using for loop
//			System.out.println("Using for Loop:");
//			for(int i = 0; i < marks.length; i++) {
//			System.out.println(marks[i]);
//			}
//			}
		
		
//		third loop of using array print all value  using by for each looop **********
		
//		public static void main(String[] args) {
//			// create an array
//			int[] marks = {45, 42, 55};
//			// loop through the array
//			// using for loop
//			System.out.println("Using for-each Loop:");
//			for(int m : marks) {
//				
//				System.out.println(m);
//			}
//
//		}
		
		
//		We problem *********************************************
		
		
//		public static void main(String[] args) {
//			int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
//			int sum = 0;
//			double average;
//			// access all elements using for each loop
//			// add each element in sum
//			for (int number: numbers) {
//			sum += number;
//			}
//			// get the total number of elements
//			int arrayLength = numbers.length;
//			// calculate the average
//			// convert the average from int to double
//			average = (double)sum / arrayLength;
//			System.out.println("Sum = " + sum);
//			System.out.println("Average = " + average);
//			}
		
		
		
		
		
		
		
//		you problem student data ***********************************
		
//		
//		public static void main(String[] args){
//			Student[] students = new Student[3];
//			students[0] = new Student(10,"Ram");
//			students[1] = new Student(20,"Ramesh");
//			students[2] = new Student(40,"Amit");
//			
//			
//			for(Student student:students)
//			{
//			student.printDetails();
//			}
//			}
		
		
		
		
//		print 2d arrray******************************************
		
//		public static void main(String[] args) 
//		{
//			int  a[][]  = 
//				{
//			{1, -2, 3},
//			{-4, -5, 6, 9},
//			{7},
//			
//			
//			};
//			
//			
//			for (int i = 0; i < a.length; i++) 
//			{
//			for(int j = 0; j < a[i].length; j++)
//			{
//			System.out.println(a[i][j]);
//			}
//			}
			
			
//			for(int[] m : a) 
//			{
//				
//				for( int j: m) 
//				{
//					System.out.println(j+" ");
//				}
//			}
//			
			
//			for(int []row : a) {
//				System.out.println(Arrays.toString(row));
//				
//			}
//			
			
			
//			[1, -2, 3]
//					[-4, -5, 6, 9]
//					[7]
//			
			
			
			
			
			
//			System.out.println(Arrays.deepToString(a));
//			[[1, -2, 3], [-4, -5, 6, 9], [7]]
			
			
//			}
		
		
	
//	we problem ***********************************
//		public static void main(String[] args) {
//			if(args.length == 2){
//			int num1 = Integer.parseInt(args[0]);
//			int num2 = Integer.parseInt(args[1]);
//			System.out.println("The Result is "+ (num1+num2));
//			}else
//			System.out.println("Please supply only 2 numbers");
//			}


			

}
