import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = 0;
        
        for(int i=0; i<b; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            total += x*y;
        }
        if(total ==a){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}