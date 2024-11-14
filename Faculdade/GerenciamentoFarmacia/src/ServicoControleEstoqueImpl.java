public class ServicoControleEstoqueImpl implements ServicoControleEstoque {
    @Override
    public void atualizarEstoque(Medicamento medicamento, int quantidade) {
        int novoEstoque = medicamento.getQuantidadeEstoque() + quantidade;
        medicamento.setQuantidadeEstoque(novoEstoque);
        System.out.println("Estoque atualizado para: " + novoEstoque);
    }
}