import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        int a = 1;
        
        for(int i=0; i<len/2; i++){
            if(str.charAt(i) != str.charAt(len-1-i)){
                a = 0;
            }
        }
        System.out.println(a);
    }
}