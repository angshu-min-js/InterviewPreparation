### 1. Write a program --> {1,2,3} * {1,2} = {1,4,7,6}

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

### 2. Prime number using the SieveOfEratosthenes

#### Python
```Python
def SieveOfEratosthenes(n):
    primes = [True for i in range(n+1)]
    p=2
    while(p*p<=n):
        if primes[p]==True:
            for i in range(p*2, n+1, p):
                primes[i]=False
            p+=1
    lis = []
    for p in range(2,n):
        if primes[p]:
            print p,

if __name__=='__main__':
    print "Print Prime numbers upto", 10
    SieveOfEratosthenes(10)
```

#### Java
```Java
public class SieveOfEratosthenes {
	static void SieveOfEratosthenes(int n) {
	    boolean prime[] = new boolean[n+1];
	    for(int i=0;i<n;i++)
	      prime[i]=true;

	    for(int p = 2; p*p<n; p++)
	    {
	      if(prime[p] == true)
	      {
	        for(int i = p*2; i<p; i+=p)
	          prime[i] = false;
	      }
	    }
	    for(int i = 2; i<=n; i++)
	    {
	      if(prime[i]==true)
	      System.out.print(i+ " ");
	  }
	}

	  //Main
	  public static void main(String args[])
	  {
	    int n =10;
	    SieveOfEratosthenes(n);
	  }
	}
```
