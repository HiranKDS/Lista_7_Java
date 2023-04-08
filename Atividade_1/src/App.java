public class App {
    public static void main(String[] args) throws Exception {
        ContaCorrente cc1 = new ContaCorrente();
        cc1.depositar(2000);
        cc1.sacar(1000);
        System.out.println("Saldo da conta corrente: " + cc1.getSaldo());
        System.out.println("Taxa de operação da conta corrente: " + cc1.getTaxaOperacao());
    
        ContaCorrenteEspecial cce1 = new ContaCorrenteEspecial();
        cce1.depositar(2000);
        cce1.sacar(1000);
        System.out.println("Saldo da conta corrente especial: " + cce1.getSaldo());
        System.out.println("Taxa de operação da conta corrente especial: " + cce1.getTaxaOperacao());
    }
}
