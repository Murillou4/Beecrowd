import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00000");
	    double A = leia.nextDouble()*3.5;
	    double B = leia.nextDouble()*7.5;
	    System.out.println("MEDIA = "+ formatador.format((B+A)/11));
	    
		leia.close();
		
	}

}