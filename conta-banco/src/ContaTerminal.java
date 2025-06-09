import java.util.Scanner;

public class ContaTerminal {

      public static void main(String[] args) {
            InfoCliente cliente = new InfoCliente();

            cliente.nome = "Maria";
            cliente.agencia = "067-8";
            cliente.conta = 1021;
            cliente.saldo = 237.48;

            cliente.mensagem();
      }
}
