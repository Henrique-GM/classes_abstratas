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
public class PessoaJuridica extends Contribuentes{

    private Integer numeroDeEmpregados;

    public PessoaJuridica() {
        super();
    }
    
    public PessoaJuridica(Integer numeroDeEmpregados, String nome, Double rendaAnual) {
        super(nome, rendaAnual);
        this.numeroDeEmpregados = numeroDeEmpregados;
    }

    public Integer getNumeroDeEmpregados() {
        return numeroDeEmpregados;
    }

    public void setNumeroDeEmpregados(Integer numeroDeEmpregados) {
        this.numeroDeEmpregados = numeroDeEmpregados;
    }
    
    @Override
    public Double imposto() { 
        
        if (numeroDeEmpregados > 10) {
            
            return getRendaAnual() * 0.14;
        }
        
        else {
            
            return getRendaAnual() * 0.16;
        }
    }
   
}
