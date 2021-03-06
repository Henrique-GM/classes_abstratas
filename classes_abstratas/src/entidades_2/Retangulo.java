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
public class Retangulo extends Forma{

    private Double largura;
    private Double altura;

    public Retangulo() {
        super();
    }
    
    public Retangulo(Double largura, Double altura, Cor cor) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    @Override
    public Double area() {
        
        return largura * altura;
    }
}