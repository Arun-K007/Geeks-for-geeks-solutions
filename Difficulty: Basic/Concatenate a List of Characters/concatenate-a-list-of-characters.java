class Solution {
    public String charToStr(String[] arr) {
        StringBuilder sb = new StringBuilder();
        // code here
        for(int i= 0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        
        return sb.toString();
        
    }
}