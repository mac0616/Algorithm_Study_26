import java.util.*;;

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        String[] strArr = my_string.split("");
        List<String> list = new ArrayList<>();
        
        for (int idx : index_list){
            list.add(strArr[idx]);
        }
        answer = String.join("", list);        
        return answer;
    }
}