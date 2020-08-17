/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import models.bean.Livro;

/**
 *
 * @author igorbavand
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livro l = new Livro();
        CadastroDeLivros(l);
        mostrarDetalhes(l);
    }

    public static void CadastroDeLivros(Livro l){
        l.setTitulo("Fúrias nos mares");
        l.setDescricao("Livro de aventura");
        l.setValor(20.50);
        l.setNomeAutor("Machado de Assis");
    }
    
    public static void mostrarDetalhes(Livro l){
        System.out.println(l.getTitulo());
        System.out.println(l.getDescricao());
        System.out.println(l.getValor());  
        System.out.println(l.getNomeAutor());
    }
    
}
