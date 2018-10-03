/*
**Q4. Take as input a two-d array. Wave print it row-wise
E.g. for the following input array
[[11, 12, 13, 14],
[21, 22, 23, 24],
[31, 32, 33, 34],
[41, 42, 43, 44]]
The output is
11, 12, 13, 14, 24, 23, 22, 21, 31, 32, 33, 34, 44, 43, 42, 41
*/

import java.util.Scanner;
class q4
{
	private static void display(int[][] arr)
	{
		int i=-1,j=-1,cnt = 0;
		for(i=0;i<arr.length;i++)
		{
			if(j == -1)
			{
				for(j=0;j<arr[i].length;j++)
				{
					System.out.print(arr[i][j]); 
					if(cnt < arr.length*arr[0].length-1)
						System.out.print(", ");
					cnt++;
				}
			}
			else
			{
				for(j=arr[i].length-1;j>=0;j--)
				{
					System.out.print(arr[i][j]); 
					if(cnt < arr.length*arr[0].length-1)
						System.out.print(", ");
					cnt++;
				}
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array (m x n) : ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int arr[][] = new int[m][n];
		System.out.println("Start entering elements for array :-");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				arr[i][j] = sc.nextInt();
		
		System.out.println("Array :-");
		display(arr);
		
		System.out.println();
		sc.close();
	}
}