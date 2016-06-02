/*
 * Smallest multiple
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

	What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5 
{
	private void smallestMultiple()
	{
		boolean flag=false;// variable to check if the number is divisible by1-20
		for (int i=2520;;i++)//starting from 2520 because it is divisible by 1-10 and a number divisible by 1-20 must be bigger than this.
		{
			for(int j=1;j<21;j++)//loop to check if the number is divisible by 1-20
			{
				if (i%j!=0)
				{
					flag=false;//if not divisible by any one number then come out of loop and restart the loop
					break;
				}
				flag=true;			
				
			}
			if (flag ==true)//after one iteration of the loop check if the number is divisible by all the numbers from 1-20 by checking the status of the flag
			{
				System.out.println(i);
				break;//the smallest one will be the fist one to to found so exit the outer loop once a number is found.
			}				
		}
	}
	public static void main(String args[])
	{
		new Problem5().smallestMultiple();// calling the function using  a temp object.
	}
	
}
