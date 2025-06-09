public class InfoCliente {

      public String nome;
      public String agencia;
      public int conta;
      public double saldo;

      public InfoCliente(String nome, String agencia, int conta, double saldo) {
            this.nome = nome;
            this.agencia = agencia;
            this.conta = conta;
            this.saldo = saldo;
      }

      public InfoCliente() {

      }

      public String getNome() {
            return nome;
      }

      public void setNome() {
            this.nome = nome;
      }

      public String getAgencia() {
            return agencia;
      }

      public void setAgencia() {
            this.agencia = agencia;
      }

      public int getConta() {
            return conta;
      }

      public void setConta() {
      }

      public double getSaldo() {
            return saldo;
      }

      public void setSaldo() {
      }

      public void mensagem(){
            System.out.println("Olá " + getNome());
            System.out.println("Conta: " + getConta() + "\n" +
                              "Agência: " + getAgencia() + "\n" +
                              "Saldo: " + getSaldo());
      }
}
