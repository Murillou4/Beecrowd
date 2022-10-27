import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {


public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.000");
        int x,y;
        x = leia.nextInt();
        y = leia.nextInt();
        x = x*y;
        System.out.println(formatador.format((float)(x/12.0)));
        leia.close();
    }
    
}
