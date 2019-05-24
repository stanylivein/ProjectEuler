/**
 * Natural number below 10 that are multiples 3 or 5, we get 3,5,6,9. The sum of these
 * multiples is 23. 
 * Find the sum of all the muliples of 3 or 5 below N
 * 
 * 1<=T<=10^5
 * 1<=N<=10^9
 * 
 * 
 */

package project_euler;

public class Solution1 
{

	public static void main(String[] args) 
	{	
		Solution mysol=new Solution(20);
		System.out.println(mysol.Calculate());
	}

}

final class Solution
{
	private long N;
	public Solution(long n)
	{
		this.N=n;
	}
	
	public long Calculate()
	{
		long result=sumDivisibleBy(3)+sumDivisibleBy(5)-sumDivisibleBy(15);
		return result;
	}
	
	public long sumDivisibleBy(int x)
	{
		long a=(N-1)/x;
		return x*(a*(a+1))/2;
	}
}
