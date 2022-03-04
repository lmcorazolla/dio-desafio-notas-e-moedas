import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double N;
        int  resto;
        do {
            N = Double.parseDouble(sc.next());
        } while (N <= 0 || N > 1000000);

        resto = (int) (N * 100.0 + 0.5);

        System.out.println("NOTAS:");

        calcularNotas(resto, 100);
        resto %= (100*100);

        calcularNotas(resto, 50);
        resto %= (50*100);

        calcularNotas(resto, 20);
        resto %= (20*100);

        calcularNotas(resto, 10);
        resto %= (10*100);

        calcularNotas(resto, 5);
        resto %= (5*100);

        calcularNotas(resto, 2);
        resto %= (2*100);

        System.out.println("MOEDAS:");

        calcularMoedas(resto, 100);
        resto %=100;

        calcularMoedas(resto, 50);
        resto %=50;

        calcularMoedas(resto, 25);
        resto %=25;

        calcularMoedas(resto, 10);
        resto %=10;

        calcularMoedas(resto, 5);
        resto %=5;

        System.out.println(resto + " moeda(s) de R$ 0.01");
        sc.close();
    }
    static void calcularNotas(int resto, int nota){
        int quociente = resto / (nota * 100);
        System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
    }
    static void calcularMoedas(int resto, int moeda){
        int quociente = resto / moeda;
        double moedaDouble = moeda;
        System.out.println(quociente + " moeda(s) de R$ "+ String.format("%.2f", (moedaDouble)));
    }
}
