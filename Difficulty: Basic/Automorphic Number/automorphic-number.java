class Solution {
    public String isAutomorphic(int n) {
        // code here
        int s=(int)Math.pow(n,2);
        while(n>0){
            int digit1 = s%10;
            int digit2 =n%10;
            if (digit1 != digit2){
                return "Not Automorphic";
            }
            s /=10;
            n/=10;
        }
        return "Automorphic";
    }
}