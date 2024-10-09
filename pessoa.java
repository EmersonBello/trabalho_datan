public class Pessoa {
    private int codigo;
    private String nome;
    private double altura;
    private int idade;
    private String nascimento;
    private String escolaridade;
    private double salario;

    public Pessoa(int codigo, String nome, double altura, int idade, String nascimento, String escolaridade, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.nascimento = nascimento;
        this.escolaridade = escolaridade;
        this.salario = salario;
    }

    public void crescer(double centimetros) {
        if (centimetros > 0) {
            this.altura += centimetros;
        }
    }

    public void formar(String titulacao) {
        this.escolaridade = titulacao;
    }

    public void envelhecer(int anos) {
        if (anos > 0) {
            this.idade += anos;
        }
    }

    /*Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    } */
}
