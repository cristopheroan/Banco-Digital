import java.util.ArrayList;

public class ContaBancaria {
   private int numeroConta;
   private double saldo;
   private ArrayList<Transacao> transacoes;

   public ContaBancaria(int numeroConta) {
    this.numeroConta = numeroConta;
    this.saldo = 0.0;
    this.transacoes = new ArrayList<>();
   }

   public void depositar(double valor) {
    saldo += valor;
    transacoes.add(new transacoes("Deposito", valor));
   }

   public void sacar(double valor) {
    if (saldo >= valor) {
        saldo -= valor;
        transacoes.add(new transacoes("Saque", -valor));
    } else {
        System.err.println("Saldo insuficiente");
    }
   }

   public getSaldo() {
    return saldo;
   }

   public void imprimirExtrato() {
    System.out.println("Extrato da Conta: " + numeroConta);
    for(Transacao transacao : transacoes) {
        System.out.println(transacao);
    }
    System.out.println("Saldo atual: " + saldo);
   }
    
}
