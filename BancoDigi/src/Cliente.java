public class Cliente {
    private String nome;
    private ContaBancaria conta;

    public Cliente(String nome, ContaBancaria conta) {
        this.nome = nome;
        this.conta = conta;
    }
    
    public void realizarDeposito(double valor) {
        conta.depositar(valor);
    }

    public void realizarSaque() {
        conta.sacar(valor);
    }

    public void imprimirExtrato() {
        conta.imprimirExtrato();
    }

}