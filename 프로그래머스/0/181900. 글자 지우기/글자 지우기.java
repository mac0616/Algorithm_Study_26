class Solution {
    public String solution(String myString, int[] indices) {
        boolean[] deleted = new boolean[myString.length()];
        
        for (int index : indices) {
            deleted[index] = true;
        }
        
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < myString.length(); i++) {
            if (!deleted[i]) {
                answer.append(myString.charAt(i));
            }
        }
        
        return answer.toString();
    }
}