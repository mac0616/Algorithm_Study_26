import java.lang.*;
class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        for(int i = 0; i<queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            String substr = sb.substring(start, end+1);
            StringBuilder resubstr = new StringBuilder(substr).reverse();
            sb.replace(start, end+1, resubstr.toString());
        }
        String answer = sb.toString();
        return answer;
    }
}