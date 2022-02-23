public class Main {

    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente();
        contaCorrente.deposit(2000.0);

        Conta contaPoupanca = new ContaPoupanca();
        contaCorrente.transfer(200, contaPoupanca);


        contaCorrente.imprimirExtrato();

        contaPoupanca.imprimirExtrato();

        Gastos gastosDaConta = new Gastos();
        gastosDaConta.setEducation(100.0);
        gastosDaConta.setFeeding(200.0);
        gastosDaConta.setMobility(300.0);
        gastosDaConta.setLeisure(400.0);


        contaCorrente.descontarGastos(gastosDaConta);
        contaCorrente.mostrargastosCC(gastosDaConta);
        contaCorrente.imprimirSaldoAposGastosCC();


    }
}
