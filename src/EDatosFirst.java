import java.util.Scanner;

public class EDatosFirst {

    public static void main(String[] args) {

        float T = 1;
        float x;
        float factorial1 = 1;
        int deci = 1, contador = 1;

        System.out.println("Dame un numero: ");
        Scanner leer = new Scanner(System.in);

        x = leer.nextInt();

        for (int i = 0; i < x; i++) {

            for (int j = 0; j < 1; j++) {

                factorial1 = factorial1 * contador;

                if (deci == 1) {

                    T = T - ((float) Math.pow(x, x)) / factorial1;
                    deci = 0;

                } else {

                    T = T + ((float) Math.pow(x, x) / factorial1);
                    deci = 1;

                }

                System.out.println("T = " + T);

                contador++;

            }

        }

    }
}
