package SegundaLista;

public class Questao1 {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        estoque.criarProduto("Perfume", "Perfumaria", "Feminino", "Dior", 130);

        estoque.lerLista();

        estoque.lerProduto("Perfume");

        estoque.updateProduto("Perfume", "Colônia");

        estoque.lerProduto("Colônia");

        estoque.deletarProduto(1);
    }
}
