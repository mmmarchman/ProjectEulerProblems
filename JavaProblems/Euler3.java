
import java.util.ArrayList;
import java.util.List;

/**
 * @author McClain Marchman
 * Project Euler Problem 3
 * What is the largest prime factor of the number 600851475143 ?
 * http://projecteuler.net/problem=3
 * 
 * 
 */
public class Euler3 
{
	public static void main(String args[])
	{
		long fac;
		fac = 600851475143L ;
		List<Long> factors =  new ArrayList<Long>();
		
		
		for(long i = 2; i <= fac; i++)
		{
			while(fac%i == 0)
			{
				
				factors.add(i);
				fac /= i;
			}
			
		}
		
		
			System.out.println(factors);
		
	}
}
