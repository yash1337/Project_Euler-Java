/*
 * Sum square difference

The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Problem6 
{
	private int sumSquare()//Method to calculate sum of the squares of first 100 natural numbers.
	{
		int sum=0;
		for(int i=1;i<101;i++)
		{
			sum+=i*i;
		}
		return sum;
	}
	private int squareSum()//Method to calculate square of the sum of the first 100 natural numbers.
	{
		int sum=0;
		for(int i=1;i<101;i++)
		{
			sum+=i;
		}
		return (sum*sum);
	}
	private void difference()//Method to calculate the difference between the sum of squares and square of sum.
	{
		int diff=this.squareSum()-this.sumSquare();
		System.out.println(diff);
	}
	public static void main(String args[])
	{
		new Problem6().difference();//calling the method using a temp variable.
	}
}
