class Solution {
    public int distance(int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;

        return (int) Math.round(Math.sqrt(dx * dx + dy * dy));
    }
}