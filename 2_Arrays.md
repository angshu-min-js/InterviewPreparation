### Write a program --> {1,2,3} * {1,2} = {1,4,7,6}

#### Python
```Python
def ArrayMultiply(x, y, a, b):
    #result = [0,0,0,0,0]
    result = []
    for i in range(a+b):
        result.append(0)
    for i in range(0,a):
        for j in range(0,b):
            result[i+j+1] +=x[i]*y[j]
            result[i+j] += result[i+j+1]/10
            result[i+j+1] %=10
    return result
arr1 = [1,2,3]
arr2 = [1,2]
result = ArrayMultiply(arr1, arr2, 3, 2)
for i in result:
	print(i)

```
#### Java
```Java
package ArrayAndStrings;

public class ArrayMultiply{
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
```
