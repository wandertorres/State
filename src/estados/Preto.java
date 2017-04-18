package estados;

import java.util.List;

import entidades.No;
import interfaci.Cor;

public class Preto extends Cor {

    @Override
    public void busca(No no, List<No> lista) {
        //
    }

    @Override
    public void assumiu(No no, List<No> lista) {
        lista.add(no);
    }
    
}
