public abstract class Conta implements IConta {

    private static final int STANDARD_AGENCY = 1;

    protected int agency;
    protected int account;
    protected double balance;

    private static int SEQUENTIAL = 1;

    public Conta() {
        this.agency = Conta.STANDARD_AGENCY;
        this.account = SEQUENTIAL++;
    }

    @Override
    public void withdraw(double valor) {
        balance = balance - valor;

    }

    @Override
    public void deposit(double valor) {
        balance = balance + valor;

    }

    @Override
    public void transfer(double valor, Conta contaDestino) {
        this.withdraw(valor);
        contaDestino.deposit(valor);

    }

    protected void descontarGastos(Gastos gastos) {
        double total = gastos.getFeeding() + gastos.getEducation()
                + gastos.getMobility() + gastos.getLeisure();
        balance = balance - total;
    }

    protected void mostrargastosCC(Gastos gastos) {

        System.out.println();
        System.out.println("==== Gastos da conta corrente =====");
        System.out.println("Alimentação: " + gastos.getFeeding());
        System.out.println("Educação: " + gastos.getEducation());
        System.out.println("Mobilidade: " + gastos.getMobility());
        System.out.println("Lazer: " + gastos.getLeisure());
    }

    protected void imprimirInfosComuns() {
        System.out.printf("Agencia: %d%n", this.agency);
        System.out.printf("Conta: %d%n", this.account);
        System.out.printf("Saldo: %.2f%n", this.balance);

    }

    protected void imprimirSaldoAposGastosCC() {
        System.out.println();
        System.out.printf("Saldo da conta correte após os gastos: %.2f%n", this.balance);
    }
}

