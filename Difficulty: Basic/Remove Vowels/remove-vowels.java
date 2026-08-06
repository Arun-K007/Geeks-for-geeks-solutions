class Solution {
    String removeVowels(String s) {
        // code here
        char[] ch = s.toCharArray();
        StringBuilder ch1 = new StringBuilder();
        for(int i = 0;i<ch.length;i++){
            if (!Vowels(ch[i])){
                ch1.append(ch[i]);
                
            }
        }
        return ch1.toString();
        
    }

    public static boolean Vowels(char ch){
        ch = Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
    }
    return false ;
}
}
    