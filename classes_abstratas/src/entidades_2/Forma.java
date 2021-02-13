/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades_2;

import entidades.enums_2.Cor;

/**
 *
 * @author Henrique
 */
public abstract class Forma {
    
    private Cor cor;
    
    public Forma() {
    }

    public Forma(Cor cor) {
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }
    
    public abstract Double area();
}
