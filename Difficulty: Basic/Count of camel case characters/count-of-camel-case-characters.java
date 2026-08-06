class Sol {
    int countCamelCase(String s) {
        int count =0;
        char[] ch = s.toCharArray();
        for(int i =0 ;i<ch.length;i++){
            if(ch[i]>='A' && ch[i]<='Z'){
                count++;
            }
        }
        return count;
    }
}