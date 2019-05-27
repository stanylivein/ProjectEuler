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
	public long evenFiboSum()
	{
		long a=0;
		long b=1;
		long c=2;
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
			sum+=c;
			a=b+c;//finding next fibonacci
			b=a+c;//finding next fibonacci
			c=a+b;//finding next fibonacci
		}
		
		return sum;
	}
	
}
