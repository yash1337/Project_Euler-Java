/*
 * 10001st prime
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

	What is the 10 001st prime number?	
 */
public class Problem7 
{
	private boolean isPrime(long num)//Method for checking if the num is prime or not.
	{
		for (long i=2;i<=num/2;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	private void Prime10001()//Method to find out the 10001st prime.
	{
		int counter=0;
		for (long i=2;;i++)
		{
			if (this.isPrime(i))//Checking if the number is prime if yes then increasing the counter by one;
			{	
				counter++;				
			}				
			if (counter==10001)//WHen counter hits 10001 the printing the number and  breaking out of the loop.
			{
				System.out.println(i);
				break;
			}				
		}			
	}
	public static void main(String args[])
	{
		new Problem7().Prime10001();//Calling the method with a temp object
	}
}//THE END.
