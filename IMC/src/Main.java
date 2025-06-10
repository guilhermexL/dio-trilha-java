import java.util.Locale;
import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
            var scanner = new Scanner(System.in);
            scanner.useLocale(Locale.US);

            System.out.println("Informe o seu peso: ");
            var peso = scanner.nextDouble();

            var resultado =
                    (peso <= 18.5) ? "Abaixo do peso" :
                            (peso <= 24.9) ? "Peso ideal" :
                                    (peso <= 29.9) ? "Levemente acima do peso" :
                                            (peso <= 34.9) ? "Obesidade grau I" :
                                                    (peso <= 39.9) ? "Obesidade grau II (Severa)" :
                                                          "Obesidade grau III (Mórbida)";
                  System.out.println(resultado);
      }
}