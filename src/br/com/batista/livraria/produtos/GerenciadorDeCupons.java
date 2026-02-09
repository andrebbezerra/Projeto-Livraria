package br.com.batista.livraria.produtos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author andre
 */
public class GerenciadorDeCupons {
    
    private Set<String> cupons;
    
    public GerenciadorDeCupons(){
        this.cupons = new HashSet<String>();
        cupons.addAll(Arrays.asList("CUP74","CUP158","CUP14"));
    }
    
        public boolean validaCupom(String cupom){
            return this.cupons.contains(cupom);
        }
}
