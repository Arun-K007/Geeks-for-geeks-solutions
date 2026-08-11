class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        int  count  = 0;
        Set<Integer> set = new HashSet<>();
        for(int i= 0;i<a.length;i++){
            set.add(a[i]);
          
        }
        for(int i = 0;i<b.length;i++){
            int flag=b[i];
            if(set.contains(flag)){
                count++;
            }
        }
        return count;
    }
}