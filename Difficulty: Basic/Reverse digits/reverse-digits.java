class Solution {
    public int reverseDigits(int n) {
        // Code here
        int rev=0;
        while(n>0){
        int digit = n%10;
        rev*=10;
        rev+=digit;
        n /=10;
        }
        return rev;
    }
}