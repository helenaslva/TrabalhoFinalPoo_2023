/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author helenas Classe que representa um Lançamento do tipo despesa
 */
public class Despesa extends Lancamento {

    TipoDespesa tipoDespesa;

    /**
     * Construtor de uma classe que representa uma Despesa
     *
     * @param valor
     * @param data
     * @param tipoDespesa
     */
    public Despesa(double valor, LocalDate data, TipoDespesa tipoDespesa) {
        super(valor, data);
        this.tipoDespesa = tipoDespesa;
    }

    public TipoDespesa getTipoDespesa() {
        return tipoDespesa;
    }

    public void setTipoDespesa(TipoDespesa tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }

    @Override
    public String getTipo() {
        return this.getTipoDespesa().toString();
    }

    @Override
    public String getTipoLancamento() {
        return "Despesa";
    }

}
