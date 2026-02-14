import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 2;
        for(int i=1; i<=n; i++){
            a = (a-1) + a;
        }
        System.out.println(a*a);
    }
}