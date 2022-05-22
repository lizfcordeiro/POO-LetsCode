package TerceiraLista;

import java.util.Arrays;

public class Questao1 {
    public static void main(String[] args) {
    Aluno andre = new Aluno("Andre","02556347800", "20047080193", 25, "Primeira Turma", Arrays.asList(8.5d, 5d, 10d, 9.5d, 7.5d));
    andre.mediaNotas();
    }
}
