package ArrayAndStrings;


class Q1_isUnique {
    public static boolean isUniqueA(String str){
        if(str.length()>26) return false;
        boolean [] storage = new boolean [128];
        for(int i=0; i<str.length();i++){
        char c = str.charAt(i);
        if(storage[c])
        return false;
        else
        storage[c]=true;
        }
        return true;
    }
    
    public static boolean isUniqueB(String str){
        if(str.length()>26) return false;
        int checker=0;
        for(int i=0; i<str.length();i++){
            int val = str.charAt(i)-'a';
            if((checker & (1<<val))>0) return false;
            else
            checker |=(1<<val);
        }
        return true;
    }
    public static void main (String args[]){
        System.out.println(isUniqueA("ABC"));
        System.out.println(isUniqueB("ABA"));
    }
}