class Solution {
    String firstRepChar(String s) {
        // code here
        Set<Character> count = new HashSet<>();
        for(int i = 0;i<s.length();i++){
            if(count.contains(s.charAt(i))) return String.valueOf(s.charAt(i));
            count.add(s.charAt(i));
        }
        return "-1";
    }
}