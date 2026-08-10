class Solution {
    static boolean checkYear(int n) {
        // code here
        boolean flag = false;
        if(n%100 !=0 && n%4==0){
            flag = true;
        }
        if(n%400==0){
            flag=true;
        }
        return flag;
    }
}