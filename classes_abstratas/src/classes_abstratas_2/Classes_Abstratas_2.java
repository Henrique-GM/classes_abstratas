/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes_abstratas_2;

import entidades.enums_2.Cor;
import entidades_2.Circulo;
import entidades_2.Forma;
import entidades_2.Retangulo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Classes_Abstratas_2 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Forma> lista = new ArrayList<>();
        
        System.out.print("Entre com um número de figuras: ");
        int numero = sc.nextInt();
        
        for (int i = 1; i <= numero; i++) {
            
            System.out.println("#" + i + " forma: ");
            System.out.print("Retângulo ou circulo (r/c)? ");
            char escolha = sc.next().charAt(0);
            
            System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
            Cor cor = Cor.valueOf(sc.next());
            
            if (escolha == 'r') {
                
                System.out.print("Largura: ");
                double largura = sc.nextDouble();
                
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                
                lista.add(new Retangulo(largura, altura, cor));
            }
            
            if (escolha == 'c') {
                
                System.out.print("Raio: ");
                double raio = sc.nextDouble();
                
                lista.add(new Circulo(raio, cor));
            }
        }
        
        System.out.println();
        System.out.println("ÁREAS DA FIGURA");
        
        for (Forma forma : lista) {
            
            System.out.println(String.format("%.2f", forma.area()));
        }
        
        sc.close();
    }
}
