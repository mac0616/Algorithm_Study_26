class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        
        int last1 = num_list[num_list.length - 1]; 
        int last2 = num_list[num_list.length - 2];

        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[i];
        }
        if (last1 > last2) {
            answer[num_list.length] = last1 - last2;
        } else {
            answer[num_list.length] = last1 * 2;
        }
        
        return answer;
    }
}