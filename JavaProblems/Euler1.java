
/**
 * @author McClain Marchman
 * Project Euler Problem 1
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * http://projecteuler.net/problem=1
 */
public class Euler1 
{
	public static void main(String args[])
	{
		int index =0;
		int sum = 0;
		
		// prints the sum of the multiples of 3 or 5 under 1000
		while(index<999)
		{
			index++;
		if(index%3 == 0 || index%5 == 0 )
			sum += index;
		}
		System.out.println(sum);
	}

}
