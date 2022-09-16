/*
    * 
   * * 
  * * * 
 * * * * 
* * * * * 

 */

package ForLoopPatterns;
   
public class Pyramid
{
	public static void main(String ar[])
	{
		int i,j,n=5,m=5;
		for(i=1;i<=n;i++)
		{ 
			for( j=4;j>=i;j--)
			{
				System.out.print( " "); 
			}
			
			for(int k=i;k>=1;k--)
			{
				System.out.print("*"+ " ");//Pyramid shape comes by using this space" " otherwise it will print right angle triangle
			}System.out.println();
		}
	}
}
