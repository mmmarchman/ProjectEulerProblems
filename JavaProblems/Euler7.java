
/**
 * @author McClain Marchman
 * Project Euler Problem 7
 * What is the 10 001st prime number?
 * http://projecteuler.net/problem=7
 */
public class Euler7 
{
	public static void main(String[] args) 
	{
		int start = 4;
		int countPrime = 2;
		int result = 0;
		
		while(countPrime<10001)
		{
			for(int index=2; index<start; index++)
			{
				int hold = start;
				
				//leave the loop if start is divisible by a number other than itself and 1
				if(start%index==0)
				{
					index += start;
				}
				
				//if start is not divisible by index2 and we are reaching the end of the for loop add 1 to countPrime
				else if(start%index!=0 && index==hold-1)
				{
					countPrime++;
					result = start;
				}
				
				//do nothing
				else
				{
					
				}
				
			}
			start++;
		}
		//Print results
		System.out.println("The "+ countPrime+"st prime number is: " + result);
		
	}

}
