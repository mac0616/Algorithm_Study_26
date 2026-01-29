import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        
        for(int i=0; i<a; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[i] = x+y;
        }
        
        for(int j : arr){
            System.out.println(j);
        }
    }
}