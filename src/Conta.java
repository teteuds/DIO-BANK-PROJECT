public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1435;
    private static int SEQUENCIAL = 001;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor; 
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        
    }

    protected void imprimirInformacoes(){

        System.out.println(String.format("TITULAR %s", this.cliente.getNome()));
        System.out.println(String.format("AGENCIA: %d", this.agencia));
        System.out.println(String.format("CONTA: %d", this.numeroConta));
        System.out.println(String.format("SALDO: %.2f", this.saldo));

        System.out.println("*** ---------------------- ***\n");
    }

}
