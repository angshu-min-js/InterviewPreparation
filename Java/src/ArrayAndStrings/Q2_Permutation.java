package ArrayAndStrings;

import java.util.Arrays;


class Q2_Permutation {
	static String sort(String s){
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
    public static boolean isPermutationA(String a, String b){
    	if(a.length()!=b.length()) return false;
        int[] storage = new int [128];
        char[] c_a = a.toCharArray();
        for(char i: c_a){
        storage[i]++;
        }
        char[] c_b = b.toCharArray();
        for(char i: c_b){
        storage[i]--;
        if(storage[i]<0) return false;
        }
        return true;
    }
    
    public static boolean isPermutationB(String a, String b){
    	if(a.length()!=b.length()) return false;
        return sort(a).equals(sort(b));
    }
    public static void main (String args[]){
        System.out.println(isPermutationA("ABC","BCA"));
        System.out.println(isPermutationB("ABC","BCA"));
    }
}