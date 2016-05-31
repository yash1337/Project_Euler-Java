/*
 * Multiples of 3 and 5
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

	Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 
{
	
	private static int calcSum(int[] arr)
	{
		int sum=0;
		for( int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
	static void findNumbers()
	{
		int multiples[]=new int[999];
		for (int i=3,j=0;i<1000;i++)
		{
			if(i%3==0 || i%5==0)
			{
				multiples[j]=i;
				j++;
			}
		}
		for (int i=0;i<multiples.length;i++)
			System.out.println(multiples[i]);
		System.out.println(calcSum(multiples));
	}
	public static void main(String args[])
	{
			findNumbers();
		
	}
}
