package SegundaLista;

public class Produto {
    private String nome;
    private String sessao;
    private String tipo;
    private String marca;
    private int quantidadeEmEstoque;
    private int idProduto;
    private static int contador = 1;

    public Produto(String nome, String sessao, String tipo, String marca, int quantidadeEmEstoque) {
        this.nome = nome;
        this.sessao = sessao;
        this.tipo = tipo;
        this.marca = marca;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.idProduto = contador;
        contador++;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", sessao='" + sessao + '\'' +
                ", tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", quantidadeEmEstoque=" + quantidadeEmEstoque +
                ", idProduto=" + idProduto +
                '}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSessao() {
        return sessao;
    }

    public void setSessao(String sessao) {
        this.sessao = sessao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Produto.contador = contador;
    }
}
