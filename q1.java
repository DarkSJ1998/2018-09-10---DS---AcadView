/*
Q1. Take N as input and create an array of size N. Take N more inputs and store them in the array.
Write a function to calculate the maximum value in the array.
*/

import java.util.Scanner;
class q1
{
	private static int findMax(int[] arr)
	{
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max < arr[i])
				max = arr[i];
		}
		return max;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int N = sc.nextInt();
		int arr[] = new int[N];
		System.out.println("Start entering elements :-");
		for(int i=0;i<N;i++)
			arr[i] = sc.nextInt();
		
		System.out.println("The entered array :-");
		for(int i=0;i<N;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		
		System.out.println("The max element : " + findMax(arr));
		
		System.out.println();
		sc.close();
	}
}