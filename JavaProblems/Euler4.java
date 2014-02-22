
import java.util.*;

/**
 * @author McClain Marchman
 * Project Euler Problem 4
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * http://projecteuler.net/problem=4
 */
public class Euler4 
{

	
	public static void main(String[] args)
	{
		int numba1 = 100;
		int pal1=100; 
		
		List<Integer> palList = new ArrayList<Integer>();
		
		while ( numba1<1000 && pal1 <= 998001)
		{
			
			for( int index = 100; index < 1000;index ++)
			{
				pal1 = numba1 * index;
				palList.add(pal1);
			}
			numba1++;
			
		}
		ListIterator<Integer> it = palList.listIterator();
		List<Integer> outList = new ArrayList<Integer>();
		
		while (it.hasNext())
		{
			int six = it.next();
			int hold = six;
			int reversedNum = 0;
			
			while (six != 0)
			{
				
				int last = six % 10;
				reversedNum = reversedNum * 10 + last;
				six = six / 10;
			
				
	
			}
			if (reversedNum == hold )
			{
				outList.add(hold);
			}
			
			
		
		}
		
			
		
				
		System.out.println(outList);
	}
}
