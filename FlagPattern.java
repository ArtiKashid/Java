package ForLoopPatterns;

public class FlagPattern {
public static void main(String arg[])
{
	int i,j,m=4,n=4;
	
	for(i=1;i<=n;i++)
	{

		for(j=n;j>=i;j--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	for(i=1;i<=n;i++)
	{

		for(j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
