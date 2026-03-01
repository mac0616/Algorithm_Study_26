import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = -1;
		
		while(true){
			N = sc.nextInt();
			if(N == -1) break;
			
			List <Integer> list = new ArrayList<>();
			int sum = 0;
			for(int i = 1; i < N; i++) {
				if(N % i == 0) {
					sum += i;
					list.add(i);
				}
			}
			
			if(sum == N) {
				System.out.print(N + " = ");
				for(int i = 0; i < list.size(); i++) {
					System.out.print(list.get(i));
					if(i + 1 < list.size())
						System.out.print(" + ");
					else
						System.out.println();
				}
			}
			else
				System.out.println(N + " is NOT perfect.");
		}
	}
}