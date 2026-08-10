class Solution {
    public String removeDuplicates(String s) {
        // code here
        StringBuilder str = new StringBuilder();
        str.append(s.charAt(0));
        for(int i =1;i<s.length();i++){
            if(s.charAt(i-1)!=s.charAt(i)){
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}