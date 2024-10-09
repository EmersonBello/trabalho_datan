public class Conta {
    private String agencia;
    private int codigo;
    private String dataDeCriacao;
    private String titular;
    private String senha;
    private double saldo;
    private boolean cancelado;

    public Conta(String agencia, int codigo, String dataDeCriacao, String titular, String senha, double saldo, boolean cancelado) {
        this.agencia = agencia;
        this.codigo = codigo;
        this.dataDeCriacao = dataDeCriacao;
        this.titular = titular;
        this.senha = senha;
        this.saldo = saldo;
        this.cancelado = cancelado;
    }

    public void retirar(double quantia) {
        if (quantia > 0 && quantia <= this.saldo) {
            this.saldo -= quantia;
        }
    }

    public void depositar(double quantia) {
        if (quantia > 0) {
            this.saldo += quantia;
        }
    }

    public double obterSaldo() {
        return this.saldo;
    }

    /*
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(String dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    } */
}
