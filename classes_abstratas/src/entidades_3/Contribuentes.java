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
public abstract class Contribuentes {
    
    private String nome;
    private Double rendaAnual;

    public Contribuentes() {
    }
    
    public Contribuentes(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }
    
    public abstract Double imposto(); 
     
}
