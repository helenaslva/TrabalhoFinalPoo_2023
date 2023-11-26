/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.time.LocalDate;
import java.util.Date;
/**
 *
 * @author helenas
 * Classe que representa um lançamento.
 */
public abstract class Lancamento {
    private LocalDate data;
     private double valor;

    public Lancamento() {
    }

    public Lancamento(double valor, LocalDate data) {
        this.valor = valor;
        this.data = data;
    }
   

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor <= 0){
            throw new IllegalArgumentException("O valor não pode ser negativo");
        }else{
            this.valor = valor;
        }
        
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    
    public abstract String getTipo();
    public abstract String getTipoLancamento();

}
