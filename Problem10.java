/*
 * Summation of primes
 * 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */

public class Problem10
{
	private boolean isPrime(int num)//Method to check if the number is prime or not.
	{
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	private void sumOfPrimes()//Method to find the sum of the primes under 2 million
	{
		long sum=0;//variable to calculate sum
		for (int i=2;i<2000000;i++)// finding the primes till 2 million
		{
			if(this.isPrime(i))
			{
			sum+=(long)i;
			System.out.println(i+"  "+sum);
					
			}
		}
		System.out.println(sum);
	}
	public static void main(String args[])
	{
		new Problem10().sumOfPrimes();//Calling the method using a temp object.
		
	}
}//THE END.
