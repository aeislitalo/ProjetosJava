public class ReceitaMedica {
    private String codigo;
    private Cliente cliente;
    private Medicamento medicamento;

    public ReceitaMedica(String codigo, Cliente cliente, Medicamento medicamento) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.medicamento = medicamento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
