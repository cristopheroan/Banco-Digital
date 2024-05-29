public class Cliente {
    private static final double valor = 0;
    private String nome;
    private ContaBancaria conta;

    public Cliente(String nome, ContaBancaria conta) {
        this.nome = nome;
        this.conta = conta;
    }
    
    public void realizarDeposito(double valor) {
        conta.depositar(valor);
    }

    public void realizarSaque(double valor) {
        conta.sacar(valor);
    }

    public void imprimirExtrato() {
        conta.imprimirExtrato();
    }

    public void realizarSaque() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'realizarSaque'");
    }

}