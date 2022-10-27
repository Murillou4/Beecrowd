import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		String N = leia.nextLine();
	    double A = leia.nextDouble();
	    A=A+ 0.15*leia.nextDouble();
	    System.out.println("TOTAL = R$ " + formatador.format(A));
	    
	    
		leia.close();
		
	}

}