class Solution {
    public static boolean isPalinArray(int[] arr) {
        for(int i = 0 ; i <arr.length ; i++){
            int n = arr[i];
            int rev =0;
            while(n>0){
             int digit = n%10;
             rev =(rev*10)+digit;
             n/=10;
             
            }
            if (arr[i] !=rev){
                return false;
            }
        }
        return true;
        // code here.
    }
}