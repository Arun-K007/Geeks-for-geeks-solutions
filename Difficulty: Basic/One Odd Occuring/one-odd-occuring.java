class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here
        int keyitem =0;
        Map<Integer,Integer> count = new HashMap<>();
        for(int num:arr){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        for(int key:count.keySet()){
            if (count.get(key)%2!=0){
               keyitem = key ;
            }
        }
        return keyitem;
        
    }
}