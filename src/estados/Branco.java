package estados;

import java.util.List;

import entidades.No;
import interfaci.Cor;

public class Branco extends Cor {

    @Override
    public void busca(No no, List<No> lista) {
        no.setCor(new Cinza(), lista);
    }
    
    @Override
    public void assumiu(No no, List<No> lista) {
        //
    }
    
}
