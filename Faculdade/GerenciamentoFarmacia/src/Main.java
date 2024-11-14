public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Medicamento
        Medicamento medicamento1 = new Medicamento("Paracetamol", 5.0, "Farmaceutica A", 50);
        Medicamento medicamento2 = new Medicamento("Ibuprofeno", 10.0, "Farmaceutica B", 30);

        // Criando instância de Cliente
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");

        // Criando instância de ReceitaMedica
        ReceitaMedica receita1 = new ReceitaMedica("RX123", cliente1, medicamento1);

        // Repositório de medicamentos
        RepositorioMedicamentos repositorioMedicamentos = new RepositorioMedicamentos();
        repositorioMedicamentos.adicionarMedicamento(medicamento1);
        repositorioMedicamentos.adicionarMedicamento(medicamento2);

        // Repositório de receitas médicas
        RepositorioReceitas repositorioReceitas = new RepositorioReceitas();
        repositorioReceitas.adicionarReceita(receita1);

        // Serviço de Controle de Estoque
        ServicoControleEstoque controleEstoque = new ServicoControleEstoqueImpl();

        // Atualizando estoque de um medicamento
        controleEstoque.atualizarEstoque(medicamento1, -5); // Reduzindo 5 unidades do estoque
        controleEstoque.atualizarEstoque(medicamento2, 10);  // Adicionando 10 unidades ao estoque

        // Serviço de Venda
        ServicoVenda servicoVenda = new ServicoVendaImpl();

        // Realizando venda
        servicoVenda.venderMedicamento(medicamento1, cliente1);

        // Consultando repositório de medicamentos
        Medicamento medicamentoBuscado = repositorioMedicamentos.buscarMedicamento("Paracetamol");
        if (medicamentoBuscado != null) {
            System.out.println("Medicamento encontrado: " + medicamentoBuscado.getNome() + ", Estoque: " + medicamentoBuscado.getQuantidadeEstoque());
        } else {
            System.out.println("Medicamento não encontrado.");
        }

        // Consultando repositório de receitas médicas
        ReceitaMedica receitaBuscada = repositorioReceitas.buscarReceita("RX123");
        if (receitaBuscada != null) {
            System.out.println("Receita encontrada para o cliente: " + receitaBuscada.getCliente().getNome() + ", Medicamento: " + receitaBuscada.getMedicamento().getNome());
        } else {
            System.out.println("Receita não encontrada.");
        }
    }
}