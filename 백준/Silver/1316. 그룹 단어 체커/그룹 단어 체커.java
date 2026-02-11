import java.util.*;
public class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int count = 0;
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            if(checker() == true){
                count++;
            }
        }
        System.out.println(count);
    }
    
    public static boolean checker(){
        boolean[] checker = new boolean[26];
        int prev=0;
        String str = sc.next();
        for(int i=0; i<str.length(); i++){
            int now = str.charAt(i);
            if(prev != now){
                if(checker[now - 'a'] == false){
                    checker[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            } else{
                continue;
            }
        }
        return true;
    }
}