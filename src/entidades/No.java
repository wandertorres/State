package entidades;

import java.util.ArrayList;
import java.util.List;

import estados.Branco;
import interfaci.Cor;

public class No {
    private String valor;
    private List<No> adjacentes;
    private Cor cor;
    
    public No(String p_valor) {
        adjacentes = new ArrayList<>();
        valor = p_valor;
        cor = new Branco();
    }
    
    public void buscaProfundidade(List<No> lista) {
        cor.busca(this, lista);
    }
    
    public void addAdjacente(No no) {
        adjacentes.add(no);
    }

    public List<No> getAdjacentes() {
        return adjacentes;
    }

    public void setCor(Cor cor, List<No> lista) {
        this.cor = cor;
        cor.assumiu(this, lista);
    }
    
    @Override
    public String toString() {
        return valor;
    }
    
}
