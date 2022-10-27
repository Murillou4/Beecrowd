import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
          DecimalFormat formatador = new DecimalFormat("0.000");
          Scanner leia = new Scanner(System.in);
          int A,B,C;
          A=leia.nextInt();
          B=leia.nextInt();
          C=leia.nextInt();
          A=(A+B+Math.abs(A-B))/2;
          A=(A+C+Math.abs(A-C))/2;
          System.out.println(A+" eh o maior");
          
    }
    
}
