public abstract class Conta implements IConta {

    private static final int STANDARD_AGENCY = 1;

    protected int agency;
    protected int account;
    protected int balance;

    private static int SEQUENTIAL = 1;

    public Conta() {
        this.agency = Conta.STANDARD_AGENCY;
        this.account = SEQUENTIAL++;
    }

    @Override
    public void withdraw(double valor) {

    }

    @Override
    public void deposit(double valor) {

    }

    @Override
    public void transfer(double valor, Conta contaDestino) {

    }


    public int getAgency() {
        return agency;
    }

    public int getAccount() {
        return account;
    }

    public int getBalance() {
        return balance;
    }


}

