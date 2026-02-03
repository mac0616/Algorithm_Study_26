import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        for(int i=1; i<=a; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println("Case #" + i + ": " + x+ " + " + y + " = " + (x+y));
        }
    }
}