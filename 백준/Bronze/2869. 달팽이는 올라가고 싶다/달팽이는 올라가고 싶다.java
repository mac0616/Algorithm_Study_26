import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int up = sc.nextInt();
        int down = sc.nextInt();
        int len = sc.nextInt();
        int day = (len -down) / (up - down);
        if((len-down) % (up-down) != 0){
            day++;
        }
        System.out.println(day);
    }
}