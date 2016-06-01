/*
 * Largest palindrome product
 * 
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

	Find the largest palindrome made from the product of two 3-digit numbers.
 */
import java.util.Arrays;
public class Problem4 
{
	private boolean isPalindrome(int num)//Method to check is the number palindrome or not.
	{
		return new StringBuffer().append(num).toString().equals(new StringBuffer().append(num).reverse().toString());//checking by first converting num to a temp StringBuffer object then checking if that is equal to another temp StringBuffer Object created by using reverse() method. 
	}
	private void palinProduct()//Method to calculate product and putting palindromeic ones in an array.
	{
		int[] product=new int[40000];//to store the palindromic products.
		int index=0;
		for(int i=800;i<1000;i++)
		{
			for (int j=800;j<1000;j++)
			{
				if(this.isPalindrome(i*j))
				{
					product[index]=i*j;					
					index++;
				}						
			}					
		}
		Arrays.sort(product);//Sorting to find the largest product.
		System.out.println(product[product.length-1]);//Simply printing the last element of the array. The shortest way I found to find the largest number in an array/
		
	}
	public static void main(String rag[])
	{
		new Problem4().palinProduct();//calling the method using an temp object.
	}
}//THE END.
