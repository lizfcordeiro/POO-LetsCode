package QuartaLista;

public class Cobra implements Inimigo{
    @Override
    public void ataque() {
        System.out.println("causou 20 de dano");
    }

    @Override
    public void apanhar(String tipoDano, double dano) {
        if (tipoDano.equals("pancada")) {
            System.out.println("recebeu " + (dano*2) + " de dano");
        } else {
            System.out.println("recebeu " + (dano) + " de dano");
        }
    }

    @Override
    public void interagir() {
        System.out.println("Se você acender a chama a maldição acaba");
    }
}
