/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades_3;

/**
 *
 * @author Henrique
 */
public class Individo extends Contribuentes{

    private Double gastosComSaude;

    public Individo() {
        super();
    }
    
    public Individo(Double gastosComSaude, String nome, Double rendaAnual) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }
    
    @Override
    public Double imposto() {
        
        double taxaBasica;
        
        if (getRendaAnual() < 20000.0) {
            
            taxaBasica = getRendaAnual() * 0.15;
        }
        
        else {
            
            taxaBasica = getRendaAnual() * 0.25;
        }
        
        taxaBasica -= (getGastosComSaude() * 0.5);
        
        if (taxaBasica < 0.0) {
            
            return 0.0;
        }
        
        return taxaBasica;
    }
    
}
