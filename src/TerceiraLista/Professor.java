package TerceiraLista;

public class Professor extends Funcionario{
    private String[] disciplinas;
    private String[] turma;

    public Professor(String nome, String cpf, String rg, double salario, String[] disciplinas, String[] turma) {
        super(nome, cpf, rg, salario, "Professor");
        this.disciplinas = disciplinas;
        this.turma = turma;
    }
    public void updateProfessor(String nome, String cpf, String rg, double salario, String[] disciplinas, String[] turma) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
        this.disciplinas = disciplinas;
        this.turma = turma;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String[] getTurma() {
        return turma;
    }

    public void setTurma(String[] turma) {
        this.turma = turma;
    }
}
