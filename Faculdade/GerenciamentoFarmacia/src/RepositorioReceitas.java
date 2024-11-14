import java.util.ArrayList;
import java.util.List;

public class RepositorioReceitas {
    private List<ReceitaMedica> receitas = new ArrayList<>();

    public void adicionarReceita(ReceitaMedica receita) {
        receitas.add(receita);
    }

    public ReceitaMedica buscarReceita(String codigoReceita) {
        for (ReceitaMedica receita : receitas) {
            if (receita.getCodigoReceita().equals(codigoReceita)) {
                return receita;
            }
        }
        return null;
    }
}