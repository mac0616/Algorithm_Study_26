import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(n);
        while(n != 1){
            if(n%2==0){
                n = n/2;
            } else {
                n = n*3+1;
            }
            arr.add(n);
        }
        return arr;
    }
}