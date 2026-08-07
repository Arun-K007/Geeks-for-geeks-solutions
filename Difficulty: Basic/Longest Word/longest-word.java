class Solution {
    public String longest(String[] arr) {
        // code here
        String longest=arr[0];
        for (int i = 0;i<arr.length-1;i++){
            if(longest.length()<arr[i+1].length()){
                longest =arr[i+1];
            }
        }
        return longest;
    }
}