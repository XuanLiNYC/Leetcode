

public class Powerxn
{

	public static int call(int x, int n)
	{
		int tag=1;

		if(x<0)
		tag=-1;
		
		if(x==0)
		return(0);
		
		if(n==0)
		return(1);

		return(power(Math.abs(x),n)*tag);
		
		

	}

	public static int power(int x, int n)
	{
		int result=1;
		if(n>1)
		{
			if(n%2==1)	
			{
				result=result*x*power(x,(n-1)/2)*power(x,(n-1)/2);

			}
			else
			{
			result=result*power(x,n/2)*power(x,n/2);
			}

		return(result);
		}
		else if(n==1)
		return(x);
		else return(0);	

	}

	public static int power2(int x, int n)
	{
		int result=1;
		int power=x;
		int signle=x;
	
		int m=n;
		while(m>1)
		{
			if(m%2==1)
			{
				result=result*signle;			

			}
		power=power*power;
		signle=signle*x;
		m=m>>1;
		System.out.println("m is "+m);
		
		}
		
		System.out.println("power is"+ power);
		System.out.println("signle is"+ signle);
		System.out.println("result is"+ result);


		
		return(result*power);

	}

	public static void main(String[] args)
	{
		int x=-3;
		int n=11;
		
		System.out.println(call(x,n));

		System.out.println(power2(x,n));
	}



}