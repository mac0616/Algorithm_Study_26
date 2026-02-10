import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int king = 1;    int queen = 1;
		int rook = 2;    int bishop = 2;    int night = 2;
		int pawn = 8;
        
        king = king-sc.nextInt();
        queen = queen-sc.nextInt();
        rook = rook-sc.nextInt();
        bishop = bishop-sc.nextInt();
        night = night-sc.nextInt();
        pawn = pawn-sc.nextInt();
        System.out.println(king + " " + queen + " " + rook + " " +
                          bishop + " " + night + " " + pawn);
    }
}