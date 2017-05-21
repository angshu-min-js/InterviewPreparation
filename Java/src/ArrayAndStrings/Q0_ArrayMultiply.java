package ArrayAndStrings;

public class Q0_ArrayMultiply{
    public static int[] multiply(int x [], int y [], int a, int b){
      int result[] = new int[a+b];
      for(int i = a-1; i>=0;i--){
        for(int j= b-1;j>=0;j--){
          result[i+j+1] +=x[i]*y[j];
          result[i+j] += result[i+j+1]/10;
          result[i+j+1] %=10;
        }
      }
      /*for (int i : result)
            System.out.print(result[i] + " ");*/
      
    return result;
}
     public static void main(String []args) throws Exception{
       //ArrayMultiply m = new ArrayMultiply();
       int arr1[] = {1,2,3};
       int arr2[] = {1,2};
       int result [] = multiply(arr1, arr2, 3, 2);
       for (int i=0; i<result.length; i++)
           System.out.print(result[i] + " ");
     }
}
