public class Conta implements IConta {

    private int agency;
    private int account;
    private int balance;

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

