/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author helenas
 */
public class Receita extends Lancamento{
    TipoReceita tipoReceita; 

    public Receita(double valor, LocalDate data, TipoReceita tipoReceita) {
        super(valor, data);
        this.tipoReceita = tipoReceita; 
    }
    
}
