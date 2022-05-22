package TerceiraLista;

public class Funcionario extends Pessoa{
    protected double salario;
    protected String cargo;

    public Funcionario(String nome, String cpf, String rg, double salario, String cargo) {
        super(nome, cpf, rg);
        this.salario = salario;
        this.cargo = cargo;
    }
    public void updateFuncionario(String nome, String cpf, String rg, double salario, String cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
