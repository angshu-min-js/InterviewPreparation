package ArrayAndStrings;

public class spiralOrder {
	
	static void spiralOrder(int [][] matrix){
		if(matrix.length ==0)
			return;
		int top = 0, down = matrix.length-1, left = 0, right = matrix[0].length-1;
		System.out.println(right+" "+down);
		while(top<down && left<right){
			for (int j = left; j<=right; j++)
				System.out.print(matrix[top][j]+" ");
			top++;
			for (int i = top; i<=down; i++)
				System.out.print(matrix[i][right]+" ");
			right--;
			
			for (int j = right; j>=left; j--)
				System.out.print(matrix[down][j]+" ");
			down--;
			for (int i = down; i>=top; i--)
				System.out.print(matrix[i][left]+" ");
			left++;
		}
	}
	public static void main(String args[])
	  {
	    int[][] n ={ {1,  2,  3,  4,  5,  6},
	            {7,  8,  9,  10, 11, 12},
	            {13, 14, 15, 16, 17, 18}
	        };
	    System.out.println("Print");
	    spiralOrder(n);
	  }

}
