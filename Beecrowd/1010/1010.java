import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
          DecimalFormat formatador = new DecimalFormat("0.00");
          Scanner leia = new Scanner(System.in);
          int C =  leia.nextInt();
          float V = leia.nextFloat();
          V = leia.nextFloat()*V;
          C=leia.nextInt();
          float V2 = leia.nextFloat();
          V2 = V2*leia.nextFloat();
          System.out.println("VALOR A PAGAR: R$ " + formatador.format(V2+V));
    }
    
}
