/*
 * Largest prime factor
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29. 	What is the largest prime factor of the number 600851475143 ?	
 */
public class Problem3 
{
	private final long number=600851475143L;//constant to be checked.
	
	private boolean isPrime(long num)//method to check if num is prime.
	{
		for (long i=2;i<num/2;i++)
		{
			if (num%i==0)
				return false;
		}
		return true;
	}

	private void findFactors()//Method to find factors and put prime ones in the pFactor array
	{
		long[] pFactors=new long[99];//array to store prime factor
		for (long i=1,j=0;i<=number;i++)
		{
			if(number%i==0 && this.isPrime(i))
			{
				pFactors[(int) j]=i;
				j++;
				System.out.println("Prime fator -"+i+" 	at- "+j);//To print the factors. Did not do it outside the loop was was taking a lot of time
			}
		}				
	}
	
	public static void main(String args[])
	{
		new Problem3().findFactors();//calling the method using a temporary object.
	}
}//THE END.
