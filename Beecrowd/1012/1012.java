import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
          DecimalFormat formatador = new DecimalFormat("0.000");
          Scanner leia = new Scanner(System.in);
          double A,B,C;
          A= leia.nextDouble();
          B= leia.nextDouble();
          C= leia.nextDouble();
          System.out.println("TRIANGULO: " + formatador.format((A*C)/2.0));
          System.out.println("CIRCULO: " + formatador.format(C*C*3.14159));
          System.out.println("TRAPEZIO: " + formatador.format(((A+B)*C)/2.0));
          System.out.println("QUADRADO: " + formatador.format(B*B));
          System.out.println("RETANGULO: " + formatador.format(A*B));
          
    }
    
}
