/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author helenas
 */
public class ControleFinanceiro {
    private String titular;
    private double saldo; 
    private ArrayList<Lancamento> lancamentos; 

   

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void inlcuirReceita(Lancamento receita){
        if(receita instanceof Receita){
            this.lancamentos.add(receita);
            this.setSaldo(this.getSaldo() + receita.getValor());
        }else{
            throw new IllegalArgumentException("O lançamento não é uma receita");
        }
    }
    
    public void incluirDespesa(Lancamento despesa){
        if(despesa instanceof Despesa){
            this.lancamentos.add(despesa);
            this.setSaldo(this.getSaldo() - despesa.getValor());
        }else{
            throw new IllegalArgumentException("O lançamento não é uma despesa");
        }
    }
    
    public ArrayList<Lancamento> listarReceitas(){
        ArrayList<Lancamento> receitas = new ArrayList();
        for(Lancamento l: lancamentos){
            if(l instanceof Receita){
                receitas.add(l);
            }
        }
        return receitas;
    }
    
    public ArrayList<Lancamento> listarDespesas(){
        ArrayList<Lancamento> despesas = new ArrayList();
        for(Lancamento l: lancamentos){
            if(l instanceof Despesa){
                despesas.add(l);
            }
        }
        return despesas;
    }
    
     public ArrayList<Lancamento> getLancamentos() {
        return lancamentos;
    }
}
