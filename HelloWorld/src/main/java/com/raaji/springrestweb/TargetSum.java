package com.raaji.springrestweb;

public class TargetSum {
	
	public static void main(String args[])
	{
		int a[]= {3, 5, -4, 8, 2, 11, 1, -1, 6};
		int sum=10;
		int result[]=new int[2];
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			for(int j=i+1;j<a.length;j++)
			{
					if(a[i]+a[j]==sum)
					{
						result[k++]=a[i];
						result[k]=a[j];
					}
			}
			for(k=0;k<result.length;k++)
			{
				System.out.print(result[k]+" ");
			}
		}
		
	}

}
