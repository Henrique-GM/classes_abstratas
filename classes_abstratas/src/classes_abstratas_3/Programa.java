/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes_abstratas_3;

import entidades_3.Contribuentes;
import entidades_3.Individo;
import entidades_3.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Programa {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Contribuentes> lista = new ArrayList<>();
        
        System.out.print("Entre com o número de contribuentes: ");
        int numero = sc.nextInt();
        
        for (int i = 1; i <= numero; i++) {
            
            System.out.println("Contribuente #" + i + ":");
            
            System.out.print("Individual ou pessoa juridica (i/p)? ");
            Character escolha = sc.next().charAt(0);
            
            System.out.print("Nome: ");
            String nome = sc.next();
            
            System.out.print("Renda Anual: ");
            Double rendaAnual = sc.nextDouble();
            
            if (escolha == 'i') {
                
                System.out.print("Gastos com saúde: ");
                Double gastosSaude = sc.nextDouble();
                lista.add(new Individo(gastosSaude, nome, rendaAnual));                
            }
            
            if (escolha == 'p') {
                
                System.out.print("Número de empregados: ");
                Integer numeroDeEmpregados = sc.nextInt();
                lista.add(new PessoaJuridica(numeroDeEmpregados, nome, rendaAnual));
            }
            
        }
        
        System.out.println();
        
        System.out.println("IMPOSTOS PAGOS");
        
        for (Contribuentes contribuentes : lista) {      
            System.out.println(contribuentes.getNome() + ": $ " + String.format("%.2f", contribuentes.imposto()));    
        }
        
        double soma = 0.0;
        for (Contribuentes contribuentes : lista) {         
            soma += contribuentes.imposto();
        }
        
        System.out.println("TOTAL DE TAXAS: $ " + String.format("%.2f", soma));
        System.out.println();
        
        sc.close();
    }
}
