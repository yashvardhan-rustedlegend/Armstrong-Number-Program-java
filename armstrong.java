import java.util.*;
class Armstrong
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n,count=0,last=0,sum=0;
		System.out.println("Enter the no.");
		n=sc.nextInt();
		int k=n;
		int k1=n;
		while(k!=0)
		{
			k=k/10;
			count++;
		}
		while(n!=0)
		{
			last=n%10;
			n=n/10;
			sum+=Math.pow(last,count);
		}
		if(sum==k1)
		{
			System.out.print("The no. is Armstrong");
		}
		else
		{
			System.out.print("The no. is not Armstrong");
		}
	}
}
