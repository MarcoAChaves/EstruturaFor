import java.util.Scanner;

public class exercicios6For {
    //Ler um número inteiro N e calcular todos os seus divisores.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fat = 1;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
            sc.close();
        }

    }
}