/*
 * Multiples of 3 and 5
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

	Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 
{
	
	private static int calcSum(int[] arr)// Function to calculate sum of the array of multiples.
	{
		int sum=0;
		for( int i=0;i<arr.length;i++)//Function to traverse array.
		{
			sum=sum+arr[i];
		}
		return sum;//returning the sum of multiples.
	}
	static void findNumbers()
	{
		int multiples[]=new int[999];//variable to store the multiples. Should have used ArrayList for dynamic array.
		for (int i=3,j=0;i<1000;i++)
		{
			if(i%3==0 || i%5==0)//checking if the number is multiple of 3 or 5.
			{
				multiples[j]=i;
				j++;//Increasing the index of array.
			}
		}
		System.out.println(calcSum(multiples));//Printing the sum of multiples.
	}
	public static void main(String args[])
	{
			findNumbers();//calling the function to print the sum of the multiples.
		
	}
}//THE END.
