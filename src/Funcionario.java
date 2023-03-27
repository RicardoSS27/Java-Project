public class Funcionario {
    private String nome;
    private String cpf;
    protected double salario;
    private int cargo = 0; //Funcionario 0 - Comum, 1 - Gerente, 2 - Diretor


    public double getBonificacao() { //Funcionario 0 - Comum
        if (this.cargo == 0) {
            return this.salario * 0.1;
        } else if (this.cargo == 1) {//Funcionario 1 - Gerente
            return this.salario;
        } else if (this.cargo == 2) {//Funcionario 2 - Diretor
            return this.salario * 1000.0;
        }
        return 0;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public int getCargo() {
        return cargo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
