package estados;

import java.util.List;

import entidades.No;
import interfaci.Cor;

public class Cinza extends Cor {

    @Override
    public void busca(No no, List<No> lista) {
        //
    }

    @Override
    public void assumiu(No no, List<No> lista) {
        for(No adj : no.getAdjacentes()) {
            adj.buscaProfundidade(lista);
        }
        no.setCor(new Preto(), lista);
    }
    
}
