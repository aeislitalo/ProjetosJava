import java.util.ArrayList;
import java.util.List;

public class RepositorioReceitas {
    private List<ReceitaMedica> receitas = new ArrayList<>();

    public void adicionarReceita(ReceitaMedica receita) {
        receitas.add(receita);
    }

    public ReceitaMedica buscarReceita(String codigo) {
        for (ReceitaMedica receita : receitas) {
            if (receita.getCodigo().equals(codigo)) {
                return receita;
            }
        }
        return null;
    }
}
