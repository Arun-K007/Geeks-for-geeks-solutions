class Solution {
    public String modify(String s) {
        // code here
        char[] ch = s.toCharArray();
        int l=0;
        int r=ch.length-1;
        while(l<r){
            if(!Vowels(ch[l])){
                l++;
            }
            else if(!Vowels(ch[r])){
                r--;
            }
            else{
                char temp =ch[l];
                ch[l]=ch[r];
                ch[r]=temp;
                l++;
                r--;
            }
        }
        return String.valueOf(ch);
    }
        public static boolean Vowels(char ch){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                return true;
            }
            else {
            return false;
            }
        }
        
}
    


