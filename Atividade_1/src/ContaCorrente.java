public class ContaCorrente {
    private double saldo;
    private double taxaOperacao;

    public ContaCorrente() {
        this.saldo = 0;
        this.taxaOperacao = 0.005;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        double taxa = valor * taxaOperacao;
        saldo -= valor + taxa;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaOperacao() {
        return taxaOperacao;
    }
}