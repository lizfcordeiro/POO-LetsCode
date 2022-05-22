package QuartaLista;

public class Gigante implements Inimigo{
    @Override
    public void ataque() {
        System.out.println("causou 25 de dano");
        System.out.println("O seu personagem está atordoado");
    }

    @Override
    public void apanhar(String tipoDano, double dano) {
        if (tipoDano.equals("fogo")) {
            System.out.println("recebeu " + (dano*2) + " de dano");
        } else {
            System.out.println("recebeu " + (dano) + " de dano");
        }
    }
    @Override
    public void interagir() {
        System.out.println("Me desculpe");
    }
}
