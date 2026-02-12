import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean arr[][] = new boolean[101][101];
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j=0; j<10; j++){
                for(int k=0; k<10; k++){
                    if(!arr[x+j][y+k]){
                        arr[x+j][y+k] = true;
                        sum +=1;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}