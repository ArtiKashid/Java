/* Right Angle Triangle
 
*
**
***
****

 */
package ForLoopPatterns;

public class SimpleTriangle {
	public static void main(String arg[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
