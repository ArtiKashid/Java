/*Square with alternate numbers
1 0 1 0 
1 0 1 0 
1 0 1 0 
1 0 1 0 

*/
package ForLoopPatterns;

public class SqureOneZero {
public static void main(String arg[])
{
	
int i,j,n=4,m=4;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=m;j++)
		{
			if(j%2==0)
				System.out.print(0+" ");
			else
				System.out.print(1+" ");
		}
		System.out.println();
	}
}
}