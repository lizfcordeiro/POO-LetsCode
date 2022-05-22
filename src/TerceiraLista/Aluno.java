package TerceiraLista;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{
    private int idade;
    private String turma;
    private List<Double> notas = new ArrayList<>();

    public Aluno(String nome, String cpf, String rg, int idade, String turma, List<Double> notas) {
        super(nome, cpf, rg);
        this.idade = idade;
        this.turma = turma;
        this.notas = notas;
    }
    public void updateAluno(String nome, String cpf, String rg, int idade, String turma, List<Double> notas) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.idade = idade;
        this.turma = turma;
        this.notas = notas;
    }

    public void mediaNotas(){
        double media = notas.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        System.out.println(media);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }
}
