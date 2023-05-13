import java.util.Scanner;

class Question_3
{

	/*
		3.Create a matrix of n*m.Print columnwise addition of matrix.
	
	*/
	static int[][] scan_matrix()
	{	
		int matrix[][];
		
		
		Scanner sc = new Scanner(System.in);
		
		int n,m;
		
		System.out.println("Enter the rows in the matrix");
		n = sc.nextInt();
		System.out.println("Enter the column numbers ");
		m = sc.nextInt();
		
		
		matrix = new int[n][];
		
		
		System.out.println("Enter the elements in the matrix");
		
		for(int i =0;i<matrix.length;i++)
		{
			matrix[i] =new int[m];
			
			for(int j =0;j<matrix[i].length;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		
		
		return matrix;
	
	}
	
	static int[] addCol(int matrix[][])
	{
		int ans[] = new int[matrix[0].length];
		for(int i =0;i<matrix.length;i++)
		{
			for(int j = 0;j<matrix[i].length;j++)
			{
			
				ans[i]=ans[i]+matrix[j][i];
			}
		}
		
		return ans;
		
		
	}.
	
	public static void main(String [] args)
	{
		
		int matrix[][] = Question_3.scan_matrix();
		int ans[]      = Question_3.addCol(matrix);
		
		for(int x:ans)
		{
			System.out.print(x+" ");
			
		}
		System.out.println();
	}	

}
