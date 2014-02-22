

/**
 * @author McClain Marchman
 * Project Euler Problem 6
 * Find the difference between the sum of the squares of the first one hundred natural numbers
 * and the square of the sum.
 * http://projecteuler.net/problem=6
 */
public class Euler6 
{

	public static void main(String[] args) 
	{
		int sum = 0;
		long square = 0L;
		//ArrayList sumList = new ArrayList();
		
		for(int index = 1; index <= 100 ; index++)
		{
			sum += (index * index); 
			
		}
		
		for(int index = 1; index <= 100 ; index++)
		{
			square += index;
			
			
		}
		
		square = (square*square);
		System.out.println(square-sum);
		
		
		

	}

}
