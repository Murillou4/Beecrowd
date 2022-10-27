import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.0");
	    int A = leia.nextInt();
	    A = A*leia.nextInt();
	    int B = leia.nextInt();
	    B = B*leia.nextInt();
	    System.out.println("DIFERENCA = "+ (A-B));
	    
	    
		leia.close();
		
	}

}