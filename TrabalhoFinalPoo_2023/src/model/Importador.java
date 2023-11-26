/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author helenas
 * Classe responsável por ler e importar os dados de um arquivo para um Controle Financeiro
 */
public class Importador {
    
    private ControleFinanceiro controleFinanceiro; 
    public Importador(ControleFinanceiro controleFinanceiro) {
        this.controleFinanceiro = controleFinanceiro; 
    }
    /**
     * Método responsável por carregar um arquivo e armazenar seus dados
     * @param arquivo
     * @throws FileNotFoundException
     * @throws IOException 
     * 
     * 
     */
    public void carregarArquivo(File arquivo) throws FileNotFoundException, IOException{
        try(Scanner sc = new Scanner(arquivo, "UTF-8")){  
          
            while(sc.hasNextLine()){
                String linha = sc.nextLine();
                if(!linha.equals("")){
                    String[] dados = linha.split(",");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                
                if(dados[0].equals("Despesa")){
                    Despesa novaDespesa = new Despesa(Double.parseDouble(dados[2]), LocalDate.parse(dados[1], formatter), TipoDespesa.valueOf(dados[3]));
                    controleFinanceiro.incluirDespesa(novaDespesa);
                }else if(dados[0].equals("Receita")){
                    Receita novaReceita =  new Receita(Double.parseDouble(dados[2]), LocalDate.parse(dados[1], formatter), TipoReceita.valueOf(dados[3]));
                    controleFinanceiro.inlcuirReceita(novaReceita);
                }
                }  
            }
        }
    }
    
    
}
