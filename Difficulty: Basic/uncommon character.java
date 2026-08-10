class Solution {
    String uncommonChars(String s1, String s2) {
        // code here
        boolean flag = true;
        Set<Character> set = new TreeSet<>();
        for(int i = 0;i<s1.length();i++){
            flag=true;
            for(int j= 0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    flag = false;
                }
                
            }
            
            if(flag){
                if(!set.contains(s1.charAt(i)))
                set.add(s1.charAt(i));
            }

        }
        for (int m = 0;m<s2.length();m++){
            flag = true;
            for(int n  = 0 ;n<s1.length();n++){
                if(s2.charAt(m)==s1.charAt(n)){
                    flag = false;
                }
            }
            if(flag){
                if(!set.contains(s2.charAt(m)))
                set.add(s2.charAt(m));
            }
            
        }
        String x = "";
        for(char k:set){
            x +=k;
        }
        return x;
    }
}
