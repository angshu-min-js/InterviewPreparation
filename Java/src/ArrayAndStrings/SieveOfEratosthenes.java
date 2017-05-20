package ArrayAndStrings;

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