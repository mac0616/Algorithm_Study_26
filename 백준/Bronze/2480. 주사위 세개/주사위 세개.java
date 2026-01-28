import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
		
        if (a==b && b==c){
            System.out.println(10000+(a)*1000);
        } else if (a==b || a==c){
            System.out.println(1000+(a)*100);
        } else if (c==b){
            System.out.println(1000+(c)*100);
        } else if (a!= b && b!=c && a!=c){
            int max;
            if (a>b){
                if(c>a){
                    max=c;
                } else {
                    max=a;
                }
            }else {
                if(c>b){
                    max=c;
                } else{
                    max=b;
                }
            }
            System.out.println(max*100);
        }
    }
}