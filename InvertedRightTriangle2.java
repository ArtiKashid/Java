/* Inverted Right angle triangle
   *****
    ****
     ***
      **
       *
 */
package ForLoopPatterns;

public class InvertedRightTriangle2 
{
public static void main(String ar[])
{
	int i,j,n=5;
	for(i=1;i<=n;i++)
	{ 
		for(j=i;j>=1;j--)
		{
			System.out.print(" ");//Space is Printed for first triangle
		}
	
		for(int k=i;k<=n;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}