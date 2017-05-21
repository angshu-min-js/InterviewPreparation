package ArrayAndStrings;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class UnitTest {
	@Test
	public void testArrayMultiply(){
		int test[] = {0,1,4,7,6};
		int arr1[] = {1,2,3};
	    int arr2[] = {1,2};
	    int result [] = Q0_ArrayMultiply.multiply(arr1, arr2, 3, 2);
		assertEquals(result,test);
	}
}
