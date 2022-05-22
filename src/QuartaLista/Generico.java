package QuartaLista;

public class Generico implements Inimigo{

    @Override
    public void ataque() {
        System.out.println("causou 10 de dano");
    }

    @Override
    public void apanhar(String tipoDano, double dano) {
        System.out.println("recebeu " + dano + " de dano");

    }

    @Override
    public void interagir() {
        System.out.println("Por que eu responderia meu inimigo???");

    }
}
