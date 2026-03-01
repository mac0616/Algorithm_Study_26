import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        
        for(int i = 0; i<n; i++){
            boolean s = true;
            int num = sc.nextInt();
            
            if(num == 1){
                continue;
            }
            for(int j = 2; j<=Math.sqrt(num); j++){
                if(num%j==0){
                    s = false;
                    break;
                }
            }
            if(s){
                count++;
            }
        }
        System.out.println(count);
    }
}