import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {


public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.000");
        int x;
        float y;
        x = leia.nextInt();
        y = leia.nextFloat();
        System.out.println(formatador.format(x/y) + " km/l");
        leia.close();
    }
    
}
