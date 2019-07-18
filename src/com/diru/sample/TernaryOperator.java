package com.diru.sample;

public class TernaryOperator
{
	public static void main(String args[])
	{

		int input = Integer.parseInt(args[0]);
		int target = 0;
//if input no is greater than 10, set the number as 10.
		if (input>10)
		{
			target = 10;
		}

		else
		{
			target = input;
		}

		target = (input>10)? 10: input;

		outer: for (int i=0; i<target; i++)
			{
				for(int j=0; j<target; j++)
				{
				if(j>i) 
					{
					System.out.println("L");
					continue outer;
					}
				System.out.print(" " + (i*j));	
				}
			}
		System.out.println();
	}
}