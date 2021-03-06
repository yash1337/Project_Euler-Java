/*
 * Even Fibonacci numbers
 * 
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
public class Problem2
{
	
		private long printSum (int arr[])// method to print the sum of the array containing even Fibonacci numbers.
		{
			long sum=0;
			for(int i=0;i<arr.length;i++)
			{
				sum=sum+arr[i];
			}
			return sum;
		}
		private boolean isEven(long num)//self explanatory
		{
			return num%2==0;
		}
		private void calcFib()//Method to calculate the Fibonacci number. Weed out the odd ones and then put them in an array for addition.
		{
			int fib[]=new int[40];// array to store the even Fiboonacci numbers/
			fib[0]=2;
			int index=1;//variable to index array
			int num=0;
			int ini=1;
			int sec=2;
			while (ini<4000000)//Calculating
			{
				num=ini+sec;//Fibonacci
				ini=sec;//Series.
				sec=num;
				if (this.isEven(num)==true)
				{
					fib[index]=num;
					index++;
				}
			}
			System.out.println(this.printSum(fib));//Calling the printSum() for returning the sum of the even Fibonacci series.
			
		}
		public static void main (String args[])
		{
			new Problem2().calcFib();// Calling the method using a temporary variable.
		}
	
}// THE END.
