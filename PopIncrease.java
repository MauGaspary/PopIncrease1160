import java.util.Scanner;

public class PopIncrease {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        int T = 0, pa = 0, pb = 0;
        double g1 = 0, g2 = 0;

        do{
            System.out.println("Informe o número de testes a realizar:");
            T = in.nextInt();
        }while ((T < 1 &&  T > 3000));

        for (int i=1; i<= T; i++){
           do {
                System.out.println("Informe a população da cidade A:");
                pa = in.nextInt();
            }while (pa < 100 || pa > 1000000);
    
            do {
                System.out.println("Informe a população da cidade B:");
                pb = in.nextInt();
            }while (pb < 100 || pb > 1000000 && pa < pb);
    
            do {
                System.out.println("Informe a porcentagem de crescimento da população da cidade A:");
                g1 = in.nextDouble();
            }while (g1 < 0.1 || g1 > 10.0);
    
            do{
                System.out.println("Informe a porcentagem de crescimento da população da cidade B:");
                g2 = in.nextDouble();
            }while (g2 < 0.0 || g2 > 10.0 && g2 > g1);

            int cont = 0;
            g1 = g1/100;
            g2 = g2/100;

            while (pa<=pb) {
                pa += (int) (pa * g1);
                pb += (int) (pb * g2);
                cont ++;
            }
            
            if (cont > 100){
                System.out.println("Mais de 1 seculo");
            }
            else System.out.println(cont + " anos.");
        }
    }
}
