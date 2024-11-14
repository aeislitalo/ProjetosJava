public class Medicamento extends Produto {
    private String fabricante;
    private int quantidadeEstoque;

    public Medicamento(String nome, double preco, String fabricante, int quantidadeEstoque) {
        super(nome, preco);
        this.fabricante = fabricante;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Medicamento() {}

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.1; // Exemplo: preço com 10% de acréscimo
    }
}