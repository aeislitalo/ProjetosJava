public class ServicoControleEstoque {
    public void adicionarEstoque(Medicamento medicamento, int quantidade) {
        medicamento.setQuantidade(medicamento.getQuantidade() + quantidade);
        System.out.println("Estoque atualizado com sucesso!");
    }
}
