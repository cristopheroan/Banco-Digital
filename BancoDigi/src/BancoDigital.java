public class BancoDigital {

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(12345);
        Cliente cliente1 = new Cliente("Cristopher", conta1);

        cliente1.realizarDeposito(1000);
        cliente1.realizarSaque(500);

        cliente1.imprimirExtrato();
    }
    
}