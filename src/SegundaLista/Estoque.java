package SegundaLista;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    public String nome;
    private int id;
    private List<Produto> produtosEmEstoque = new ArrayList<>();

    public void criarProduto(String nome, String sessao, String tipo, String marca, int quantidadeEmEstoque) {
        Produto produto = new Produto(nome, sessao, tipo, marca, quantidadeEmEstoque);
        produtosEmEstoque.add(produto);
        System.out.println(produto);
    }

    public void lerLista() {
        for (Produto p : produtosEmEstoque) {
            System.out.println(p);
        }
    }

    public void lerProduto(String nome) {
        for (Produto p : produtosEmEstoque) {
            if (p.getNome().equals(nome)) {
                System.out.println(p);
            }
        }
    }

    public void deletarProduto(int idProduto) {
        produtosEmEstoque.removeIf(x -> x.getIdProduto() == idProduto);
    }

    public void updateProduto(String nome, String novoNome) {
        for (Produto p : produtosEmEstoque) {
            if (p.getNome().equals(nome)) {
                p.setNome(novoNome);
            }
        }
    }
}