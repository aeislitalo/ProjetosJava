import java.util.ArrayList;
import java.util.List;

public class RepositorioMedicamentos {
    private List<Medicamento> medicamentos = new ArrayList<>();

    public void adicionarMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
    }

    public Medicamento buscarMedicamento(String nome) {
        for (Medicamento medicamento : medicamentos) {
            if (medicamento.getNome().equals(nome)) {
                return medicamento;
            }
        }
        return null;
    }
}
