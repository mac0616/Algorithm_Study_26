import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str = "";
        
        for(int i=1; i<=a/4; i++){
            str += "long ";
        }
        System.out.println(str + "int");
    }
}