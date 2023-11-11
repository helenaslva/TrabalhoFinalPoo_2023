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
public class Despesa extends Lancamento {
    TipoDespesa tipoDespesa; 

    public Despesa(double valor, LocalDate data, TipoDespesa tipoDespesa) {
        super(valor, data);
        this.tipoDespesa = tipoDespesa; 
    }
}
