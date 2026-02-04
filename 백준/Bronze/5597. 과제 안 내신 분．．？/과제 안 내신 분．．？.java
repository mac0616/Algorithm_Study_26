import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] stu = new int[31];
        
        for(int i=1; i<29; i++){
            int submit = sc.nextInt();
            stu[submit] = 1;
        }
        for (int j=1; j<stu.length; j++){
            if(stu[j]!=1) System.out.println(j);
        }
    }
}