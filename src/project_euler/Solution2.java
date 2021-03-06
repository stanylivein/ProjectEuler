/**Each new term in the fibonacci sequence is generated by adding the previous two terms
 * By starting 1,2, the first 10 terms will be 1,2,3,5,8,13,21,34,55,89,...
 * By considering the terms in the fibonacci sequence whose values 
 * do not exceed N, find the sum of the even valued terms.
 * 
 * 1<=T<=10^15
 * 10<=N<=4x10^16
 * 
 */
package project_euler;

public class Solution2 
{

	public static void main(String[] args) 
	{
		Solution2_1 mysol=new Solution2_1(4000000);
		long res=mysol.evenFiboSum();
		System.out.println(res);
	}
}

class Solution2_1
{
	private long N;
	public Solution2_1(long n)
	{
		this.N=n;
	}
	/**
	 * method to calculate even fibonacci sum
	 * @return sum of the fibonacci for even terms
	 */
	public long evenFiboSum()
	{
		long a=1;
		long b=1;
		long c=a+b;
		long sum=0;
		while(c<N)
		{
			/**
			 * Norml Fibonacci series
			 * 
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
			*/
			sum+=c;//adding the even values
			a=b+c;//finding next fibonacci
			b=a+c;//finding next fibonacci
			c=a+b;//finding next fibonacci ie., even
		}
		return sum;
	}
	
}
