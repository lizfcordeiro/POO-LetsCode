package QuartaLista;

public class Vampiro implements Inimigo{
    @Override
    public void ataque() {
        System.out.println("causou 20 de dano");
        System.out.println("seu personagem está sangrando");
    }
    @Override
    public void apanhar(String tipoDano, double dano) {
        if (tipoDano.equals("perfurante")) {
            System.out.println("recebeu " + (dano*2) + " de dano");
        } else {
        System.out.println("recebeu " + (dano) + " de dano");
        }
    }
    @Override
    public void interagir() {
        System.out.println("O que é um homem?");
    }
}
