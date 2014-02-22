
/**
 * @author McClain Marchman
 * Project Euler Problem 2
 * 
 * 
 *	By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
 *	find the sum of the even-valued terms.
 *	http://projecteuler.net/problem=2
 */
public class Euler2 
{

	public static void main(String[] args)
	{
		
		int sumLimit = 4000000;
		int last = 1;
		int evenSum = 0;
		
		int next = 1;
		
		while(next < sumLimit  )
		{
			int temp = next;
			next = next + last;
			last = temp;
			
			if(next%2==0)
				evenSum += next;
			
		}
		
		
		System.out.println(evenSum);
		
		
		
	}

}
