class Solution {
    static boolean armstrongNumber(int og) {
        // code here
        int n = og;
        int result =0;
        int len =String.valueOf(n).length();
        while(n>0){
            int digit = n%10;
            result +=Math.pow(digit,len);
            n/=10;
        }
        return og==result;
    }
}