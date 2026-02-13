import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++){
            int c = sc.nextInt();
            int quarter = c/25;
            c %=25;
            int dime = c/10;
            c%=10;
            int nickel = c/5;
            c%=5;
            int penny = c;
            System.out.println(quarter + " " + dime + " " + nickel +
                               " " + penny);
        }
        sc.close();
    }
}