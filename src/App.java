public class App {
    public static void main(String[] args) throws Exception {

        Cliente mateus = new Cliente();
        mateus.setNome("Mateus");

        Conta cc = new ContaCorrente(mateus);
        Conta cp = new ContaPoupanca(mateus);

        cc.depositar(100);
        cc.sacar(20);

        cp.depositar(50);
        cp.sacar(10);

        cc.transferir(50, cp);

        cc.imprimeExtrato();
        cp.imprimeExtrato();
    }
}
