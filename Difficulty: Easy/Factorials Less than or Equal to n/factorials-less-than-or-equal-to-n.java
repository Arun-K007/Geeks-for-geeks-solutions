class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> factnum = new ArrayList<>();
        int i =1;
        long fact=1;
        while(fact<=n){
            factnum.add(fact);
            i++;
            fact *=i;
        }
        return factnum;
    }
}