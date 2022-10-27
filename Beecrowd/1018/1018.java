import java.util.Scanner;
public class Main {


public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int x[] = new int[8];
        int n;
        n = leia.nextInt();
        x[0] = n;
        x[1] = x[0]/100;
        // Remover quantidade já calculada
        x[0] = x[0] - (x[1]*100);
        x[2] = x[0]/50;
        // Remover quantidade já calculada
        x[0] = x[0] - (x[2]*50);
        x[3] = x[0]/20;
        // Remover quantidade já calculada
        x[0] = x[0] - (x[3]*20);
        x[4] = x[0]/10;
        // Remover quantidade já calculada
        x[0] = x[0] - (x[4]*10);
        x[5] = x[0]/5;
        // Remover quantidade já calculada
        x[0] = x[0] - (x[5]*5);
        x[6] = x[0]/2;
        // Remover quantidade já calculada
        x[0] = x[0] - (x[6]*2);
        x[7] = x[0]/1;
        System.out.println(n + "\n" + x[1] + " nota(s) de R$ 100,00\n"
        +x[2] + " nota(s) de R$ 50,00\n"
        +x[3] + " nota(s) de R$ 20,00\n"
        +x[4] + " nota(s) de R$ 10,00\n"
        +x[5] + " nota(s) de R$ 5,00\n"
        +x[6] + " nota(s) de R$ 2,00\n"
        +x[7] + " nota(s) de R$ 1,00");
        leia.close();
    }
    
}
