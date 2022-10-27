import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {


public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.0000");
        double x1,x2,y1,y2;
        x1 = leia.nextFloat();
        y1 = leia.nextFloat();
        x2 = leia.nextFloat();
        y2 = leia.nextFloat();
        x1 = Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2);
        System.out.println(formatador.format(Math.sqrt(x1)));
        leia.close();
    }
    
}
