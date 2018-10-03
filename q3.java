/*
Q3. Take as input N, the size of array. Take N more inputs and store that in an array.
Take N more inputs and store that in another array.
Write a function which returns the intersection of two arrays in an ArrayList of integers.
Print the ArrayList returned. 
E.g. for the following arrays 1, 2, 3, 1, 2, 4, 1 and 2, 1, 3, 1, 5, 2, 2
the output will be [1, 1, 2, 2, 3]
*/

import java.util.*;
class q3
{
	private static ArrayList <Integer> checkCommon(int[] arr1, int[] arr2)
	{
		/*
		ArrayList <Integer> al = new ArrayList<>();
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i] == arr2[i])
				al.add(arr1[i]);
		}
		return al;
		*/
		int i=0, j=0;
		ArrayList<Integer> al = new ArrayList<>();
		while(i < arr1.length && j < arr2.length)
		{
			if(arr1[i] == arr2[j]){
				al.add(arr1[i]);
				i++;
				j++;
			}
			else
			{
				if(arr1[i] > arr2[j])
					j++;
				else
					i++;
			}
		}
		return al;

	}
	
	private static void display(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	private static void sort(int[] arr)
	{
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
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int N = sc.nextInt();
		int arr1[] = new int[N];
		System.out.println("Start entering elements for array 1 :-");
		for(int i=0;i<N;i++)
			arr1[i] = sc.nextInt();
		
		int arr2[] = new int[N];
		System.out.println("Start entering elements for array 2 :-");
		for(int i=0;i<N;i++)
			arr2[i] = sc.nextInt();
		
		System.out.println("\nThe entered array 1 :-");
		display(arr1);
		
		System.out.println("\nThe entered array 1 :-");
		display(arr2);
		
		sort(arr1);
		sort(arr2);
		
		ArrayList <Integer> al = checkCommon(arr1, arr2);
		System.out.println("ArrayList : " + al);
		
		System.out.println();
		sc.close();
	}
}