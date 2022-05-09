package PrimeiraLista;

import java.time.LocalDate;

public class Questao1 {
    public static void main(String[] args) {
        Jogador[] time = new Jogador[11];

        time[0] = new Jogador(1, "Jogador 1", "Um", LocalDate.of(1996, 1, 1), 1, "Atacante", 3, 0, 0);
        time[1] = new Jogador(2, "Jogador 2", "Dois", LocalDate.of(1996, 2, 2), 2, "Atacante", 3, 0, 0);
        time[2] = new Jogador(3, "Jogador 3", "Três", LocalDate.of(1996, 3, 3), 3, "Meio campo", 3, 0, 0);
        time[3] = new Jogador(4, "Jogador 4", "Quatro", LocalDate.of(1996, 4, 4), 4, "Meio campo", 3, 0, 0);
        time[4] = new Jogador(5, "Jogador 5", "Cinco", LocalDate.of(1996, 5, 5), 5, "Meio campo", 3, 0, 0);
        time[5] = new Jogador(6, "Jogador 6", "Seis", LocalDate.of(1996, 6, 6), 6, "Meio campo", 3, 0, 0);
        time[6] = new Jogador(7, "Jogador 7", "Sete", LocalDate.of(1996, 7, 7), 7, "Zagueiro", 3, 0, 0);
        time[7] = new Jogador(8, "Jogador 8", "Oito", LocalDate.of(1996, 8, 8), 8, "Zagueiro", 3, 0, 0);
        time[8] = new Jogador(9, "Jogador 9", "Nove", LocalDate.of(1996, 9, 9), 9, "lateral direita", 3, 0, 0);
        time[9] = new Jogador(10, "Jogador 10", "Dez", LocalDate.of(1996, 10, 10), 10, "Lateral esquerda", 3, 0, 0);
        time[10] = new Jogador(11, "Jogador 11", "Onze", LocalDate.of(1996, 11, 11), 11, "Goleiro", 3, 0, 0);

        for (int i = 0; i < 11; i++) {
            System.out.println(time[i]);
        }
    }
}
