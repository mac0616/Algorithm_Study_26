import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        
        for(int x=0; x<M; x++){
            int i=sc.nextInt();
            int j=sc.nextInt();
            int k=sc.nextInt();
            
            for(int y=i; y<=j; y++){
                arr[y-1] = k;
            }
        }
        
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}