/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades_2;

import entidades.enums_2.Cor;
import static java.lang.Math.PI;

/**
 *
 * @author Henrique
 */
public class Circulo extends Forma{

    private Double raio;

    public Circulo() {
        super();
    }

    public Circulo(Double raio, Cor cor) {
        super(cor);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
       
    @Override
    public Double area() {
 
        return Math.PI * raio * raio;
    }
}
