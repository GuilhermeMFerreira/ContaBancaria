public class ContaBancaria {

    private String titular;
    private double saldo = 0;
    private double limite;

    public ContaBancaria(String titular, double limite) {
        this.titular = titular;
        this.limite = limite;

    }
    public double getSaldo(){
        return saldo;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        return  true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= (saldo + limite)) {
            saldo -= valor;
        return true;
        }
        return false;
    }
    public String getTitular() {
        return titular;
    }
}

