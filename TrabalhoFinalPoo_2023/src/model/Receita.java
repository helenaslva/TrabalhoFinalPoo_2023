/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author helenas
 * Classe que representa um Lançamento do tipo receita
 */
public class Receita extends Lancamento{

    
    TipoReceita tipoReceita; 

    public TipoReceita getTipoReceita() {
        return tipoReceita;
    }

    public void setTipoReceita(TipoReceita tipoReceita) {
        this.tipoReceita = tipoReceita;
    }
/**
 * Construtor de uma classe que representa uma receita
 * @param valor
 * @param data
 * @param tipoReceita 
 */
    public Receita(double valor, LocalDate data, TipoReceita tipoReceita) {
        super(valor, data);
        this.tipoReceita = tipoReceita; 
    }

    @Override
    public String getTipo() {
        return this.getTipoReceita().toString();
    }

    @Override
    public String getTipoLancamento() {
        return "Receita";
    }
    
}
