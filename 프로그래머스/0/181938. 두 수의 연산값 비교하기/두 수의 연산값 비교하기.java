class Solution {
    public int solution(int a, int b) {
        String str = String.valueOf(a) + String.valueOf(b);
        int val1 = Integer.parseInt(str);
        int val2 = 2 * a * b;
        return Math.max(val1, val2);
    }
}