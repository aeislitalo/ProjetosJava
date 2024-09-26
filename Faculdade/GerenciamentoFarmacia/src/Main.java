public class Main {
    public static void main(String[] args) {
        Medicamento medicamento = new Medicamento("Dipirona", "Fabricante 1", 5.0, 100);
        Cliente cliente = new Cliente("Ítalo Santos", "12345678900");
        ReceitaMedica receita = new ReceitaMedica("123", cliente, medicamento);

        RepositorioMedicamentos repoMedicamentos = new RepositorioMedicamentos();
        repoMedicamentos.adicionarMedicamento(medicamento);

        RepositorioReceitas repoReceitas = new RepositorioReceitas();
        repoReceitas.adicionarReceita(receita);

        ServicoVenda servicoVenda = new ServicoVenda();
        servicoVenda.vender(medicamento, 2);

        ServicoControleEstoque servicoEstoque = new ServicoControleEstoque();
        servicoEstoque.adicionarEstoque(medicamento, 50);
    }
}
