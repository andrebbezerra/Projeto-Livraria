package br.com.batista.livraria.produtos;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author andre
 */
public class GerenciadorDeCupons {
    
    private Map<String, Double> cupons;
    
    public GerenciadorDeCupons(){
        this.cupons = new HashMap<>();
        cupons.put("CUP74", 10.0);
        cupons.put("CUP158", 20.0);
        cupons.put("CUP14", 5.0);
    }
    
        public Double validaCupom(String cupom){
            return this.cupons.get(cupom);
        }
}
