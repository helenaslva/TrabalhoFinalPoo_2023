/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author helenas
 */
public class Importador {
    
     private Lancamento lancamento; 
    public Importador(Lancamento pais) {
        this.lancamento = lancamento; 
    }
    
    public void carregarArquivo(File arquivo) throws FileNotFoundException{
        try(Scanner sc = new Scanner(arquivo, "UTF-8")){  
          
            while(sc.hasNextLine()){
                String linha = sc.nextLine();
                String[] dados = linha.split(";");
                
                
            }
        }
    }
    
}
