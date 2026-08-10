class Solution {
    String uncommonChars(String s1, String s2) {
        // code here
        int[] c1=new int[26];
        int[] c2=new int[26];
        for(int i=0;i<s1.length();i++){
            c1[s1.charAt(i)-'a']++;
        }
         for(int i=0;i<s2.length();i++){
            c2[s2.charAt(i)-'a']++;
        }
        String str="";
        for(int i=0;i<c1.length;i++){
            if(c1[i]>0 && c2[i]==0){
                str+=(char)(i+'a');
            }
            if(c2[i]>0 && c1[i]==0){
                str+=(char)(i+'a');
            }
        }
        return str;
        
    }
}