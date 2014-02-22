
/**
 * @author McClain Marchman
 * Project Euler Problem 5
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * http://projecteuler.net/problem=5
 */
public class Euler5 
{

	public static void main(String[] args) 
	{
		
		
		for(int startNum1= 1000000000;startNum1>0;startNum1--)
		{
			
			for(int index = 1;startNum1%index == 0 && index<=20 ; index++)
			{
				
						if(index == 20)
						{
							System.out.println(startNum1);
						}
				
			}
			
		}
	}

}
