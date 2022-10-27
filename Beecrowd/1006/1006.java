import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.0");
	    float A = leia.nextFloat()*2;
	    float B = leia.nextFloat()*3;
	    A=A+B;
	    B = leia.nextFloat()*5;
	    System.out.println("MEDIA = "+ formatador.format((A+B)/10));
		leia.close();
		
	}

}