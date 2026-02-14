import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;
        int y=1;
        int a =0, b=0;

        while(count < x){
            count = count + y;
            y++;
        }
        if((y-1)%2==0){
            a = 1 + (count-x);
            b = (y-1) - (count-x);
        } else {
            a = (y-1) - (count-x);
            b = 1 + (count-x);
        }
        System.out.println(b + "/" + a);
    }
}