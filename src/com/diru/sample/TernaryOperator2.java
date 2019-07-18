package com.diru.sample;

public class TernaryOperator2
{
	public static void main(String args[])
	{
		try{

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
		
		//Arithmetic
		int num = 10;
		int result = num/input;
		
		System.out.println("Result = " + result);
		}
		
		catch(NumberFormatException ex){
			System.out.println("Number WhErE bIHH!? wUt's " + args[0]);
			System.out.println();
			//ex.printStackTrace();
		}
				
				catch(Exception ex){
					System.out.println("Err" + args[0]);
					System.out.println();
					ex.printStackTrace();
				}
			finally {
				System.out.println("Finally it's done!");
			}
				
			}
		
	}