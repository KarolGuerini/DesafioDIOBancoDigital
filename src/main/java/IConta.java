public interface IConta {

    void withdraw(double valor);

    void deposit(double valor);

    void transfer(double valor, Conta contaDestino);

    void imprimirExtrato();

}
