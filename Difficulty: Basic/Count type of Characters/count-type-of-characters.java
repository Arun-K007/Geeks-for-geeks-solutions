class Sol {
    int[] count(String s) {
        char[] ch = s.toCharArray();
        int upper =0;
        int lower = 0;
        int num = 0;
        int special =0;
        for (int i = 0;i<ch.length;i++){
            if(Character.isUpperCase(ch[i])){
                upper++;
            }
            else if(Character.isLowerCase(ch[i])){
                lower++;
            }
            else if(Character.isDigit(ch[i])){
                num++;
            }
            else{
                special++;
            }
        }
        int[] count = new int[4];
        count[0]=upper;
        count[1]=lower;
        count[2]=num;
        count[3]=special;
        
        return count;
        
        
    }
}