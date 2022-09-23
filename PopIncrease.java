import java.util.Scanner;

public class PopIncrease {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        int T, pa, pb;
        double g1, g2;

        System.out.println("Informe o número de testes a realizar:");
        T = in.nextInt();
        if (T >= 1 &&  T <= 3000) {
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
                g1 = in.nextInt();
            }while (g1 < 0.1 || g1 > 10.0);
    
            do{
                System.out.println("Informe a porcentagem de crescimento da população da cidade B:");
                g2 = in.nextInt();
            }while (g2 < 0.0 || g2 > 10.0 && g2 > g1);
    
            System.out.println(pa +" "+ pb +" "+ g1 +" "+ g2);
        }
    }
}