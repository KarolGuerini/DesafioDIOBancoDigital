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


    public int getAgency() {
        return agency;
    }

    public int getAccount() {
        return account;
    }

    public double getBalance() {
        return balance;
    }

    protected void imprimirInfosComuns() {
        System.out.printf("Agencia: %d%n", this.agency);
        System.out.printf("Conta: %d%n", this.account);
        System.out.printf("Saldo: %.2f%n", this.balance);
    }
}

