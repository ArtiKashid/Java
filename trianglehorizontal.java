/*Pattern 
 
* 
* * 
* * * 
* * * * 
* * * 
* * 
* 


*/
package ForLoopPatterns;

public class trianglehorizontal {
public static void main(String ar[])
{
	int i,j,n=4,m=4;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print("*"+" ");
		}
		System.out.println();
	}
	
	for(i=1;i<=n;i++)
	{
		for(j=3;j>=i;j--)
		{
			System.out.print("*" + " ");
		}
		System.out.println();
	}
	
	
}
}
