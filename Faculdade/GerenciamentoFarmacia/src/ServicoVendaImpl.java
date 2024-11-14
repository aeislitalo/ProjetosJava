public class ServicoVendaImpl implements ServicoVenda {
    @Override
    public void venderMedicamento(Medicamento medicamento, Cliente cliente) {
        System.out.println("Venda realizada para o cliente: " + cliente.getNome());
    }
}