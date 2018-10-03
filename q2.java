/*
Q2. Take as input N, the size of array. Take N more inputs and store that in an array.
Write a function that bubble sorts the array. Print the elements of sorted array.
*/

import java.util.Scanner;
class q2
{
	private static void sort(int[] arr)
	{
		System.out.println("> Bubble Sorting the array...");
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("> Done!");
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
		
		System.out.println("\nThe entered array :-");
		for(int i=0;i<N;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		
		sort(arr);
		
		System.out.println("\nThe entered array :-");
		for(int i=0;i<N;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		
		System.out.println();
		sc.close();
	}
}