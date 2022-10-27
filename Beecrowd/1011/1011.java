import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
          DecimalFormat formatador = new DecimalFormat("0.000");
          Scanner leia = new Scanner(System.in);
          double R = leia.nextDouble();
          System.out.println("VOLUME = " + formatador.format(4/3.0*3.14159*(R*R*R)));
          
    }
    
}
