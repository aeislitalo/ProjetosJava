public class ReceitaMedica {
    private String codigoReceita;
    private Cliente cliente;
    private Medicamento medicamento;

    public ReceitaMedica(String codigoReceita, Cliente cliente, Medicamento medicamento) {
        this.codigoReceita = codigoReceita;
        this.cliente = cliente;
        this.medicamento = medicamento;
    }

    public ReceitaMedica() {}

    public String getCodigoReceita() {
        return codigoReceita;
    }

    public void setCodigoReceita(String codigoReceita) {
        this.codigoReceita = codigoReceita;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
}