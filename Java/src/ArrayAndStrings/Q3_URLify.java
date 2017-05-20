package ArrayAndStrings;

class Q3_URLify {
	  static char[] spaceCount(String s){
		int space = 0;
		char str [] = s.toCharArray();
		for(int i=0;i<s.length();i++){
			if(str[i]==' ')
				space++;
		} 
		int index = s.length()+space*2;
		char str2 [] = new char[index];
		for(int i=s.length()-1;i>=0;i--){
			if(str[i]==' '){
				str2[index-1]='0';
				str2[index-2]='2';
				str2[index-3]='%';
				index = index - 3;
			}
			else{
				str2[index-1]= str[i];
				index--;
			}
		}
		//System.out.println(str2);
		return str2;
    }

    
    public static void main (String args[]){
        System.out.println(spaceCount("A   C   "));
        //System.out.println(isPermutationB("ABC","BCA"));
    }
}