/* Inverted Right AngleTriangle
 
    ****
    ***
    **
    *

 
 */

package ForLoopPatterns;

public class InvertedRightTri {

	public static void main(String arg[])
	{
		int i,j,n=4,m=4;
		for(i=1;i<=n;i++)
		{
			for(j=4;j>=i;j--)
			{ 
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
