import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
            var scanner = new Scanner(System.in);
            System.out.println("Informe um valor para saber da tabuada dele: ");
            var number = scanner.nextInt();
            for (int i = 0; i < 11; i++) {System.out.println(number + " x " + i + " = " + number * i);}
            System.out.println("Fim da execução");
      }
}
