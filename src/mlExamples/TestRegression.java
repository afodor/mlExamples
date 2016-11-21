package mlExamples;
import Jama.Matrix;

public class TestRegression
{
	public static void main(String[] args) throws Exception
	{
		double[][] y = {{73} , {50}, {128}, {170},  {87}, {108}, {135},  {69}, 
				{148}, {132} };
		double[][] x = { 
				{1,30},{1,20},{1,60},{1,80},{1,40},{1,50},{1,60},{1,30},{1,70},{1,60}};
		
		Matrix X = new Matrix(x);
		Matrix XT = X.transpose();
		Matrix PRODUCT=  XT.times(X).inverse().times(XT).times(new Matrix(y));
		
		printMatrix(PRODUCT);
	}
	
	private static void printMatrix(Matrix m)
	{
		double[][] a = m.getArray();
		
		for( int x=0; x < a.length; x++)
		{
			for( int y=0; y < a[x].length; y++)
				System.out.print("\t" + a[x][y]);
			
			System.out.println();
		}
			
	}
}
