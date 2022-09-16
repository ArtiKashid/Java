package ForLoopPatterns;

public class InvertedTriangle {
	public static void main(String ar[])
	{
		int i,j,n=5;
		for(i=1;i<=n;i++)
		{ 
			for(j=i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=n;k++)
			{
				System.out.print("*" + " " );//print space for the desired  inverted pyramid triangle
			}
			System.out.println();
		}
	}

}
