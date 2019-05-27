/**
 * Natural number below 10 that are multiples 3 or 5, we get 3,5,6,9. The sum of these
 * multiples is 23. 
 * Find the sum of all the multiples of 3 or 5 below N
 * 
 * 1<=T<=10^5
 * 1<=N<=10^9
 * 
 * ex: if N=15 then 3,5,6,9,10,12 = 45
 * 
 */

package project_euler;

public class Solution1 
{

	public static void main(String[] args) 
	{	
		Solution1_1 mysol=new Solution1_1(1000);
		System.out.println(mysol.calculate());
	}

}

class Solution1_1
{
	private long N;
	public Solution1_1(long n)
	{
		this.N=n;
	}
	
	/**
	 * 
	 * @return the sum of the multiples of the all dividers
	 */
	public long calculate()
	{
		/**
		 * here we added the two results of multiples and
		 * minus the Least common multiple of both the numbers
		 * 
		 */
		long result=sumDivisibleBy(3)+sumDivisibleBy(5)-sumDivisibleBy(15);
		return result;
	}
	
	/**
	 * 
	 * @param x : divider number
	 * @return the sum of the multiples of the divider 
	 */
	public long sumDivisibleBy(int x)
	{
		long n=(N-1)/x;//find the number of divisors for the number N-1 of x
		long ap=n*(n+1)/2;//find the sum of the sequence
		return x*ap;//multiply the sum of the sequence with the divider 
	}
}
