class Solution {
    public int[] find(int l, int b, int h) {
        // code here
        int surface = 2*((b*h)+(h*l)+(l*b));
        int volume = l*b*h;
        int[] sandv= new int[2];
        sandv[0]=surface;
        sandv[1]=volume;
        return sandv;
    }
}