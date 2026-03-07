class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<my_strings.length; i++){
            String part = my_strings[i].substring(parts[i][0], parts[i][1] +1);
            sb.append(part);
        }
        return sb.toString();
    }
}