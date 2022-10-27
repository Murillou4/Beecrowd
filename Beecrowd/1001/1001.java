import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int A = leia.nextInt();
		int B = leia.nextInt();
		int X = A + B;
		
		System.out.printf("X = %d%n", X);
		
		leia.close();
		
	}

}