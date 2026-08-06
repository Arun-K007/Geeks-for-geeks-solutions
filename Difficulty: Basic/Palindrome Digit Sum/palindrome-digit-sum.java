class Solution {
    boolean isDigitSumPalindrome(int n) {
        int num=n; 
        int sum=0;
        // code here
        while(num>0){
            int digit =num%10;
            sum +=digit;
            num /=10;
            
        }
        int sum1 = sum;
        int rev=0 ;
        while (sum1>0){
            int digit1=sum1%10;
            rev = (rev*10) + digit1;
            sum1 /=10;
            
        }
        return rev == sum;
    }
}