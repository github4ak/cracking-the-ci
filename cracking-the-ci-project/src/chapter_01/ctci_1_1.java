package chapter_01;

public class ctci_1_1 {
    
    static boolean isUnique(String input){
        
        int strLength =  input.length();
        
        if(strLength > 128){
            return false;
        }
        
        boolean ascii[] = new boolean[128];
        
        for(int i = 0 ; i < strLength ; i++){
            int val = input.charAt(i);
            if(ascii[val]){
                return false;
            }
            ascii[val] = true;
        }
        
        return true;
    }
    
    public static void main(String args[]){
        String input = "Hello";
        System.out.println("Has unique characters "+isUnique(input));
    }
}