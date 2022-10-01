
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //Exercicio a (convertendo real (a) em inteiro (b) e vice-versa)

        double a = 149.866;
        int b;

        b = (int) a;

        System.out.println("O valor em inteiros: " + b);

        int c = 9;

        double d = c;

        System.out.println("O valor em reais: " + d);

        //Exercicio b (numero de digitos)
        Scanner scanner = new Scanner (System.in);
        int x;
        int quantosDigitos = 1;

        System.out.println("Digite um numero: ");
        x = scanner.nextInt();

        while (x >= 10) {
            x /= 10;
            quantosDigitos++;
        }

        System.out.println("O numero de digitos é: " + quantosDigitos);

    }
}

