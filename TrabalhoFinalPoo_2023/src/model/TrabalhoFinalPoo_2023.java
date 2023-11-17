/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author helenas
 */
public class TrabalhoFinalPoo_2023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
        ControleFinanceiro cf = new ControleFinanceiro("Helena");
        
        Importador importador = new Importador(cf);
        importador.carregarArquivo(new File("C:\\Users\\helenas\\Downloads\\teste.csv"));
        
        Despesa despesa = new Despesa(98.3, LocalDate.of(2025, 03, 12), TipoDespesa.EDUCACAO);
        cf.incluirDespesa(despesa);
       
         
       cf.listarReceitas();

        System.out.println(cf.listarLancamentosPorData());       
       
       
      
                


    }
    
}
