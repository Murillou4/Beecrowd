import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int A = leia.nextInt();
		A = A + leia.nextInt();
	    System.out.println("SOMA = "+ A);
		leia.close();
		
	}

}