import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[][] N = new int[A][B];
        int[][] M = new int[A][B];
        
        for(int i=0; i<A; i++){
            for(int j=0; j<B; j++){
                N[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<A; i++){
            for(int j=0; j<B; j++){
                M[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0; i<A; i++){
            for(int j=0; j<B; j++){
                System.out.print(N[i][j] + M[i][j] + " ");
                if(j==B -1) System.out.println();
            }
        }
    }
}