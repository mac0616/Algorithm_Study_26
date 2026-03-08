class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String a = "";
        if(s!=0){
            a = my_string.substring(0, s);
        }
        String b = "";
        if(e+1 <= my_string.length() - 1){
            b = my_string.substring(e+1);
        }
        
        String c = my_string.substring(s, e+1);
        String re = "";
        for(int i=c.length()-1; i>=0; i--){
            re = re + c.charAt(i);
        }
        answer = a + re+b;
        
        return answer;
    }
}