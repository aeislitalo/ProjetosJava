public class ServicoVenda {
    public void vender(Medicamento medicamento, int quantidade) {
        if (medicamento.getQuantidade() >= quantidade) {
            medicamento.setQuantidade(medicamento.getQuantidade() - quantidade);
            System.out.println("Venda realizada com sucesso!");
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }
}
