class Solution {
    public int convertFive(int n) {
        // code here
        int num=0;
        int result = 0;
        if(n==0){
            result =5;
        }
        while(n>0){
            int digit =n%10;
            if(digit==0){
                digit=5;
            }
            num=(num*10)+digit;
            n/=10;
        }
        while(num>0){
        int d = num%10;
        result=(result*10)+d;
        num/=10;
        }
        return result;
    }
}