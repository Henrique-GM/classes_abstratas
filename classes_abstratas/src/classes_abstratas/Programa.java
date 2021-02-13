/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes_abstratas;

import entidades.Conta;
import entidades.ContaNegocio;
import entidades.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author Henrique
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        List<Conta> lista = new ArrayList<>();
        
        lista.add(new ContaPoupanca(0.01, 1001, "Alex", 500.00));
        lista.add(new ContaNegocio(1000.0, 1002, "Maria", 400.00));
        
        double soma = 0.0;
        
        for (Conta conta : lista) {
            
            soma += conta.getSaldo();
        }
        
        System.out.printf("Saldo total: %.2f\n", soma);
        
        for (Conta conta : lista) {
            
            conta.deposito(10.0);
        }
        
        for (Conta conta : lista) {
            System.out.printf("Atualização do saldo para %d: %.2f\n", conta.getNumero(), conta.getSaldo());
        }        
    }   
}
