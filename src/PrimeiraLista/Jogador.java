package PrimeiraLista;

import java.time.LocalDate;
import java.util.Random;

public class Jogador {
    int id;
    String nome;
    String apelido;
    LocalDate dataNascimento;
    int numero;
    String posicao;
    int qualidade;
    int cartaoAmarelo;
    int cartaoVermelho;
    Boolean suspenso;
    int jogou;

    public Jogador(int id, String nome, String apelido, LocalDate dataNascimento, int numero, String posicao,
                   int qualidade, int cartaoAmarelo, int cartaoVermelho) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartaoAmarelo = cartaoAmarelo;
        this.cartaoVermelho = cartaoVermelho;
        this.suspenso = condicaoDeJogo();
    }

    public Jogador() {
    }

    boolean condicaoDeJogo() {
        if (cartaoAmarelo >= 3 || cartaoVermelho > 0) {
            return true;
        }
        return false;
    }

    public void addCartaoAmarelo(int quantidade) {
        this.cartaoAmarelo = cartaoAmarelo + quantidade;
        this.suspenso = condicaoDeJogo();
    }

    public void addCartaoVermelho(int quantidade) {
        this.cartaoVermelho = cartaoVermelho + quantidade;
        this.suspenso = condicaoDeJogo();
    }

    public void cumprirSuspencao() {
        suspenso = false;
        cartaoVermelho = 0;
        cartaoAmarelo = 0;
    }

    public void sofrerLesao() {
        Random random = new Random();
        int probabilidadePerdaQualidade = random.nextInt(100);
        if (probabilidadePerdaQualidade <= 4) {
            qualidade = (int) (qualidade - (qualidade * 0.15));
        } else if (probabilidadePerdaQualidade <= 14) {
            qualidade = (int) (qualidade - (qualidade * 0.10));
        } else if (probabilidadePerdaQualidade <= 29) {
            qualidade = (int) (qualidade - (qualidade * 0.05));
        } else if (probabilidadePerdaQualidade <= 59) {
            if (qualidade <= 2) {
                qualidade -= 2;
            }
        } else {
            if (qualidade <= 1) {
                qualidade -= 1;
            }
        }
    }

    public void executarTreinamento() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(2) + 1;
        if (jogou == 0) {
            qualidade += numeroAleatorio;
            jogou++;
        }
    }

    @Override
    public String toString(){
        if (!suspenso && cartaoAmarelo < 3 && cartaoVermelho == 0) {
            return posicao + ": " + id + " - " + nome + " ("+ apelido +") " + " - " + dataNascimento + " CONDIÇÃO: PODE JOGAR";
        }
        return posicao + ": " + id + " - " + nome + " ("+ apelido +") " + " - " + dataNascimento + " CONDIÇÃO: NÃO PODE JOGAR";
    }
}
