class Solution {
    public static char getMaxOccuringChar(String s) {
        char[] ch = s.toCharArray();
        int count =0;
        int max_count = 0;
        char repeat = ch[0];
        for(int i = 0;i<ch.length;i++){
                           count=0;
            for(int j = 0;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                }
                if(count>max_count){
                    max_count=count;
                    repeat = ch[i];
                    
                }
                if(count==max_count){
                    if(ch[i]<repeat){
                        repeat=ch[i];     
                    }
                }
             
                
            }

        }
        return repeat;
        // code here
        
    }
}