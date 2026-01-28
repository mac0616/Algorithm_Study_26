import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
		int m= 60*a+b;
        m +=c;
        
        int h=(m/60)%24;
        int minute = m  %60;
        System.out.println(h + " " + minute);
        
    }
}