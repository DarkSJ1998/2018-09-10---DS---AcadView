/*
Q5. Take N as input and create an array of size N. Take N more inputs and store them in the array.
Write a function to reverse the array and print the reverse array.
*/

import java.util.Scanner;
class q5
{
	private static void reverseArray(int[] arr)
	{
		for(int i=0;i<arr.length/2;i++)
		{
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
	}
	
	private static void display(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
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
		display(arr);
		
		reverseArray(arr);
		
		System.out.println("The reversed array :-");
		display(arr);
		
		System.out.println();
		sc.close();
	}
}