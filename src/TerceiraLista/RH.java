package TerceiraLista;

import java.util.ArrayList;
import java.util.List;

public class RH {
    private List<Aluno> alunoList = new ArrayList<>();
    private List<Funcionario> funcionarioList = new ArrayList<>();
    private List<Professor> professorList = new ArrayList<>();

    public void adicionarAluno(String nome, String cpf, String rg, int idade, String turma, ArrayList<Double> notas) {
        Aluno aluno = new Aluno(nome, cpf, rg, idade, turma, notas);
        alunoList.add(aluno);
    }

    public void adicionarFuncionario(String nome, String cpf, String rg, double salario, String cargo) {
        Funcionario funcionario = new Funcionario(nome, cpf, rg, salario, cargo);
        funcionarioList.add(funcionario);
    }

    public void adicionarProfessor(String nome, String cpf, String rg, double salario, String[] disciplinas, String[] turma) {
        Professor professor = new Professor(nome, cpf, rg, salario, disciplinas, turma);
        professorList.add(professor);
    }

    public void updateAluno(String nome, String novoNome, String cpf, String rg, int idade, String turma, ArrayList<Double> notas) {
        for (Aluno aluno : alunoList) {
            if (aluno.getNome().equals(nome)) {
                aluno.updateAluno(nome, cpf, rg, idade, turma, notas);
            }
        }
    }

    public void updateProfessor(String nome, String cpf, String rg, double salario, String[] disciplinas, String[] turma) {
        for (Professor professor : professorList) {
            if (professor.getNome().equals(nome)) {
                professor.updateProfessor(nome, cpf, rg, salario, disciplinas, turma);
            }
        }
    }

    public void updateFuncionario(String nome, String cpf, String rg, double salario, String cargo) {
        for (Funcionario funcionario : funcionarioList) {
            if (funcionario.getNome().equals(nome)) {
                funcionario.updateFuncionario(nome, cpf, rg, salario, cargo);
            }
        }
    }

    public void deleteAluno(String cpf) {
        Aluno aux = null;
        for (Aluno aluno : alunoList) {
            if (aluno.getCpf().equals(cpf)) {
                aux = aluno;
            }
        }
        if (aux != null) {
            alunoList.remove(aux);
        }
    }

    public void deleteProfessor(String cpf) {
        Professor aux = null;
        for (Professor professor : professorList) {
            if (professor.getCpf().equals(cpf)) {
                aux = professor;
            }
        }
        if (aux != null) {
            professorList.remove(aux);
        }
    }

    public void deleteFuncionario(String cpf) {
        Funcionario aux = null;
        for (Funcionario funcionario : funcionarioList) {
            if (funcionario.getCpf().equals(cpf)) {
                aux = funcionario;
            }
        }
        if (aux != null) {
            professorList.remove(aux);
        }
    }
    public void lerTodosAlunos() {
        for (Aluno aluno : alunoList) {
            System.out.println(aluno);
        }
    }
    public void lerTodosProfessores() {
        for (Professor professor : professorList) {
            System.out.println(professor);
        }
    }
    public void lerTodosFuncionarios() {
        for (Funcionario funcionario : funcionarioList) {
            System.out.println(funcionario);
        }
    }

    public void lerAluno(String nome){
        for (Aluno aluno : alunoList) {
            if (aluno.getNome().equals(nome)) {
                System.out.println(aluno);
            }
        }
    }
    public void lerProfessor(String nome){
        for (Professor professor : professorList) {
            if (professor.getNome().equals(nome)) {
                System.out.println(professor);
            }
        }
    }
    public void lerFuncionario(String nome){
        for (Funcionario funcionario : funcionarioList) {
            if (funcionario.getNome().equals(nome)) {
                System.out.println(funcionario);
            }
        }
    }

    }
