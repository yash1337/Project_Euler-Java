/*
 * Special Pythagorean triplet
 * 
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */
public class Problem9
{
	private boolean isTriplet(int a, int b, int c)//Method for checking if the group of three numbers is a pythagorean triplet.
	{
		return a*a+b*b==c*c;
	}
	private void specialTriplet()
	{
		int a=100,b=101,c=102;//Initialized them so that they can enter the loop and can compared to the variable of inner loop.
		for (a=100;a<b;a++) //the limits are arbitrary.
		{
			for(b=100;b<c;b++)
			{
				for (c=200;c<600;c++)
				{
					if (a+b+c==1000 && this.isTriplet(a, b, c))//Checking if the numbers add upto 1000 and are valid pythagorean triplet.
					{	
						System.out.println(a*b*c);
						System.exit(0);//to get out of everything. Although could have used break with labels but this is what I could remember at time
					}
				}
			}
		}
	}
	public static void main(String args[])
	{
		new Problem9().specialTriplet();//calling the method using a temp object.
	}
}//THE END.
